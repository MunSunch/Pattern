package com.munsun.templates.singleton.impl.providers.impl;

import com.munsun.templates.singleton.impl.providers.Printer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDataStorage implements Printer {
    private List<String> logs = new ArrayList<>();
    @Override
    public void print(String info) {
        logs.add(info);
    }

    public List<String> getData() {
        return new ArrayList<>(logs);
    }
}
