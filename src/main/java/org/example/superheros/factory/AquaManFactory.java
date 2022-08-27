package org.example.superheros.factory;

import org.example.Superhero;
import org.example.SuperheroFactory;
import org.example.superheros.AquaMan;

public class AquaManFactory implements SuperheroFactory {
    @Override
    public Superhero getSuperhero(int lvl) {
        return new AquaMan(lvl);
    }
}
