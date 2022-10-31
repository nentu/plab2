package org.itmo.attacks.bellsprout;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class VineWhip extends PhysicalMove {
    public VineWhip(){
        super(Type.GRASS, 45.0, 100.0);
    }

    @Override
    public String describe(){
        return "ударил виноградных хлыстом";
    }
}
