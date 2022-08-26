package org.example;

import org.example.superheros.SpiderMan;
import org.example.superheros.factory.SpiderManFactory;

import java.util.Random;

public class Main {

    private Superhero createNewSuperhero(String name) {
        int lvl = new Random().nextInt(10);
        Superhero superhero = null;
        if (name.equals("spider-man"))
            return new SpiderManFactory().getSuperhero(lvl);

        return null;
    }

    public static void main(String[] args) {
        Superhero spide = new Main().createNewSuperhero("spider-man");
        System.out.println(spide.superPower());
        System.out.println(spide.getLvl());
    }
}