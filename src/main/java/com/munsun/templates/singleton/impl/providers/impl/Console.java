package com.munsun.templates.singleton.impl.providers.impl;

import com.munsun.templates.singleton.impl.providers.Printer;

public class Console implements Printer {
    @Override
    public void print(String info) {
        System.out.println(info);
    }
}
