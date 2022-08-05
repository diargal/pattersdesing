package creationals.prototype;

import creationals.prototype.impl.CuentaAHImpl;

/**
 * Este patrón implica implementar una interfaz de prototipo que
 * indica que se cree un clon del objeto actual.
 * Este patrón se utiliza cuando la creación de objetos directamente es costosa.
 */
public class App {

    public static void main(String[] args) {

        CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
        cuentaAhorro.setMonto(200);

        CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();

        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

        System.out.println(cuentaAhorro);
        System.out.println(cuentaAhorro2);
        System.out.println(cuentaClonada);

		/*if (cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}
		System.out.println(cuentaClonada == cuentaAhorro);*/

    }

}