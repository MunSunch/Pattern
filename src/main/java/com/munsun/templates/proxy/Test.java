package com.munsun.templates.proxy;

public class Test {
    public static void main(String[] args) {
        Database database = new PostgresDB();
        Database proxy = new Proxy(database);
        proxy.connect("academy");
    }
}
