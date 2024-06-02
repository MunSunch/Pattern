package com.munsun.templates.singleton;

import com.munsun.templates.factory_method.coffee.CoffeeAbstract;
import com.munsun.templates.factory_method.factory.Factory;
import com.munsun.templates.factory_method.factory.impl.DefaultCoffeeFactory;
import com.munsun.templates.factory_method.factory.impl.enums.CoffeeType;
import com.munsun.templates.singleton.impl.LazyLogger;
import com.munsun.templates.singleton.impl.providers.impl.Console;
import com.munsun.templates.singleton.impl.providers.impl.File;
import com.munsun.templates.singleton.impl.providers.impl.InMemoryDataStorage;

public class Main {
    public static void main(String[] args) {
        InMemoryDataStorage storage = new InMemoryDataStorage();
        Logger logger = LazyLogger.getLogger()
                        .addPrinter(new Console())
                        .addPrinter(new File("logs.txt"))
                        .addPrinter(storage);
    }
}