package org.itmo;

import org.itmo.pokemons.Cranidos;
import org.itmo.pokemons.Guzzlord;
import org.itmo.pokemons.Rampardos;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();


        b.addAlly(new Guzzlord("Guzzlord1", 20));
        b.addFoe(new Cranidos("Cranidos1", 33));
        b.addFoe(new Rampardos("Rampardos1", 36));
        var t = new Rampardos("sfd", 3);
        b.go();

    }
}
