package creationals.abstractFactory.impl;

import creationals.abstractFactory.inter.IConexionBD;

public class ConexionVacia implements IConexionBD {

    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICĂ“ PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICĂ“ PROVEEDOR");
    }

}
