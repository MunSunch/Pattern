package com.munsun.templates.proxy;

public class Test {
    public static void main(String[] args) {
        Database proxy = new Proxy(new PostgresDB());
        proxy.connect("academy");
    }
}
