package org.example.superheros;

import org.example.Superhero;

public class Superman implements Superhero {
    private int lvl;
    private String label = "DC";

    public Superman(int lvl) {
        this.lvl = lvl;
    }

    @Override
    public String superPower() {
        return "Aaa, I'm superman";
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
        return "Superman";
    }
}
