package org.itmo.attacks.guzzlord;

import ru.ifmo.se.pokemon.*;

public class SmartStrike extends PhysicalMove {
    public SmartStrike(){
        super(Type.STEEL, 70.0, 100.0);
    }
    public boolean checkAccuracy(Pokemon attacker, Pokemon defender){
        return true;
    }
    public String describe(){
        return "бьет с умом";
    }
}
