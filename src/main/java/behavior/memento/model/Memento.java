package behavior.memento.model;

public class Memento {

    private Game estado;

    public Memento(Game estado) {
        this.estado = estado;
    }

    public Game getEstado() {
        return estado;
    }

}