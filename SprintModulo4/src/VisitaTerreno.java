/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class VisitaTerreno {
    // ? ATRIBUTOS
    private int id;
    private int rut;
    private String fecha;
    private String hora;
    private String lugar;
    private String comentarios;

    // ? CONSTRUCTORES
    // CONSTRUCTOR SIN PARAMETROS

    public VisitaTerreno() {
    }
    // CONSTRUCTOR CON PARAMETROS

    public VisitaTerreno(int id, int rut, String fecha, String hora, String lugar, String comentarios) {
        this.id = id;
        this.rut = rut;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    // ? METODOS


    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "id=" + id +
                ", rut=" + rut +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
