/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */ class Administrativo extends Usuario implements Asesoria{
    // ? ATRIBUTOS
    private String area;
    private String experienciaPrevia;
    // ? CONSTRUCTORES
    // CONSTRUCTOR SIN PARAMETROS
    public Administrativo() {
    }
    // CONSTRUCTOR CON PARAMETROS
    public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }
    // ? GETTER AND SETTER
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    // ? MÉTODOS
    /**
     * Este método nos permite desplegar por consola información del usuario por sus accesadores.
     * Nombre de usuario: Llamando al metodo de la clase padre super.analizarUsuario
     * Run: Llamando al método de la clase padre super.analizarUsuario
     * Área:
     * Experiencia previa:
     */
    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Área: "+this.getArea());
        System.out.println("Experiencia previa: "+this.getExperienciaPrevia()+"\n");
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}
