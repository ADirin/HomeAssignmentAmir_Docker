package org.example;

// Main.java


public class Main {
    private String greeting;

    public Main(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public String formatGreeting(String name) {
        return greeting + ", " + name + "!";
    }

    public static void main(String[] args) {
        Main main = new Main("Hello");
        System.out.println(main.formatGreeting("world"));
    }
}

