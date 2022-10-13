package org.itmo.attacks.guzzlord;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf(){
        super(Type.GRASS, 55.0, 95.0);
    }

    @Override
    public double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED)*3 / 512.0 > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }

    public String describe(){
        return new String("метает листья");
    }
}
