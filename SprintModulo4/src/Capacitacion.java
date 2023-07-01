/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class Capacitacion {
    // ? ATRIBUTOS
    private String id;
    private int rut;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;
    // ? CONSTRUCTORES
    // CONSTRUCTOR SIN PARAMETROS
    public Capacitacion() {
    }
    // CONSTRUCTOR CON PARAMETROS
    public Capacitacion(String id, int rut, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }
    // ? GETTER AND SETTER
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    // ? MÉTODO

    /**
     * Método nos permite concatenar un texto definido en el problema
     * accediendo a los datos de la capacitación con sus accesadores (get)
     * @return detalle Almacena texto concatenado.
     */
    public String mostrarDetalle(){
        String detalle = "La capacitación será en "+
                this.getLugar()+" a las "+this.getHora()+
                " horas del día "+this.getDia()+
                " y durará "+this.getDuracion()+" minutos.";
        return detalle;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id='" + id + '\'' +
                ", rut=" + rut +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}'+"\n";
    }
}
