package org.itmo;

import org.itmo.pokemons.Guzzlord;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();


        b.addAlly(new Guzzlord("Guzzlord1", 1));
        b.addFoe(new Pokemon("sdfs", 3));

        b.go();

    }
}
