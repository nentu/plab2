package org.itmo.attacks.guzzlord;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0.0, 1.0);
    }
    @Override
    public void applySelfEffects(Pokemon p){

        p.restore();
        Effect ef = new Effect().condition(Status.SLEEP).attack(0.0).turns(2);
        p.addEffect(ef);
    }

    @Override
    public boolean checkAccuracy (Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    public String describe(){
        return "засыпает на 2 хода и восстанавливает здоровье";
    }
}
