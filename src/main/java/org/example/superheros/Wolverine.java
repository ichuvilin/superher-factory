package org.example.superheros;

import org.example.Superhero;

public class Wolverine implements Superhero {
    private int lvl;
    private String label = "Marvel";

    public Wolverine(int lvl) {
        this.lvl = lvl;
    }

    @Override
    public String superPower() {
        return "Aaa, I'm Wolverine";
    }

    @Override
    public int getLvl() {
        return lvl;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getName() {
        return "Wolverine";
    }
}
