package creationals.builder.model.imple;

import creationals.builder.model.inter.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}