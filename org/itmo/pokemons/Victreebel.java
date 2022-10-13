package org.itmo.pokemons;

import org.itmo.attacks.guzzlord.LeafBlade;

public class Victreebel extends Weepinbell{
    public Victreebel(String name, int level){
        super(name, level);
        this.setStats(80.0, 105.0, 65.0, 100.0, 70.0, 70.0);

        this.addMove(new LeafBlade());
    }
}
