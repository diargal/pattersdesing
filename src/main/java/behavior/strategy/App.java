package behavior.strategy;

import behavior.strategy.strategy.AntivirusAvanzado;
import behavior.strategy.strategy.Contexto;

/**
 * En el patrón de estrategia, el comportamiento de una clase o su algoritmo se puede cambiar
 * en tiempo de ejecución.En el patrón de estrategia, creamos objetos que representan varias
 * estrategias y un objeto de contexto cuyo comportamiento varía según su objeto de estrategia.
 * El objeto de estrategia cambia el algoritmo de ejecución del objeto de contexto.
 */
public class App {

    public static void main(String[] args) {
        Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();
    }

}
