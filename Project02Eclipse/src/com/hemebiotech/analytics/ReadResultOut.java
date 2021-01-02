package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ReadResultOut {
    public  ReadResultOut(TreeMap<String, Integer> countSymptoms) throws IOException {
        FileWriter writer = new FileWriter ("result.out");
        BufferedWriter buffer = new BufferedWriter(writer);
        for(Map.Entry<String,Integer> entry : countSymptoms.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            buffer.write(key + " => " + value);
            System.out.println(key + " => " + value);
        }
        buffer.close();
    }
}
