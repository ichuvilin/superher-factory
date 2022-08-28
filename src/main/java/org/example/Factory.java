package org.example;

import org.example.superheros.factory.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Factory {
    public Superhero createNewSuperhero(String name) {
        int lvl = new Random().nextInt(10);
        Superhero superhero = null;
        if (name.equals("spider-man")) return new SpiderManFactory().getSuperhero(lvl);
        if (name.equals("batman")) return new BatmanFactory().getSuperhero(lvl);
        if (name.equals("superman")) return new SupermanFactory().getSuperhero(lvl);
        if (name.equals("hulk")) return new HulkFactory().getSuperhero(lvl);
        if (name.equals("aqua-man")) return new AquaManFactory().getSuperhero(lvl);
        if (name.equals("wolverine")) return new WolverineFactroy().getSuperhero(lvl);

        return null;
    }

    public List<Superhero> Factory() {
        List<String> superheroesList = Arrays.asList("batman", "spider-man", "superman", "hulk", "aqua-man", "wolverine");
        List<Superhero> superheroesPlayer = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            superheroesPlayer.add(createNewSuperhero(superheroesList.get(new Random().nextInt(superheroesList.size()))));
        }
        return superheroesPlayer;
    }
}
