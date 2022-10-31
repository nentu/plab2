package org.itmo;

import org.itmo.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();

        b.addAlly(new Guzzlord("Guzzlord1", 20));
        b.addAlly(new Cranidos("Cranidos1", 33));
        b.addAlly(new Rampardos("Rampardos1", 36));

        b.addFoe(new Bellsprout("Bellsprout1", 2));
        b.addFoe(new Weepinbell("Weepinbell1", 15));
        b.addFoe(new Victreebel("Victreebel1", 44));
        b.go();

    }
}
/*TODO
1) Агрегация
https://habr.com/ru/post/354046/
2) Композиция

3) Переделать стрелки
4) Добавить конструкторы наверх
5) Расписать Pokemon, PhysicalMove ...
6) Наименование переменных
 */