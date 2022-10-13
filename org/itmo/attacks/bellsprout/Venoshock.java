package org.itmo.attacks.bellsprout;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Venoshock extends SpecialMove {
    public Venoshock(){
        super(Type.POISON, 65.0, 100.0);
    }

    @Override
    public double calcBaseDamage(Pokemon att, Pokemon def){
        if (def.getCondition().equals(Status.POISON)){
            return super.calcBaseDamage(att, def)*2;
        }
        else{
            return super.calcBaseDamage(att, def);
        }
    }
}
