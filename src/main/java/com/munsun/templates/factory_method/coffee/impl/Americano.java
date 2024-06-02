package com.munsun.templates.factory_method.coffee.impl;

import com.munsun.templates.factory_method.coffee.CoffeeAbstract;

import java.util.List;

public class Americano extends CoffeeAbstract {
    private static final List<String> DEFAULT_INGREDIENTS = List.of("молотый кофе", "вода", "сахар");

    public Americano() {
        super(DEFAULT_INGREDIENTS);
    }
}
