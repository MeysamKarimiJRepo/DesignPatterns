package com.meysamk.patterns.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {
    public static final Map<String, Supplier<Snack>> snacks = new HashMap<>();

    static {
        snacks.put("ChocolateBar", ChocolateBar::new);
        snacks.put("Chips", Chips::new);
        snacks.put("Drink", Drink::new);
    }

    Snack getSnack(String snackType) {
        if (snacks.get(snackType) != null) {
            return snacks.get(snackType).get();
        } else {
            throw new IllegalArgumentException("Not valid snack type");
        }
    }


}
