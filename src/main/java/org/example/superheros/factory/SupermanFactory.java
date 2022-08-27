package org.example.superheros.factory;

import org.example.Superhero;
import org.example.SuperheroFactory;
import org.example.superheros.Superman;

public class SupermanFactory implements SuperheroFactory {
    @Override
    public Superhero getSuperhero(int lvl) {
        return new Superman(lvl);
    }
}
