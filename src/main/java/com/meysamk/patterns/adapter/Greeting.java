package com.meysamk.patterns.adapter;

public class Greeting {

    private final LocalizedMessage localizedMessage;

    public Greeting(LocalizedMessage localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public void print() {
        localizedMessage.sayHello();
    }


}
