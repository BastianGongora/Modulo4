public class Test {
    public static void main(String args[]){
        Listado lista = new Listado();
        Profesional profesional1 = new Profesional("Juanito1","Perez","123456789","Ingeniero Informatico1","01/01/1993");
        Profesional profesional2 = new Profesional("Juanito2","Perez","123456789","Ingeniero Informatico2","01/01/1993");
        Profesional profesional3 = new Profesional("Juanito3","Perez","123456789","Ingeniero Informatico3","01/01/1993");
        Profesional profesional4 = new Profesional("Juanito4","Perez","123456789","Ingeniero Informatico4","01/01/1993");
        Profesional profesional5 = new Profesional("Juanito5","Perez","123456789","Ingeniero Informatico5","01/01/1993");
        Administrativo administrativo1 = new Administrativo("Enrique1","Bahamonde","123456789","TI-1","2 años");
        Administrativo administrativo2 = new Administrativo("Enrique2","Bahamonde","123456789","TI-2","2 años");
        Administrativo administrativo3 = new Administrativo("Enrique3","Bahamonde","123456789","TI-3","2 años");
        Administrativo administrativo4 = new Administrativo("Enrique4","Bahamonde","123456789","TI-4","2 años");
        Administrativo administrativo5 = new Administrativo("Enrique5","Bahamonde","123456789","TI-5","2 años");
        Cliente cliente1 = new Cliente("Bastian1","Gongora","123456789","1234","Basti");
        Cliente cliente2 = new Cliente("Bastian2","Gongora","123456789","12345","Basti");
        Cliente cliente3 = new Cliente("Bastian3","Gongora","123456789","123456","Basti");
        Cliente cliente4 = new Cliente("Bastian4","Gongora","123456789","1234567","Basti");
        Cliente cliente5 = new Cliente("Bastian5","Gongora","123456789","12345678","Basti");
        Usuario usuario = new Usuario("Kevin","Rojas","18202088");


        lista.agregarUsuario(profesional1);
        lista.agregarUsuario(administrativo2);
        lista.agregarUsuario(profesional2);
        lista.agregarUsuario(profesional3);
        lista.agregarUsuario(cliente2);
        lista.agregarUsuario(profesional4);
        lista.agregarUsuario(profesional5);
        lista.agregarUsuario(administrativo4);
        lista.agregarUsuario(administrativo1);
        lista.agregarUsuario(cliente4);
        lista.agregarUsuario(administrativo3);
        lista.agregarUsuario(administrativo5);
        lista.agregarUsuario(cliente1);
        lista.agregarUsuario(cliente3);
        lista.agregarUsuario(cliente5);
        lista.agregarUsuario(usuario);

        lista.analizarListado();

        //lista.analizarListadoPorCategoria();

    }
}
