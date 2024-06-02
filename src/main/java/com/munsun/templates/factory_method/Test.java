package com.munsun.templates.factory_method;

import com.munsun.templates.factory_method.coffee.CoffeeAbstract;
import com.munsun.templates.factory_method.factory.Factory;
import com.munsun.templates.factory_method.factory.impl.DefaultCoffeeFactory;
import com.munsun.templates.factory_method.factory.impl.enums.CoffeeType;

public class Test {
    public static void main(String[] args) {
        Factory factory = new DefaultCoffeeFactory();
        CoffeeAbstract coffee1 = factory.getCoffee(CoffeeType.AMERICANO);
        CoffeeAbstract coffee2 = factory.getCoffee(CoffeeType.ESPRESSO);
    }
}
