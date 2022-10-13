package org.itmo;

import org.itmo.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();


        b.addAlly(new Guzzlord("Guzzlord1", 20));
        b.addAlly(new Cranidos("Cranidos1", 33));
        b.addAlly(new Rampardos("Rampardos1", 36));

        b.addFoe(new Bellsprout("Bellsprout1", 2));
        b.addFoe(new Weepinbell("Weepinbell1", 15));
        b.addFoe(new Victreebel("Victreebel1", 44));
        b.go();

    }
}
