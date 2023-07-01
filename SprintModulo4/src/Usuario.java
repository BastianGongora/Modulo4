import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class Usuario implements Asesoria{
    // ? ATRIBUTOS
    private String nombre;
    private String fechaNacimiento;
    private int run;

    // ? CONSTRUCTORES

    //CONSTRUCTOR SIN PARAMETROS
    public Usuario() {
    }
    //CONSTRUCTOR CON PARAMETROS
    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    // ? GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    // ? MÉTODOS

    /**
     * Método nos permite calcular la edad del usuario,
     *obteniendo año de nacimiento según formato DD/MM/AAAA
     *y restandolo con el año actual.
     * @return textoCalculado
     */
    public String mostrarEdad(){
        //Se crea objeto Fecha de la clase Calendar para almacenar una nueva fecha del calendario Gregoriano.
        Calendar fecha = new GregorianCalendar();
        //Se extrae el año del objeto fecha y se almacena en varieble int anioActual
        int anioActual = fecha. get(Calendar. YEAR);
        //Se extrae con el metodo substring año del usuario formato (DD/MM/AAAA) y se convierte a tipo entero.
        int anioNacimiento = Integer.parseInt(this.getFechaNacimiento().substring(6));
        //Se calcula edad actual haciendo una resta entre el anioActual y anioNacimiento
        int edadActual = anioActual-anioNacimiento;
        //Se retorna String
        String textoCalculado = "El usuario tiene "+edadActual+" años.";
        return textoCalculado;
    }

    /**
     * Este método nos permite desplegar por consola información del usuario por sus accesadores.
     * Nombre de usuario:
     * Run:
     */
    public void analizarUsuario(){
        System.out.println("Nombre de usuario: "+this.getNombre());
        System.out.println("RUN: "+this.getRun());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                '}';
    }
}
