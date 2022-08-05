package creationals.builder.model.imple;

import creationals.builder.model.inter.Item;
import creationals.builder.model.inter.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}