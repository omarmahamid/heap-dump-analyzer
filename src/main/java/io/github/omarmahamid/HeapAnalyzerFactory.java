package io.github.omarmahamid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class HeapAnalyzerFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(HeapAnalyzerFactory.class);

    private HeapAnalyzerFactory() {
        throw new IllegalStateException("Utility class");
    }

    static Analyzer createAnalyzer(String filename) {
        try {
            return new FastHeapAnalyzerStrategy(filename);
        }catch (IOException e){
            LOGGER.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
