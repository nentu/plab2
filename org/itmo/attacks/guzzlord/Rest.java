package org.itmo.attacks.guzzlord;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0.0, 1.0);
    }
    @Override
    public void applySelfEffects(Pokemon pokemon){

        pokemon.restore();
        Effect effect = new Effect().condition(Status.SLEEP).attack(0.0).turns(2);
        pokemon.addEffect(effect);
    }

    @Override
    public boolean checkAccuracy (Pokemon pokemon1, Pokemon pokemon2){
        return true;
    }

    @Override
    public String describe(){
        return "засыпает на 2 хода и восстанавливает здоровье";
    }
}
