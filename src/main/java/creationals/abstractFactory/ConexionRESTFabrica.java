package creationals.abstractFactory;

import creationals.abstractFactory.inter.FabricaAbstracta;
import creationals.abstractFactory.inter.IConexionBD;
import creationals.abstractFactory.inter.IConexionREST;
import creationals.abstractFactory.impl.ConexionRESTCompras;
import creationals.abstractFactory.impl.ConexionRESTNoArea;
import creationals.abstractFactory.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

    @Override
    public IConexionREST getREST(String area) {
        if (area == null) {
            return new ConexionRESTNoArea();
        }
        if (area.equalsIgnoreCase("COMPRAS")) {
            return new ConexionRESTCompras();
        } else if (area.equalsIgnoreCase("VENTAS")) {
            return new ConexionRESTVentas();
        }

        return new ConexionRESTNoArea();
    }

    @Override
    public IConexionBD getBD(String motor) {
        return null;
    }
}