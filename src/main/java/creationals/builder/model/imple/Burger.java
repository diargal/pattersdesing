package creationals.builder.model.imple;

import creationals.builder.model.inter.Item;
import creationals.builder.model.inter.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}