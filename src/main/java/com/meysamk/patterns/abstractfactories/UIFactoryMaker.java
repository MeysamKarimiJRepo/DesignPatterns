package com.meysamk.patterns.abstractfactories;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class UIFactoryMaker {
    private static final Map<String, Supplier<UIFactory>> uiFactoryMap = new HashMap<>();

    static {
        uiFactoryMap.put("BLUE", BlueUIFactory::new);
        uiFactoryMap.put("RED", RedUIFactory::new);
    }

    public static UIFactory createFactory(String color) {
        if (uiFactoryMap.get(color) != null) {
            return uiFactoryMap.get(color).get();
        } else {
            throw new IllegalArgumentException("The color is not supported");
        }
    }
}
