package com.hemebiotech.analytics;
import java.util.TreeMap;
/**
 *This class sorts the symptoms in alphabetical order before incrementing them.
 *
 * */

public class SortAndIncrementSymptoms {
    private ReadSymptomDataFromFile readSymptomDataFromFile;
    /**
     * get the list of symptoms from the symptoms.txt file
     **/
    public SortAndIncrementSymptoms() {
        readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");

    }
    /**
     * sorts symptoms alphabetically and adds plus 1 to each symptom recurrence
     *
     **/
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
