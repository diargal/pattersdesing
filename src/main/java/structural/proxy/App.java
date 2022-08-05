package structural.proxy;

import structural.proxy.inter.ICuenta;
import structural.proxy.inter.impl.CuentaBancoBImpl;
import structural.proxy.model.Cuenta;

/**
 * Proxy es un patrón de diseño estructural que le permite proporcionar un sustituto o marcador de
 * posición para otro objeto. Un proxy controla el acceso al objeto original, lo que le permite realizar
 * algo antes o después de que la solicitud llegue al objeto original.
 */
public class App {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "mitocode", 100);

        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
        cuentaProxy.mostrarSaldo(c);

        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);

    }

}