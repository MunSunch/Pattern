package com.munsun.templates.factory_method.coffee.impl;

import com.munsun.templates.factory_method.coffee.CoffeeAbstract;

import java.util.List;

public class Espresso extends CoffeeAbstract {
    private static final List<String> DEFAULT_INGREDIENTS = List.of("молотый чёрный кофе", "сахар", "соль", "вода");
    public Espresso() {
        super(DEFAULT_INGREDIENTS);
    }
}
