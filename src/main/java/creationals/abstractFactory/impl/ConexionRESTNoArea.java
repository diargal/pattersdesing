package creationals.abstractFactory.impl;

import creationals.abstractFactory.inter.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("AREA NO ELEGIDA");
    }

}