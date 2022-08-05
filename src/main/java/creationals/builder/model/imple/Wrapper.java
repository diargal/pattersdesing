package creationals.builder.model.imple;

import creationals.builder.model.inter.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}