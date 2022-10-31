package org.itmo.attacks.guzzlord;
import ru.ifmo.se.pokemon.*;

public class LeafBlade extends PhysicalMove{
    public LeafBlade(){
        super(Type.GRASS, 90.0, 100.0);

    }

    @Override
    public double calcCriticalHit(Pokemon pokemon1, Pokemon pokemon2) {
        if ((pokemon1.getStat(Stat.SPEED) / 512.0) * 3 > Math.random()) {
            System.out.println("Критический удар!");
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
