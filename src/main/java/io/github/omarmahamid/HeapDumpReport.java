package io.github.omarmahamid;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class HeapDumpReport {


    public static void report(Map<String, ClassMetaData> classMetaDataMap, String filePath) {

        String header = "+------------+-----------+-------------+-----------------------------------------------------------+\n" +
                "| Total size | Instances |     Largest | Class name                                                |\n" +
                "+------------+-----------+-------------+-----------------------------------------------------------+";


        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Top 20 allocated classes:\n");
            writer.println(header);

            classMetaDataMap.entrySet().stream()
                    .sorted((entry1, entry2) -> Double.compare(entry2.getValue().getSize(), entry1.getValue().getSize()))
                    .limit(20)
                    .forEach(entry -> {

                        ClassMetaData metaData = entry.getValue();

                        String className = metaData.getClassName();
                        double totalSizeInBytes = metaData.getSize();
                        long instances = metaData.getCount();

                        String largestInstanceSize = "100.00KiB";

                        writer.printf("| %15.2f | %9d | %11s | %-59s |\n",
                                totalSizeInBytes, instances, largestInstanceSize, className);
                    });

            writer.println("+------------+-----------+-------------+-----------------------------------------------------------+");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
