package structural.decorator;

import structural.decorator.inter.ICuentaBancaria;
import structural.decorator.inter.impl.CuentaAhorro;
import structural.decorator.model.Cuenta;

/**
 * Este patrón crea una clase de decorador que envuelve la clase original y proporciona una funcionalidad
 * adicional que mantiene intacta la firma de los métodos de clase.
 */
public class App {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "MitoCode");

        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }

}