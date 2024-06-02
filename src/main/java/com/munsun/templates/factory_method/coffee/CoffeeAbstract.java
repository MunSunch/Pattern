package com.munsun.templates.factory_method.coffee;

import java.util.*;

public abstract class CoffeeAbstract {
    private List<String> ingredients;

    public CoffeeAbstract(List<String> ingredients) {
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }
}