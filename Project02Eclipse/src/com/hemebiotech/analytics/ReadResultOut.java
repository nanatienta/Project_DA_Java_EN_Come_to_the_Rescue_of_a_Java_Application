package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * this class read and save the result.out
 *
 * @see SortAndIncrementSymptoms
 */
public class ReadResultOut {
    public ReadResultOut() {
    }

    public void SaveSymptomsResult(TreeMap<String, Integer> countSymptoms) {
        FileWriter writer;
        try {
            writer = new FileWriter("result.out");
            BufferedWriter buffer = new BufferedWriter(writer);
            for (Map.Entry<String, Integer> entry : countSymptoms.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                buffer.write(key + " => " + value);
                System.out.println(key + " => " + value);
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
