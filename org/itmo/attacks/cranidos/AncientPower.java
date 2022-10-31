package org.itmo.attacks.cranidos;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {
    public AncientPower(){
        super(Type.ROCK, 60.0, 100.0);
    }

    @Override
    public void applySelfEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);

        if (Math.random() < 0.1){
            pokemon.addEffect(new Effect().chance(1).stat(Stat.ATTACK, 1).stat(Stat.DEFENSE, 1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.SPEED, 1));
        }
    }
    @Override
    public String describe(){
        return "воспользовался силой предков";
    }
}
