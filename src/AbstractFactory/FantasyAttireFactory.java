package AbstractFactory;

import AbstractFactory.AttireFactory;
import Atire.*;

public class FantasyAttireFactory extends AttireFactory {

    public Attire createAttire(String atireKey){
        if(atireKey.equals("Goblin armor"))
            return new GoblinArmor();
        else if(atireKey.equals("Troll clothes"))
            return new TrollClothes();
        else
            return null;
    }

}
