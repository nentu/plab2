package org.itmo;

import org.itmo.pokemons.Cranidos;
import org.itmo.pokemons.Guzzlord;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();


        b.addAlly(new Guzzlord("Guzzlord1", 1));
        b.addFoe(new Cranidos("Cranidos1", 33));

        b.go();

    }
}
