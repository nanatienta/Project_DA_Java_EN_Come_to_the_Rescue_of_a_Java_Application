package com.hemebiotech.analytics;
import java.util.TreeMap;

public class AnalyticsCounter {
    public static void main(String args[]) {
        SortAndIncrementSymptoms sortAndIncrementSymptoms = new SortAndIncrementSymptoms();
        TreeMap<String, Integer> countSymptoms = sortAndIncrementSymptoms.countSymptoms();
        ReadResultOut readResultOut = new ReadResultOut();
        readResultOut.SaveSymptomsResult(countSymptoms);
    }

    }



