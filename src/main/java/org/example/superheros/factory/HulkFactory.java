package org.example.superheros.factory;

import org.example.Superhero;
import org.example.SuperheroFactory;
import org.example.superheros.Hulk;

public class HulkFactory implements SuperheroFactory {
    @Override
    public Superhero getSuperhero(int lvl) {
        return new Hulk(lvl);
    }
}
