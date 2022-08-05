package behavior.command;

import behavior.command.model.Cuenta;
import behavior.command.model.DepositarImpl;
import behavior.command.model.Invoker;
import behavior.command.model.RetirarImpl;

/**
 * Es un patrón de diseño de comportamiento que convierte una solicitud en un objeto independiente
 * que contiene toda la información sobre la solicitud. Esta transformación le permite pasar
 * solicitudes como argumentos de método, retrasar o poner en cola la ejecución de una solicitud
 * y admitir operaciones que se pueden deshacer.
 */
public class App {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, 200);

        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);

        ivk.realizarOperaciones();
    }

}