package io.github.omarmahamid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HeapDumpAnalyzer {

    private static final Logger LOGGER = LoggerFactory.getLogger(HeapDumpAnalyzer.class);

    public static void main(String[] args) {


        if (args.length < 1) {
            LOGGER.info("Usage: java HeapDumpAnalyzer <file> see Readme.md");
            throw new RuntimeException("Usage: java HeapDumpAnalyzer <file> see Readme.md");
        }

        String heapDumpFileName = args[0];
        long limit;
        if (args.length > 2) {
            limit = Long.parseLong(args[1]);
        }else {
            throw new RuntimeException("Usage: java HeapDumpAnalyzer <file> see Readme.md");
        }

        String outputFilename;
        if (args.length == 3){
            outputFilename = args[2];
        }else {
            throw new RuntimeException("Usage: java HeapDumpAnalyzer <file> see Readme.md");
        }

        Analyzer analyzer = HeapAnalyzerFactory.createAnalyzer(heapDumpFileName);
        analyzer.analyze(limit, outputFilename);

    }

}
