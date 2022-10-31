package org.itmo.attacks.cranidos;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy(){
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    public void applySelfEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().stat(Stat.SPEED, (int) pokemon.getStat(Stat.SPEED)+20));

    }
    @Override
    public boolean checkAccuracy (Pokemon pokemon1, Pokemon pokemon2){
        return true;
    }

    @Override
    public String describe(){
        return "сфокусировал энергию";
    }
    }
