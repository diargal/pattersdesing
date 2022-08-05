package creationals.abstractFactory.impl;

import creationals.abstractFactory.inter.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose a " + url);
    }

}