package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    static FileWriter getFileWriter() throws IOException {
        FileWriter writer = new FileWriter ("result.out");
        return writer;
    }
}
