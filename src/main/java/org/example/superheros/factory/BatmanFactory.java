package org.example.superheros.factory;

import org.example.Superhero;
import org.example.SuperheroFactory;
import org.example.superheros.Batman;

public class BatmanFactory implements SuperheroFactory {
    @Override
    public Superhero getSuperhero(int lvl) {
        return new Batman(lvl);
    }
}
