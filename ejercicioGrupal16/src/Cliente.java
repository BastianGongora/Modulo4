public class Cliente extends Usuario{
    public Cliente(String nombre, String apellido,String rut){
        super(nombre,apellido,rut);
    }
    private String idCliente,apodo,categoria;

    public Cliente() {
        this.categoria = "Cliente";
    }

    public Cliente(String nombre, String apellido, String rut, String idCliente, String apodo) {
        super(nombre, apellido, rut);
        this.idCliente = idCliente;
        this.apodo = apodo;
        this.categoria = "Cliente";
    }

    public String getCategoria() {
        return categoria;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    // * METODOS

    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Id cliente: "+this.getIdCliente());
        System.out.println("Apodo: "+this.getApodo()+"\n");
    }


}
