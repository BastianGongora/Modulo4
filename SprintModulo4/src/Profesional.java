/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class Profesional extends Usuario implements Asesoria{
    // ? ATRIBUTOS
    private String titulo;
    private String fechaIngreso;
    // ? CONSTRUCTORES
    // CONSTRUCTOR SIN PARAMETROS
    public Profesional() {
    }
    // CONSTRUCTOR CON PARAMETROS
    public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }
    // ? GETTER AND SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // ? MÉTODOS
    /**
     * Este método nos permite desplegar por consola información del usuario por sus accesadores.
     * Nombre de usuario: Llamando al metodo de la clase padre super.analizarUsuario
     * Run: Llamando al método de la clase padre super.analizarUsuario
     * Título profesional:
     * Fecha ingreso:
     */
    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Título profesional: "+this.getTitulo());
        System.out.println("Fecha ingreso: "+this.getFechaIngreso()+"\n");
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
}
