package io.github.omarmahamid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeapDumpAnalyzer {

    private static final Logger LOGGER = LoggerFactory.getLogger(HeapDumpAnalyzer.class);


    public static void main(String[] args) {


//        if (args.length != 1) {
//            LOGGER.info("Usage: java HeapDumpAnalyzer <file> see Readme.md");
//            throw new RuntimeException("Usage: java HeapDumpAnalyzer <file> see Readme.md");
//        }

//        String filename = args[0];



        Analyzer analyzer = HeapAnalyzerFactory.createAnalyzer("/Users/omarmahamid/Desktop/heap-2024-10-16-00-113685722484926529872.hprof");
        analyzer.analyze();

    }

}
