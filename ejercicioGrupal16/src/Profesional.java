public class Profesional extends Usuario{
    public Profesional(String nombre,String apellido,String rut){
        super(nombre,apellido,rut);
    }
    private String titulo,fechaIngreso,categoria;

    public Profesional() {
        this.categoria = "Profesional";
    }

    public Profesional(String nombre, String apellido, String rut, String titulo, String fechaIngreso) {
        super(nombre, apellido, rut);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
        this.categoria = "Profesional";
    }

    public String getCategoria() {
        return categoria;
    }

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

    // * METODOS

    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Fecha Ingreso: "+this.getFechaIngreso()+"\n");
    }
}
