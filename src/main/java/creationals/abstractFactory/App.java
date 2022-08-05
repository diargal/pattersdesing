package creationals.abstractFactory;

import creationals.abstractFactory.inter.FabricaAbstracta;
import creationals.abstractFactory.inter.IConexionBD;
import creationals.abstractFactory.inter.IConexionREST;

/**
 * Abstract Factory funcionan en torno a una superfábrica que crea otras fábricas. Esta fábrica también se
 * denomina fábrica de fábricas. Este tipo de patrón de diseño se incluye en el patrón de creación,
 * ya que proporciona una de las mejores formas de crear un objeto
 */
public class App {

    public static void main(String[] args) {
        FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
        IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

        cxBD1.conectar();

        FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

        cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
    }

}