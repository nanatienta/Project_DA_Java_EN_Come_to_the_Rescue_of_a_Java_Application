package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Reader {
    static BufferedWriter getBufferedWriter(FileWriter writer) {
        BufferedWriter buffer = new BufferedWriter(writer);
        return buffer;
    }
}
