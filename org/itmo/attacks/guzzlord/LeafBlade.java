package org.itmo.attacks.guzzlord;
import ru.ifmo.se.pokemon.*;

public class LeafBlade extends PhysicalMove{
    public LeafBlade(){
        super(Type.GRASS, 90.0, 100.0);

    }

    @Override
    public double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if ((var1.getStat(Stat.SPEED) / 512.0) * 3 > Math.random()) {
            System.out.println("критический урон");
            return 2.0;
        } else {
            return 1.0;
        }
    }
    @Override
    public String describe(){
        return "метает листья";
    }
}
