package org.itmo.pokemons;
import org.itmo.attacks.guzzlord.*;
import ru.ifmo.se.pokemon.*;

public class Guzzlord extends Pokemon{
    public Guzzlord(String name, int level){
        super(name, level);
        super.setType(Type.DARK, Type.DRAGON);
        super.setStats(223, 101, 53, 97, 53, 43);


        setMove(new Rest(), new LeafBlade(), new SmartStrike(), new RazorLeaf());


    }


}
