package AbstractFactory;

import Atire.*;

public class FantasyAttireFactory extends AttireFactory{

    public Atire createAttire(String atireKey){
        if(atireKey.equals("Goblin armor"))
            return new GoblinArmor();
        else if(atireKey.equals("Troll clothes"))
            return new TrollClothes();
        else
            return null;
    }

}
