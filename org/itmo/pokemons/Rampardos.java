package org.itmo.pokemons;

import org.itmo.attacks.cranidos.FocusEnergy;
import org.itmo.attacks.rampardos.FocusBlast;
import org.itmo.pokemons.Cranidos;
import ru.ifmo.se.pokemon.Type;

public class Rampardos extends Cranidos{
    public Rampardos(String name, int level){
        super(name, level);
        this.setType(Type.ROCK);
        this.setStats(97.0, 165.0, 60.0, 65.0, 50.0, 58.0);

        this.addMove(new FocusBlast());
    }
}
