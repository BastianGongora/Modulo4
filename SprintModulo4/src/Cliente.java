import java.util.Scanner;
/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class Cliente extends Usuario implements Asesoria{
    // ? ATRIBUTOS
    private String nombres;
    private String apellidos;
    private int telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;


    // ? CONSTRUCTORES
    // CONSTRUCTOR SIN PARAMETROS
    public Cliente() {
    }
    // CONSTRUCTOR CON PARAMETROS QUE RECIBE LOS ATRIBUTOS DE LA CLASE PADRE
    public Cliente(String nombre, String fechaNacimiento, int run, String nombres, String apellidos, int telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    // ? GETTER AND SETTER

    public String getNombres(){return nombres;}

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // ? MÉTODOS

    /**
     * Metodo obtener nombres retorna un String
     * con la concatenación de nombre y apellidos del cliente
     * @return nombreApellido
     */
    public String obtenerNombre() {
        //Se concatena nombre y apellido en variable local nombreApellido
        String nombreApellido = this.getNombres() + " " + this.getApellidos();
        return nombreApellido;
    }

    /**
     * Metodo obtenerSistemaSalud nos permite conocer
     * sistema salud del cliente según su opcion
     * igresada (1) Fonasa (2) Isapre.
     * @param opcion int que almacena opcion 1.- Fonasa 2.- Isapre
     * @return sistemSalud variable que almacena String según opción.
     */
    public String obtenerSistemaSalud(int opcion) {
        String sistemSalud="";
        if (opcion == 1) {
           sistemSalud = "Fonasa";
        }
        if (opcion == 2) {
            sistemSalud = "Isapre";
        }
        return sistemSalud;
    }
    /**
     * Este metodo nos permite desplegar por consola información del usuario por sus accesadores.
     * Nombre de usuario: Llamando al metodo de la clase padre super.analizarUsuario
     * Run: Llamando al metodo de la clase padre super.analizarUsuario
     * Dirección cliente:
     * Comuna:
     */
    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Dirección cliente: "+this.getDireccion());
        System.out.println("Comuna: "+this.getComuna()+"\n");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", afp='" + afp + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }
}


