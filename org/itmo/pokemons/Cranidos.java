package org.itmo.pokemons;

import org.itmo.attacks.cranidos.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cranidos extends Pokemon {
    public Cranidos(String name, int level){
        super(name, level);
        this.setType(Type.ROCK);
        this.setStats(67.0, 125.0, 40.0, 30.0, 30.0, 58.0);

        this.setMove(new FocusEnergy(), new AncientPower(), new Facade());
    }
}
