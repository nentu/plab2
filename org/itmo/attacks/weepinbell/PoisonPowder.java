package org.itmo.attacks.weepinbell;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {
    public PoisonPowder(){
        super(Type.POISON, 1.0, 75.0);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
        Effect.poison(pokemon);
    }

    @Override
    public String describe(){
        return "пускает ядовитый порошок";
    }
}
