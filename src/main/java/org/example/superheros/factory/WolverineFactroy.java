package org.example.superheros.factory;

import org.example.Superhero;
import org.example.SuperheroFactory;
import org.example.superheros.Wolverine;

public class WolverineFactroy implements SuperheroFactory {
    @Override
    public Superhero getSuperhero(int lvl) {
        return new Wolverine(lvl);
    }
}
