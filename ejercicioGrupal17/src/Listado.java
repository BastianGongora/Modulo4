import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listado {
    private List<Usuario> usuarios;

    public Listado() {
        this.usuarios = new ArrayList<Usuario>();
    }

    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void analizarListado(){
        for(int i=0;i<usuarios.size();i++){
            usuarios.get(i).analizarUsuario();
        }
    }

    public void analizarListadoPorCategoria(){
        Scanner scan = new Scanner(System.in);
        System.out.print("INGRESE FITRO DE CATEGORIA: ");
        String opcion = scan.nextLine();

        for (int i=0;i<usuarios.size();i++){
            String aux = String.valueOf(usuarios.get(i).getClass());
            if(aux.equals("class "+opcion)){
                usuarios.get(i).analizarUsuario();
            }
        }



    }


}
