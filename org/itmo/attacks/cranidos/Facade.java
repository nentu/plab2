package org.itmo.attacks.cranidos;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70.0, 100.0);
    }

    @Override
    public void applySelfEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);

        if (pokemon.getCondition().equals(Status.BURN) | pokemon.getCondition().equals(Status.POISON) | pokemon.getCondition().equals(Status.PARALYZE)){
            pokemon.addEffect(new Effect().stat(Stat.ATTACK,(int) pokemon.getStat(Stat.ATTACK)*2));

        }
    }

    @Override
    public String describe(){
        return "воспользовалcя фасадом";
    }


}
