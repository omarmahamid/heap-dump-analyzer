package io.github.omarmahamid;

import org.netbeans.lib.profiler.heap.Heap;
import org.netbeans.lib.profiler.heap.HeapFactory;
import org.netbeans.lib.profiler.heap.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class FastHeapAnalyzerStrategy implements Analyzer{

    private static final Logger LOGGER = LoggerFactory.getLogger(FastHeapAnalyzerStrategy.class);

    private final Heap heap;

    public FastHeapAnalyzerStrategy(String filename) throws IOException {
        this(new File(filename));
    }

    private FastHeapAnalyzerStrategy(File file) throws IOException {
        this(HeapFactory.createFastHeap(file));
    }

    private FastHeapAnalyzerStrategy(Heap heap) {
        this.heap = heap;
    }

    @Override
    public File analyze() {

        long startTime = System.currentTimeMillis();
        LOGGER.info("Analyzing heap dump...");

        Map<String, List<Instance>> sortedByListSize =
                StreamSupport.stream(heap.getAllInstances().spliterator(), false)
                        .collect(Collectors.groupingBy(
                                x -> x.getJavaClass().getName(),
                                Collectors.toList()
                        )).entrySet()
                        .stream()
                        .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));



        Map<String, ClassMetaData> metaDataMap = HeapSizeComputing.compute(sortedByListSize);

        HeapDumpReport.report(metaDataMap, "/Users/omarmahamid/Documents/GitHub/heap-dump-analyzer/dump.txt");
        LOGGER.info("Finish analyzing heap dump in {} ms", System.currentTimeMillis() - startTime);
        return null;
    }
}
