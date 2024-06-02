package com.munsun.templates.factory_method.factory.impl;

import com.munsun.templates.factory_method.coffee.impl.Americano;
import com.munsun.templates.factory_method.coffee.impl.Espresso;
import com.munsun.templates.factory_method.coffee.CoffeeAbstract;
import com.munsun.templates.factory_method.factory.Factory;
import com.munsun.templates.factory_method.factory.impl.enums.CoffeeType;

public class DefaultCoffeeFactory implements Factory {
    public CoffeeAbstract getCoffee(CoffeeType type) {
        switch (type) {
            case ESPRESSO -> {
                return getEspresso();
            }
            case AMERICANO -> {
                return getAmericano();
            }
        }
        return null;
    }

    private CoffeeAbstract getAmericano() {
        return new Americano();
    }

    private CoffeeAbstract getEspresso() {
        return new Espresso();
    }
}
