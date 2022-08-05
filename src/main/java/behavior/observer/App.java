package behavior.observer;

import behavior.observer.model.PesoARGObservador;
import behavior.observer.model.PesoMXObservador;
import behavior.observer.model.SolObservador;
import behavior.observer.model.Subject;

/**
 * El patrón de observador se utiliza cuando existe una relación de uno a muchos entre los objetos, por ejemplo,
 * si se modifica un objeto, sus objetos dependientes se notificarán automáticamente.
 * Permite definir un mecanismo de suscripción para notificar a varios objetos sobre cualquier evento
 * que le suceda al objeto que están observando.
 */
public class App {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new SolObservador(subject);
        new PesoARGObservador(subject);
        new PesoMXObservador(subject);

        System.out.println("Si desea cambiar 10 dólares obtendrá : ");
        subject.setEstado(10);
        System.out.println("-----------------");
        System.out.println("Si desea cambiar 100 dólares obtendrá : ");
        subject.setEstado(100);
    }
}