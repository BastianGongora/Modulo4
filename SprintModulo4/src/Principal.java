
import java.util.Scanner;

/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class Principal {
    public static void main(String args[]){
        Contenedor usuarios = new Contenedor();

        Scanner scan = new Scanner(System.in);
        int opcion=9;
        boolean flag = true;
        while (flag && (opcion<1 && opcion>9)==false){
            System.out.println("\n--------------------------------------------------");
            System.out.print("Menu\n1)Almacenar cliente\n2)Almacenar profesional\n3)Almacenar administrativo\n"+
                    "4)Almacenar Capacitacion\n5)Eliminar usuario\n6)Listar usuarios\n7)Mostrar usuarios por tipo\n8)Listar capacitaciones\n9)Salir\nIngrese opción: ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1: {
                    usuarios.almacenarCliente();
                    break;
                }
                case 2: {
                    usuarios.almacenarProfesional();
                    break;
                }
                case 3: {
                    usuarios.almacenarAdministrativo();
                    break;
                }
                case 4: {
                    usuarios.almacenarCapacitacion();
                    break;
                }
                case 5: {
                    usuarios.eliminarUsuario();
                    break;
                }
                case 6: {
                    usuarios.listarUsuarios();
                    break;
                }
                case 7:{
                    usuarios.listarUsuariosPorTipo();
                    break;
                }
                case 8:{
                    usuarios.listarCapacitaciones();
                    break;
                }
                case 9:{
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("Usted ha salido");
                    System.out.println("--------------------------------------------------\n");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("Debe ingresar una opción válida");
                    System.out.println("--------------------------------------------------\n");
                }
            }
        }
    }
}
