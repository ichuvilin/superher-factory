package org.example;

import java.util.List;

public class Fight {
    public void arena(List<Superhero> superheroes) {
        for (int i = 0; i < superheroes.size(); i += 2) {
            System.out.println(superheroes.get(i).superPower());
            System.out.println(superheroes.get(i + 1).superPower());
            if (superheroes.get(i).getLvl() > superheroes.get(i + 1).getLvl())
                System.out.println(superheroes.get(i).getName() + " win");
            else System.out.println(superheroes.get(i++).getName() + " win");
        }
    }
    /*
        arena(List) {
            player 1 -> (
                lvl
                superpower
             )
             player 2 -> (
                lvl
                superpower
             }
        }
    */
}
