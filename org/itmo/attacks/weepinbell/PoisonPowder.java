package org.itmo.attacks.weepinbell;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {
    public PoisonPowder(){
        super(Type.POISON, 1.0, 75.0);
    }

    @Override
    public void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.poison(p);
    }

    @Override
    public String describe(){
        return "пускает ядовитый порошок";
    }
}
