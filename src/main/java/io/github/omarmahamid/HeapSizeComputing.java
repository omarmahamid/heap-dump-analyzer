package io.github.omarmahamid;

import org.netbeans.lib.profiler.heap.Instance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeapSizeComputing {


    private HeapSizeComputing() {
        throw new IllegalStateException("Utility class");
    }

    public static Map<String, ClassMetaData> compute(Map<String, List<Instance>> classInstancesByName) {
        Map<String, ClassMetaData> result = new HashMap<>();

        classInstancesByName.forEach((className, instances) -> {
            double totalSizeInMB = instances.stream()
                    .mapToDouble(instance -> instance.getSize() / (1024.0 * 1024.0))
                    .sum();

            String packageName = getPackageName(className);

            result.put(className, new ClassMetaData(className, packageName, totalSizeInMB, instances.size()));
        });

        return result;
    }

    private static String getPackageName(String className) {
        try {
            return className.substring(0, className.lastIndexOf('.'));
        }catch (Exception e){
            // currently ignore those
        }
        return null;
    }

}
