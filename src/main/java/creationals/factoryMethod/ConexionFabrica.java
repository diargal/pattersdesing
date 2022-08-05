package creationals.factoryMethod;

import creationals.factoryMethod.implementation.*;
import creationals.factoryMethod.inter.IConexion;

public class ConexionFabrica {

    public IConexion getConexion(String motor) {

        switch (motor) {
            case "MYSQL":
                return new ConexionMySQL();
            case "ORACLE":
                return new ConexionOracle();
            case "POSTGRE":
                return new ConexionPostgreSQL();
            case "SQL":
                return new ConexionSQLServer();
            default:
                return new ConexionVacia();
        }

    }

}
