package org.example.superheros;

import org.example.Superhero;

public class AquaMan implements Superhero {
    private int lvl;
    private String label = "DC";

    public AquaMan(int lvl) {
        this.lvl = lvl;
    }

    @Override
    public String superPower() {
        return "Aaa, I'm aqua man";
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
