package com.meysamk.patterns.adapter;

public class App {

    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();

        var frenchGreeting = new Greeting(new FrenchMessageObjectAdapter());
        frenchGreeting.print();


        var frenchGreeting2 = new Greeting(new FrenchMessageClassAdapter());
        frenchGreeting2.print();
    }

}
