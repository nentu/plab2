package org.itmo.attacks.rampardos;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120.0, 70.0);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        p.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1));
    }

    @Override
    public String describe(){
        return "стреляет бластером";
    }
}
