
public class Usuario implements Asesoria{
    String nombre,apellido,rut;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }


    // * METODOS

    public void analizarUsuario(){
        System.out.println(this.getNombre());
    }
}

//Principio de Responsabilidad Única.
/**
 * En esta clase se cumple con el principio de responsabilidad única, ya que el método declarado
 * es analizarUsuario y es único.
 */

//Principio Abierto/Cerrado.
/**
 * En este ejercicio se cumple con el principio de abierto-cerrado, ya que las clases hijas son capaces
 * de extender el comportamiento de una clase padre (Usuario), sin modificarla.
 */

//Principio de Sustitución de Liskov.
/**
 * Las clases hijas (administrativo, profesional y cliente) extienden la clase Usuario, lo cual indica que un objeto
 * de este tipo de clases puede ser utilizado
 * en lugar de un objeto de tipo Usuario sin causar
 * comportamientos inesperados. Esto cumple con el principio de sustitución de Liskov.
 */

// Principio de Segregación de Interfaces.
/**
 * No se aplica directamente en este caso,
 * ya que no estamos utilizando interfaces
 * explícitas en las clases Usuario y clases hijas.
 * Sin embargo, si en el futuro necesitamos implementar
 * diferentes funcionalidades para usuarios y administrativos,
 * podríamos considerar dividir las interfaces en roles más específicos
 * para evitar la dependencia de métodos no utilizados.
 */

// Principio de Inversión de Dependencias.
/**
 * No se aplica directamente en este caso, ya que las clases Usuario y clases hijas
 * no tienen dependencias externas significativas. Sin embargo, si en el
 * futuro necesitamos agregar dependencias adicionales, podríamos utilizar
 * abstracciones e inyección de dependencias para invertir las dependencias
 * y lograr un código más flexible y modular.
 */

