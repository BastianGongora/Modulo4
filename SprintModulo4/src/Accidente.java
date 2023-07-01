/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class Accidente {
    // ? ATRIBUTOS
    private int id;
    private int rut;
    private String fechaAccidente;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    // ? CONSTRUCTORES
    // CONSTRUCTOR SIN PARAMETROS
    public Accidente() {
    }
    // CONSTRUCTOR CON PARAMETROS
    public Accidente(int id, int rut, String fechaAccidente, String hora, String lugar, String origen, String consecuencias) {
        this.id = id;
        this.rut = rut;
        this.fechaAccidente = fechaAccidente;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }
    // ? GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(String fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    // ? METODOS


    @Override
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", rut=" + rut +
                ", fechaAccidente='" + fechaAccidente + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
