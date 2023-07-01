/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class Revision {
    //? ATRIBUTOS
    private int id;
    private VisitaTerreno visitaTerreno;
    private String nombreRevision;
    private String detalle;
    private int estado;

    // ? CONSTRUCTORES
    // CONSTRUCTOR SIN PARAMETROS

    public Revision() {
    }
    // CONSTRUCTOR CON PARAMETROS


    public Revision(int id, VisitaTerreno visitaTerreno, String nombreRevision, String detalle, int estado) {
        this.id = id;
        this.visitaTerreno = visitaTerreno;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    // ? GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VisitaTerreno getVisitaTerreno() {
        return visitaTerreno;
    }

    public void setVisitaTerreno(VisitaTerreno visitaTerreno) {
        this.visitaTerreno = visitaTerreno;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    // ?MÉTODOS

    @Override
    public String toString() {
        return "Revision{" +
                "id=" + id +
                ", visitaTerreno=" + visitaTerreno.getId() +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
