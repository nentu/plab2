package org.itmo.pokemons;
import org.itmo.attacks.guzzlord.*;
import ru.ifmo.se.pokemon.*;

public class Guzzlord extends Pokemon{
    public Guzzlord(String name, int level){
        super(name, level);
        super.setType(Type.DARK, Type.DRAGON);
        super.setStats(223, 101, 53, 97, 53, 43);

        //super.setMove(new LeafBlade());
        //super.addMove(new SmartStrike());
        //super.addMove(new RazorLeaf());

        setMove(new Rest(), new LeafBlade());


    }


}
