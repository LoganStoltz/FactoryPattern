package AbstractFactory;

import AbstractFactory.ItemFactory;
import Item.*;

public class FPSitemFactory extends ItemFactory {

    public Item createItem(String itemKey){

        if(itemKey.equals("Shotgun"))
            return new Shotgun();
        else if(itemKey.equals("Riffle"))
            return new Riffle();
        else
            return null;
    }

}
