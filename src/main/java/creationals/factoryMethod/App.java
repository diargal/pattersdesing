package creationals.factoryMethod;

import creationals.factoryMethod.inter.IConexion;

/**
 * Sirve para crear objetos sin tener que especificar su clase exacta.
 * Su uso puede especificarse en una interfaz o implementarse mediante la clase hijo
 * o la clase base y opcionalmente sobrescribirse (mediante clases derivadas).
 * Al hacerlo, el patrón o método toma el lugar del constructor de clase normal para separar la
 * creación de objetos de los propios objetos.
 */

public class App {

    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        IConexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        IConexion cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }
}