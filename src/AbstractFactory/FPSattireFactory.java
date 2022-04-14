package AbstractFactory;

import AbstractFactory.AbstractEntityItemAndAttireFactory;
import Atire.Attire;
import Atire.DemolitionManGear;
import Atire.ShotgunnerGear;

public class FPSattireFactory extends AttireFactory {

    public Attire createAttire(String attireKey){

        if(attireKey.equals("Shotgunner gear"))
            return new ShotgunnerGear();
        else if(attireKey.equals("Riffle"))
            return new DemolitionManGear();
        else
            return null;
    }

}
