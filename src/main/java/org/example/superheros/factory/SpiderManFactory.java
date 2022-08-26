package org.example.superheros.factory;

import org.example.Superhero;
import org.example.SuperheroFactory;
import org.example.superheros.SpiderMan;

public class SpiderManFactory implements SuperheroFactory {
    @Override
    public Superhero getSuperhero(int lvl) {
        return new SpiderMan(lvl);
    }
}
