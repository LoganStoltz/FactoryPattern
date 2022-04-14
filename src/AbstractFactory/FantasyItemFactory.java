package AbstractFactory;

import AbstractFactory.ItemFactory;
import Item.*;

public class FantasyItemFactory extends ItemFactory {

    @Override
    public Item createItem(String itemKey){
        if(itemKey.equals("Rusty sword"))
            return new RustySword();
        else if(itemKey.equals("Club"))
            return new Club();
        else
            return null;
    }

}
