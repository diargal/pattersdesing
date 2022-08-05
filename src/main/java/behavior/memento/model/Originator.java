package behavior.memento.model;

public class Originator {

    private Game estado;

    public void setEstado(Game estado) {
        this.estado = estado;
    }

    public Game getEstado() {
        return estado;
    }

    public Memento guardar() {
        return new Memento(estado);
    }

    public void restaurar(Memento m) {
        this.estado = m.getEstado();
    }
}