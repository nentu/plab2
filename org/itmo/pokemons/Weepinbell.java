package org.itmo.pokemons;

import org.itmo.attacks.weepinbell.PoisonPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int level){
        super(name, level);
        this.setStats(65.0, 90.0, 50.0, 85.0, 45.0, 55.0);

        this.addMove(new PoisonPowder());
    }
}
