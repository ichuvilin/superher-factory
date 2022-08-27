package org.example;

import org.example.superheros.SpiderMan;
import org.example.superheros.factory.BatmanFactory;
import org.example.superheros.factory.SpiderManFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private Superhero createNewSuperhero(String name) {
        int lvl = new Random().nextInt(10);
        Superhero superhero = null;
        if (name.equals("spider-man")) return new SpiderManFactory().getSuperhero(lvl);
        if (name.equals("batman")) return new BatmanFactory().getSuperhero(lvl);

        return null;
    }

    public static void main(String[] args) {
        List<String> superheroesList = Arrays.asList("batman", "spider-man", "superman", "hulk", "aqua man");
        List<Superhero> superheroesPlayer = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            superheroesPlayer.add(new Main().createNewSuperhero(superheroesList.get(new Random().nextInt(superheroesList.size()))));
        }

        for (Superhero s : superheroesPlayer) {
            System.out.println(s.superPower());
            System.out.println(s.getLabel());
            System.out.println(s.getLvl());
        }
    }
}