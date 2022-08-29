package org.example.superheros;

import org.example.Superhero;

public class SpiderMan implements Superhero {
    private int lvl;
    private String label = "Marvel";

    public SpiderMan(int lvl) {
        this.lvl = lvl;
    }

    public int getLvl() {
        return lvl;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getName() {
        return "SpiderMan";
    }

    @Override
    public String superPower() {
        return "Aaa, I'm Spider-Man";
    }
}
