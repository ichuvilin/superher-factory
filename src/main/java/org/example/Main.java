package org.example;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        new Fight().arena(factory.generateSuperhero(2));
    }
}