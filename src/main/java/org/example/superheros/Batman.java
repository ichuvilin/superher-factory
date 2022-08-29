package org.example.superheros;

import org.example.Superhero;

public class Batman implements Superhero {
    int lvl = 0;
    String label = "DC";

    public Batman(int lvl) {
        this.lvl = lvl;
    }

    @Override
    public String superPower() {
        return "Aaa, I'm batman";
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
        return "Batman";
    }
}
