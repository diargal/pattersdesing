package behavior.memento;

import behavior.memento.model.Caretaker;
import behavior.memento.model.Game;
import behavior.memento.model.Originator;

/**
 * Es un patrón de diseño de comportamiento que le permite guardar y restaurar el estado
 * anterior de un objeto sin revelar los detalles de su implementación.
 */
public class App {

    public static void main(String[] args) {
        String nombreJuego = "Crash Bandicoot";

        Game game = new Game();
        game.setNombre(nombreJuego);
        game.setCheckpoint(1);

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        game = new Game();
        game.setNombre(nombreJuego);
        game.setCheckpoint(2);
        originator.setEstado(game);

        game = new Game();
        game.setNombre(nombreJuego);
        game.setCheckpoint(3);
        originator.setEstado(game);

        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 0

        game = new Game();
        game.setNombre(nombreJuego);
        game.setCheckpoint(4);

        originator.setEstado(game);
        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 1

        game = new Game();
        game.setNombre(nombreJuego);
        game.setCheckpoint(5);
        originator.setEstado(game);
        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 2

        originator.setEstado(game);
        originator.restaurar(caretaker.getMemento(1));

        game = originator.getEstado();
        System.out.println(game);
    }

}