package org.example.superheros;

import org.example.Superhero;

public class SpiderMan implements Superhero {
    private int lvl;

    public SpiderMan(int lvl) {
        this.lvl = lvl;
    }

    public int getLvl() {
        return lvl;
    }

    @Override
    public String superPower() {
        return "Aaa, I'm Spider-Man";
    }
}
