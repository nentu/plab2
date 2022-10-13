package org.itmo.attacks.cranidos;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy(){
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    public void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPEED, (int) p.getStat(Stat.SPEED)+20));

    }
    @Override
    public boolean checkAccuracy (Pokemon p1, Pokemon p2){
        return true;
    }

    @Override
    public String describe(){
        return "сфокусировал энергию";
    }
    }
