package org.example.superheros;

import org.example.Superhero;

public class Hulk implements Superhero {
    private int lvl;
    private String label = "Marvel";

    public Hulk(int lvl) {
        this.lvl = lvl;
    }

    @Override
    public String superPower() {
        return "Aaa, I'm hulk";
    }

    @Override
    public int getLvl() {
        return lvl;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
