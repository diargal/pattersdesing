package structural.decorator;

import structural.decorator.inter.ICuentaBancaria;
import structural.decorator.model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria {

    protected ICuentaBancaria cuentaDecorada;

    public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
        this.cuentaDecorada = cuentaDecorada;
    }

    @Override
    public void abrirCuenta(Cuenta c) {
        this.cuentaDecorada.abrirCuenta(c);
    }

}