package com.meysamk.patterns.adapter;

public class FrenchMessageObjectAdapter implements LocalizedMessage{
    private final FrenchLocalizedMessage f;

    public FrenchMessageObjectAdapter() {
        f = new FrenchLocalizedMessage();
    }

    @Override
    public void sayHello() {
        f.sayBonjour();
    }
}
