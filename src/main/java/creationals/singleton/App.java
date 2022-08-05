package creationals.singleton;

/**
 * Este patrón involucra una sola clase que es responsable de crear un objeto mientras se asegura
 * de que solo se cree un único objeto. Esta clase proporciona una forma de acceder a
 * su único objeto al que se puede acceder directamente sin necesidad de instanciar el objeto de la clase.
 */
public class App {
    public static void main(String[] args) {
        //Instanciación por constructor prohíbido por ser "private"
        //Conexion c = new Conexion();
        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }
}
