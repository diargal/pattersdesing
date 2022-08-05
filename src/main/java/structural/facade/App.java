package structural.facade;

/**
 * El patrón de fachada oculta las complejidades del sistema y proporciona una interfaz
 * para el cliente mediante la cual el cliente puede acceder al sistema.
 * Este patrón involucra una sola clase que proporciona métodos simplificados requeridos
 * por el cliente y delega llamadas a métodos de clases de sistemas existentes.
 */
public class App {

    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Cancún");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
    }

}