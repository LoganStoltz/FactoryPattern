package AbstractFactory;

import Item.Item;

public abstract class ItemFactory {

    public abstract Item createItem(String itemKey);

}
