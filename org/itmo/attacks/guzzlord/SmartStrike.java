package org.itmo.attacks.guzzlord;

import ru.ifmo.se.pokemon.*;

public class SmartStrike extends PhysicalMove {
    public SmartStrike(){
        super(Type.STEEL, 70, 100.0);
    }
    public boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    public String describe(){
        return "бьет с умом";
    }
}