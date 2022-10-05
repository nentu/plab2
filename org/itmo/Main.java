package org.itmo;

import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Artem1", 1);
        Pokemon p2 = new Pokemon("Artem2", 1);
        b.addAlly(p1);
        b.addFoe(p2);

        b.go();

    }
}
