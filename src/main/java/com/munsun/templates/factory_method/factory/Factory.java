package com.munsun.templates.factory_method.factory;

import com.munsun.templates.factory_method.coffee.CoffeeAbstract;
import com.munsun.templates.factory_method.factory.impl.enums.CoffeeType;

public interface Factory {
    CoffeeAbstract getCoffee(CoffeeType type);
}
