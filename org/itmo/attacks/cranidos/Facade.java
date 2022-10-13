package org.itmo.attacks.cranidos;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70.0, 100.0);
    }

    @Override
    public void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        if (p.getCondition().equals(Status.BURN) | p.getCondition().equals(Status.POISON) | p.getCondition().equals(Status.PARALYZE)){
            p.addEffect(new Effect().stat(Stat.ATTACK,(int) p.getStat(Stat.ATTACK)*2));

        }
    }

    @Override
    public String describe(){
        return "воспользовалcя фасадом";
    }


}
