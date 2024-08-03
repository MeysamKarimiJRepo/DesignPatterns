package com.meysamk.patterns.adapter;

public class FrenchMessageClassAdapter extends FrenchLocalizedMessage implements LocalizedMessage{
    @Override
    public void sayHello() {
        sayBonjour();
    }

    @Override
    public void sayBonjour() {
        System.out.println("Bonjourrrrrrr");
    }
}
