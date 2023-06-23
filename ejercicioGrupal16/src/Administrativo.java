public class Administrativo extends Usuario{
    public Administrativo(String nombre,String apellido,String rut){
        super(nombre,apellido,rut);
    }
    private String area,experienciaPrevia,categoria;

    public Administrativo() {
        this.categoria = "Administrativo";
    }

    public Administrativo(String nombre, String apellido, String rut, String area, String experienciaPrevia) {
        super(nombre, apellido, rut);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
        this.categoria = "Administrativo";
    }

    public String getCategoria() {
        return categoria;
    }

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

    // * METODOS

    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Area: "+this.getArea());
        System.out.println("Experiencia previa: "+this.getExperienciaPrevia()+"\n");
    }
}
