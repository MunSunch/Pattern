package com.munsun.templates.singleton.impl.providers.impl;

import com.munsun.templates.singleton.impl.providers.Printer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File implements Printer {
    private String filePath;

    public File(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void print(String info) {
        char newLine = '\n';
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(info);
            writer.write(newLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
