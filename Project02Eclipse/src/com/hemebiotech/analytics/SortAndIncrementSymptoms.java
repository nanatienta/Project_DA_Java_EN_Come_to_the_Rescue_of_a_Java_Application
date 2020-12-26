package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SortAndIncrementSymptoms {
    private ReadSymptomDataFromFile readSymptomDataFromFile;

    public SortAndIncrementSymptoms() {
        readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");

    }

    public TreeMap<String, Integer> countSymptoms() {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String symptom : readSymptomDataFromFile.GetSymptoms()) {
            if (map.get(symptom) == null) {
                map.put(symptom, 1);
            } else {
                map.put(symptom, map.get(symptom) + 1);
            }
        }
        return map;
    }
}
