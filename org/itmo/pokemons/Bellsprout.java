package org.itmo.pokemons;

import org.itmo.attacks.bellsprout.Venoshock;
import org.itmo.attacks.bellsprout.VineWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level){
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(50.0, 75.0, 35.0, 70.0, 30.0, 40.0);

        this.setMove(new VineWhip(), new Venoshock());
    }
}
