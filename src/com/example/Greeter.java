package com.example;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
	    Greeter greeter = new Greeter();
	    HolaWorld hola = new HolaWorld();

        Greeting lambdaGreeting = () -> System.out.println("Hello World");

        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Test");
            }
        };

        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
        greeter.greet(hola);
    }
}