package io.github.omarmahamid;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class HeapDumpReport {


    public static void report(Map<String, ClassMetaData> classMetaDataMap,
                              String filePath,
                              long limit) {

        String header = "+------------+-----------+-------------+-----------------------------------------------------------+\n" +
                "| Total size | Instances | Class name                                                |\n" +
                "+------------+-----------+-------------+-----------------------------------------------------------+";


        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {

            String title = String.format("Top %s allocated classes:\n", limit);
            writer.println(title);
            writer.println(header);

            classMetaDataMap.entrySet().stream()
                    .sorted((entry1, entry2) -> Double.compare(entry2.getValue().getSize(), entry1.getValue().getSize()))
                    .limit(limit)
                    .forEach(entry -> {

                        ClassMetaData metaData = entry.getValue();

                        String className = metaData.getClassName();
                        double totalSizeInBytes = metaData.getSize();
                        long instances = metaData.getCount();

                        writer.printf("| %15.2f MB | %9d | %-59s |\n",
                                totalSizeInBytes, instances, className);
                    });

            writer.println("+------------+-----------+-------------+-----------------------------------------------------------+");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
