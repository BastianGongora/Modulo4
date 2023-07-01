import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author <a href="https://github.com/Enriquebahamondelagos">Enrique Bahamonde</a></br>
 * <a href="https://github.com/Mauro6447">Mauro Boccardo</a></br>
 * <a href="https://github.com/BastianGongora">Bastian Gongora</a></br>
 * <a href="https://github.com/kevinrojasp">Kevin Rojas</a></br>
 * @version 1.0 / Fecha: 30-06-2023
 */
public class Contenedor {
    // ? ATRIBUTOS
    private List<Usuario> usuarios;
    private List<Capacitacion> capacitaciones;

    // ? CONSTRUCTORES
    // CONSTRUCTOR SIN PARAMETROS CREA DEFAULT UNA LISTA DE TIPO USUARIO Y UNA LISTA DE TIPO CAPACITACIONES
    public Contenedor() {
        this.usuarios = new ArrayList<Usuario>();
        this.capacitaciones = new ArrayList<Capacitacion>();
    }

    // CONSTRUCTOR CON PARAMETROS
    public Contenedor(List<Usuario> usuarios, List<Capacitacion> capacitaciones) {
        this.usuarios = usuarios;
        this.capacitaciones = capacitaciones;
    }

    // ? GETTER AND SETTER


    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    // ? METODOS

    /**
     * Este método recibe un objeto de la clase usuario y lo agrega a la lista usuarios de la clase Contenedor.
     *
     * @param usuario recibe un objeto de clase Usuario (Cliente, administrativo, profesional)
     */
    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    /**
     * Este método recibe un objeto de la clase capacitación y lo agrega a la lista capacitaciones de la clase Contenedor.
     *
     * @param capacitacion recibe un objeto de clase Capacitación
     */
    public void agregarCapacitacion(Capacitacion capacitacion) {
        this.capacitaciones.add(capacitacion);
    }

    /**
     * Este método permite recorrer la lista de usuarios.
     */
    public void analizarUsuarios() {
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).analizarUsuario();
        }
    }

    public void almacenarCliente() {
        // Creacion de objeto cliente sin parametros
        Cliente cliente = new Cliente();
        // Creacion objeto scan para leer por teclado
        Scanner scan = new Scanner(System.in);
        // * INGRESO Y VALIDACION DE ATRIBUTO NOMBRE
        do {
            System.out.print("Ingrese nombre de usuario: ");
            cliente.setNombre(scan.nextLine());
            scan = new Scanner(System.in);
            if (cliente.getNombre().equals("")) {
                System.out.println("Debe ingresar un nombre válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
            if ((cliente.getNombre().length() >= 10 && cliente.getNombre().length() <= 50)) {
                System.out.println("Nombre ingresado correctamente.");
            } else {
                System.out.println("Debe ingresar un nombre válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
        } while (cliente.getNombre().length() < 10 || cliente.getNombre().length() > 50);
        // * INGRESO Y VALIDACION FECHA DE NACIMIENTO
        do {
            //INGRESO DE FECHA DE NACIMIENTO
            System.out.print("Ingrese fecha de nacimiento (Ejemplo 01/01/1993)\nFecha de nacimiento: ");
            cliente.setFechaNacimiento(scan.nextLine());
            scan = new Scanner(System.in);
            if (cliente.getFechaNacimiento().charAt(2) != '/' || cliente.getFechaNacimiento().charAt(5) != '/') {
                System.out.println("Debe ingresar una fecha válida. Formato DD/MM/AAAA");
                cliente.setFechaNacimiento("01/01/20001");
            } else {
                int dia, mes, anio;
                dia = Integer.parseInt(cliente.getFechaNacimiento().substring(0, 2));
                mes = Integer.parseInt(cliente.getFechaNacimiento().substring(3, 5));
                anio = Integer.parseInt(cliente.getFechaNacimiento().substring(6, 10));
                if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (anio <= 2005)) {
                    System.out.println("Fecha ingresada correctamente.");
                } else {
                    System.out.println("Debe ingresar una fecha válida. Formato DD/MM/AAAA");
                    cliente.setFechaNacimiento("01/01/20001");
                }
            }
        } while (cliente.getFechaNacimiento().length() != 10);
        // * INGRESO Y VALIDACION DE RUN
        do {
            System.out.print("Ingrese RUN (sin puntos ni dígito verificador): ");
            //INGRESO POR TECLADO Y ASIGNACION A cliente con su mutador setRun.
            cliente.setRun(scan.nextInt());
            if (cliente.getRun() > 99999999 || cliente.getRun() <= 0) {
                System.out.println("Ingrese rut válido.");
            } else {
                System.out.println("Rut ingresado correctamente");
            }
        } while (cliente.getRun() > 99999999);
        // * INGRESO Y VALIDACION DE NOMBRES
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese nombres: ");
            //ASIGNACION DE NOMBRES INGRESADOS POR TECLADO A cliente CON SU MUTADOR .setNombres()
            cliente.setNombres(scan.nextLine());
            scan = new Scanner(System.in);
            if (cliente.getNombres().equals("")) {
                System.out.println("Debe ingresar un nombre válido.\nMínimo 5 caracteres, máximo 30 caracteres.");
            }
            if ((cliente.getNombres().length() >= 5 && cliente.getNombres().length() <= 30)) {
                System.out.println("Nombres ingresados correctamente.");
            } else {
                System.out.println("Debe ingresar nombres válidos.\nMínimo 10 caracteres, máximo 30 caracteres.");
            }
        } while (cliente.getNombres().length() < 5 || cliente.getNombres().length() > 30);
        // * INGRESO Y VALIDACION DE APELLIDOS
        // Misma validación que nombres
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese apellidos: ");
            cliente.setApellidos(scan.nextLine());
            scan = new Scanner(System.in);
            if (cliente.getApellidos().equals("")) {
                System.out.println("Debe ingresar apellidos válidos.\nMínimo 5 caracteres, máximo 30 caracteres.");
            }
            if ((cliente.getApellidos().length() >= 5 && cliente.getApellidos().length() <= 30)) {
                System.out.println("Apellidos ingresados correctamente.");
            } else {
                System.out.println("Debe ingresar apellidos válidos.\nMínimo 5 caracteres, máximo 30 caracteres.");
            }
        } while (cliente.getApellidos().length() < 5 || cliente.getApellidos().length() > 30);
        // * INGRESO Y VALIDACION DE TELEFONO
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese teléfono: ");
            cliente.setTelefono(scan.nextInt());
            if (cliente.getTelefono() > 999999999 || cliente.getTelefono() < 910000000) {
                System.out.println("Ingrese telefono válido.");
            } else {
                System.out.println("Teléfono ingresado correctamente.");
            }
        } while (cliente.getTelefono() > 999999999 || cliente.getTelefono() < 910000000);
        // * INGRESO Y VALIDACION DE AFP
        // Misma validación que nombres
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese AFP: ");
            cliente.setAfp(scan.nextLine());
            scan = new Scanner(System.in);
            if (cliente.getAfp().equals("")) {
                System.out.println("Debe ingresar un valor válido.\nMínimo 4 caracteres, máximo 30 caracteres.");
            }
            if ((cliente.getAfp().length() >= 4 && cliente.getApellidos().length() <= 30)) {
                System.out.println("AFP ingresada correctamente.");
            } else {
                System.out.println("Debe ingresar un valor válido.\nMínimo 4 caracteres, máximo 30 caracteres.");
            }
        } while (cliente.getAfp().length() < 4 || cliente.getAfp().length() > 30);
        // * INGRESO Y VALIDACION SISTEMA DE SALUD
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese sistema salud: \n1) FONASA \n2) ISAPRE\nOpción: ");
            cliente.setSistemaSalud(scan.nextInt());
            scan = new Scanner(System.in);
            if (cliente.getSistemaSalud() < 1 && cliente.getSistemaSalud() > 2) {
                System.out.println("Debe ingresar un valor válido.");
            }
            if ((cliente.getSistemaSalud() >= 1 && cliente.getSistemaSalud() <= 2)) {
                System.out.println("Sistema salud ingresado correctamente.");
            } else {
                System.out.println("Debe ingresar un valor válido.");
            }
        } while (cliente.getSistemaSalud() < 1 || cliente.getSistemaSalud() > 2);
        // * INGRESO Y VALIDACION DE DIRECCION
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese dirección: ");
            cliente.setDireccion(scan.nextLine());
            scan = new Scanner(System.in);
            if (cliente.getDireccion().equals("")) {
                System.out.println("Debe ingresar una dirección válida.\nNo puede ser vacía");
            }
            if (cliente.getDireccion().length() <= 70 && !cliente.getDireccion().equals("")) {
                System.out.println("Dirección ingresada correctamente.");
            } else {
                System.out.println("Debe ingresar una dirección válida.\n");
            }
        } while (cliente.getDireccion().equals("") || (cliente.getDireccion().length() > 70));
        // * INGRESO Y VALIDACION DE COMUNA
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese comuna: ");
            cliente.setComuna(scan.nextLine());
            scan = new Scanner(System.in);
            if (cliente.getComuna().equals("")) {
                System.out.println("Debe ingresar una dirección válida.\nNo puede ser vacía");
            }
            if (cliente.getComuna().length() <= 50 && !cliente.getComuna().equals("")) {
                System.out.println("Comuna ingresada correctamente.");
            } else {
                System.out.println("Debe ingresar una dirección válida.\n");
            }
        } while (cliente.getComuna().equals("") || (cliente.getComuna().length() > 50));
        // * INGRESO Y VALIDACION DE EDAD
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese su edad:");
            cliente.setEdad(scan.nextInt());
            scan = new Scanner(System.in);
            if (cliente.getEdad() < 0 && cliente.getSistemaSalud() > 150) {
                System.out.println("Debe ingresar una edad válida.");
            }
            if ((cliente.getEdad() >= 0 && cliente.getSistemaSalud() <= 150)) {
                System.out.println("Edad ingresada correctamente."+"\n");
            } else {
                System.out.println("Debe ingresar una edad válida.");
            }
        } while (cliente.getEdad() < 0 || cliente.getEdad() > 150);
        // * DESPUES DE AGREGAR CON LOS MUTADORES (set) DE LA CLASE CLIENTE LLAMAMOS AL METODO AGREGAR USUARIO
        agregarUsuario(cliente);
        System.out.println("\n--------------------------------------------------");
        System.out.println("Cliente almacenado exitosamente.");
        System.out.println("--------------------------------------------------\n");
    }

    public void almacenarProfesional() {
        Profesional profesional = new Profesional();
        Scanner scan = new Scanner(System.in);
        // * INGRESO Y VALIDACION DE NOMBRE DE USUARIO
        do {
            System.out.print("Ingrese nombre de usuario: ");
            profesional.setNombre(scan.nextLine());
            scan = new Scanner(System.in);
            if (profesional.getNombre().equals("")) {
                System.out.println("Debe ingresar un nombre válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
            if ((profesional.getNombre().length() >= 10 && profesional.getNombre().length() <= 50)) {
                System.out.println("Nombre ingresado correctamente.");
            } else {
                System.out.println("Debe ingresar un nombre válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
        } while (profesional.getNombre().length() < 10 || profesional.getNombre().length() > 50);
        // * INGRESO Y VALIDACION DE FECHA DE NACIMIENTO
        do {
            System.out.print("Ingrese fecha de nacimiento (Ejemplo 01/01/1993)\nFecha de nacimiento: ");
            profesional.setFechaNacimiento(scan.nextLine());
            scan = new Scanner(System.in);
            if (profesional.getFechaNacimiento().charAt(2) != '/' || profesional.getFechaNacimiento().charAt(5) != '/') {
                System.out.println("Debe ingresar una fecha válida. Formato DD/MM/AAAA");
                profesional.setFechaNacimiento("01/01/20001");
            } else {
                int dia, mes, anio;
                dia = Integer.parseInt(profesional.getFechaNacimiento().substring(0, 2));
                mes = Integer.parseInt(profesional.getFechaNacimiento().substring(3, 5));
                anio = Integer.parseInt(profesional.getFechaNacimiento().substring(6, 10));
                if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (anio <= 2005)) {
                    System.out.println("Fecha ingresada correctamente.");
                } else {
                    System.out.println("Debe ingresar una fecha válida. Formato DD/MM/AAAA");
                    profesional.setFechaNacimiento("01/01/20001");
                }
            }
        } while (profesional.getFechaNacimiento().length() != 10);
        // * INGRESO Y VALIDACION DE RUT
        do {
            System.out.print("Ingrese RUN (sin puntos ni dígito verificador): ");
            profesional.setRun(scan.nextInt());
            if (profesional.getRun() > 99999999 || profesional.getRun() <= 0) {
                System.out.println("Ingrese rut válido.");
            } else {
                System.out.println("Rut ingresado correctamente");
            }
        } while (profesional.getRun() > 99999999);
        // * INGRESO Y VALIDACION DE TITULO
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese título: ");
            profesional.setTitulo(scan.nextLine());
            scan = new Scanner(System.in);
            if (profesional.getTitulo().equals("")) {
                System.out.println("Debe ingresar un título válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
            if ((profesional.getTitulo().length() >= 10 && profesional.getTitulo().length() <= 50)) {
                System.out.println("Título agregado correctamente.");
            } else {
                System.out.println("Debe ingresar un título válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
        } while (profesional.getTitulo().length() < 10 || profesional.getTitulo().length() > 50);
        // * INGRESO Y VALIDACION DE FECHA DE INGRESO
        do {
            System.out.print("Ingrese fecha de ingreso (Ejemplo 01/01/1993)\nFecha de ingreso: ");
            profesional.setFechaIngreso(scan.nextLine());
            scan = new Scanner(System.in);
            if (profesional.getFechaIngreso().charAt(2) != '/' || profesional.getFechaIngreso().charAt(5) != '/') {
                System.out.println("Debe ingresar una fecha válida. Formato DD/MM/AAAA");
                profesional.setFechaIngreso("01/01/20001");
            } else {
                int dia, mes, anio;
                dia = Integer.parseInt(profesional.getFechaIngreso().substring(0, 2));
                mes = Integer.parseInt(profesional.getFechaIngreso().substring(3, 5));
                anio = Integer.parseInt(profesional.getFechaIngreso().substring(6, 10));
                if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {
                    System.out.println("Fecha ingresada correctamente."+"\n");
                } else {
                    System.out.println("Debe ingresar una fecha válida. Formato DD/MM/AAAA");
                    profesional.setFechaIngreso("01/01/20001");
                }
            }
        } while (profesional.getFechaIngreso().length() != 10);
        agregarUsuario(profesional);
        System.out.println("\n--------------------------------------------------");
        System.out.println("Profesional almacenado exitosamente.");
        System.out.println("--------------------------------------------------\n");
    }

    public void almacenarAdministrativo() {
        Administrativo administrativo = new Administrativo();
        Scanner scan = new Scanner(System.in);
        // * INGRESO Y VALIDACION DE NOMBRE DE USUARIO
        do {
            System.out.print("Ingrese nombre de usuario: ");
            administrativo.setNombre(scan.nextLine());
            scan = new Scanner(System.in);
            if (administrativo.getNombre().equals("")) {
                System.out.println("Debe ingresar un nombre válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
            if ((administrativo.getNombre().length() >= 10 && administrativo.getNombre().length() <= 50)) {
                System.out.println("Nombre ingresado correctamente.");
            } else {
                System.out.println("Debe ingresar un nombre válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
        } while (administrativo.getNombre().length() < 10 || administrativo.getNombre().length() > 50);
        // * INGRESO Y VALIDACION DE FECHA DE NACIMIENTO
        do {
            System.out.print("Ingrese fecha de nacimiento: ");
            administrativo.setFechaNacimiento(scan.nextLine());
            scan = new Scanner(System.in);
            if (administrativo.getFechaNacimiento().charAt(2) != '/' || administrativo.getFechaNacimiento().charAt(5) != '/') {
                System.out.println("Debe ingresar una fecha válida. Formato DD/MM/AAAA");
                administrativo.setFechaNacimiento("01/01/20001");
            } else {
                int dia, mes, anio;
                dia = Integer.parseInt(administrativo.getFechaNacimiento().substring(0, 2));
                mes = Integer.parseInt(administrativo.getFechaNacimiento().substring(3, 5));
                anio = Integer.parseInt(administrativo.getFechaNacimiento().substring(6, 10));
                if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (anio <= 2005)) {
                    System.out.println("Fecha ingresada correctamente.");
                } else {
                    System.out.println("Debe ingresar una fecha válida. Formato DD/MM/AAAA");
                    administrativo.setFechaNacimiento("01/01/20001");
                }
            }
        } while (administrativo.getFechaNacimiento().length() != 10);
        // * INGRESO Y VALIDACION DE RUT
        do {
            System.out.print("Ingrese RUN (sin puntos ni dígito verificador): ");
            administrativo.setRun(scan.nextInt());
            if (administrativo.getRun() > 99999999 || administrativo.getRun() <= 0) {
                System.out.println("Ingrese rut válido.");
            } else {
                System.out.println("Rut ingresado correctamente");
            }
        } while (administrativo.getRun() > 99999999);
        // * INGRESO Y VALIDACION DE AREA
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese área: ");
            administrativo.setArea(scan.nextLine());
            scan = new Scanner(System.in);
            if (administrativo.getArea().equals("")) {
                System.out.println("Debe ingresar un área válida.\nMínimo 5 caracteres, máximo 20 caracteres.");
            }
            if ((administrativo.getArea().length() >= 5 && administrativo.getArea().length() <= 20)) {
                System.out.println("Área agregada correctamente.");
            } else {
                System.out.println("Debe ingresar un área válida.\nMínimo 5 caracteres, máximo 20 caracteres.");
            }
        } while (administrativo.getArea().length() < 5 || administrativo.getArea().length() > 20);
        // * INGRESO Y VALIDACION DE EXPERIENCIA PREVIA
        do {
            scan = new Scanner(System.in);
            System.out.print("Ingrese experiencia previa: ");
            administrativo.setExperienciaPrevia(scan.nextLine());
            scan = new Scanner(System.in);
            if (administrativo.getExperienciaPrevia().equals("")) {
                System.out.println("Debe ingresar una experencia previa válida.\nNo puede ser vacía.\nSi no tiene experiencia escriba 'Sin experiencia'");
            }
            if (administrativo.getExperienciaPrevia().length() <= 70 && !administrativo.getExperienciaPrevia().equals("")) {
                System.out.println("Experiencia previa ingresada correctamente."+"\n");
            } else {
                System.out.println("Debe ingresar una experiencia previa válida.");
            }
        } while (administrativo.getExperienciaPrevia().equals("") || (administrativo.getExperienciaPrevia().length() >= 100));
        agregarUsuario(administrativo);
        System.out.println("\n--------------------------------------------------");
        System.out.println("Administrativo almacenado exitosamente.");
        System.out.println("--------------------------------------------------\n");
    }

    public void almacenarCapacitacion() {
        Capacitacion capacitacion = new Capacitacion();
        Scanner scan = new Scanner(System.in);
        // * INGRESO Y VALIDACION DE ID CAPACITACION
        do {
            System.out.print("Ingrese ID capacitación: ");
            capacitacion.setId(scan.nextLine());
            scan = new Scanner(System.in);
            if (capacitacion.getId().equals("")) {
                System.out.println("Debe ingresar un id válido.\nMínimo 5 caracteres, máximo 10 caracteres.");
            }
            if ((capacitacion.getId().length() >= 5 && capacitacion.getId().length() <= 10)) {
                System.out.println("ID capacitación ingresado correctamente.");
            } else {
                System.out.println("Debe ingresar un id válido.\nMínimo 5 caracteres, máximo 10 caracteres.");
            }
        } while (capacitacion.getId().length() < 5 || capacitacion.getId().length() > 10);
        // * INGRESO Y VALIDACION DE RUN
        do {
            System.out.print("Ingrese RUN (sin puntos ni dígito verificador): ");
            //INGRESO POR TECLADO Y ASIGNACION A cliente con su mutador setRun.
            capacitacion.setRut(scan.nextInt());
            if (capacitacion.getRut() > 99999999 || capacitacion.getRut() <= 0) {
                System.out.println("Ingrese rut válido.");
            } else {
                System.out.println("Rut ingresado correctamente");
            }
        } while (capacitacion.getRut() > 99999999);
        // * INGRESO Y VALIDACION DE DIA DE LA SEMANA
        boolean flag = true;
        do{
            scan = new Scanner(System.in);
            System.out.print("Ingrese día de la semana cuando se hará la capacitación: ");
            String dia = scan.nextLine();
            dia = dia.toLowerCase();
            capacitacion.setDia(dia);
            if(capacitacion.getDia().equals("lunes") || capacitacion.getDia().equals("martes") || capacitacion.getDia().equals("miercoles") || capacitacion.getDia().equals("jueves") || capacitacion.getDia().equals("viernes") || capacitacion.getDia().equals("sabado") || capacitacion.getDia().equals("domingo")){
                System.out.println("Dia ingresado correctamente");
                flag = false;
            }else{
                System.out.println("Ingrese un día válido de la semana.");
            }
        }while (flag);
        // * INGRESO Y VALIDACION HORA
        do {
            //INGRESO DE HORA
            System.out.print("Ingrese hora (Ejemplo 15:00)\nHora de capacitación: ");
            capacitacion.setHora(scan.nextLine());
            scan = new Scanner(System.in); //"hh:mm"
            if (capacitacion.getHora().charAt(2) != ':') {
                System.out.println("Debe ingresar una hora válida. Formato hh:mm");
                capacitacion.setHora("15:000");
            } else {
                int hora, minuto;
                hora = Integer.parseInt(capacitacion.getHora().substring(0, 2));
                minuto = Integer.parseInt(capacitacion.getHora().substring(3, 5));
                if ((hora >= 0 && hora <= 24) && (minuto >= 0 && minuto <= 59)){
                    System.out.println("Hora ingresada correctamente.");
                } else {
                    System.out.println("Debe ingresar una hora válida. Formato hh:mm");
                    capacitacion.setHora("15:000");
                }
            }
        } while (capacitacion.getHora().length() != 5);
        // * INGRESO Y VALIDACION DE LUGAR
        do {
            System.out.print("Ingrese lugar de la capacitación: ");
            capacitacion.setLugar(scan.nextLine());
            scan = new Scanner(System.in);
            if (capacitacion.getLugar().equals("")) {
                System.out.println("Debe ingresar un lugar válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
            if ((capacitacion.getLugar().length() >= 10 && capacitacion.getLugar().length() <= 50)) {
                System.out.println("Lugar ingresado correctamente.");
            } else {
                System.out.println("Debe ingresar un lugar válido.\nMínimo 10 caracteres, máximo 50 caracteres.");
            }
        } while (capacitacion.getLugar().length() < 10 || capacitacion.getLugar().length() > 50);
        // * INGRESO Y VALIDACION DE DURACION
        do {
            System.out.print("Ingrese duracion (en minutos): ");
            capacitacion.setDuracion(scan.nextInt());
            if (capacitacion.getDuracion() > 600 || capacitacion.getDuracion() <= 0) {    // RANGO > 1 Y < 600
                System.out.println("Ingrese duración válida. No puede exceder los 600 minutos por Ley.");
            } else {
                System.out.println("Duración ingresado correctamente");
            }
        } while (capacitacion.getDuracion() > 600);
        // * INGRESO Y VALIDACION DE CANTIDAD DE ASISTENTES
        do {
            System.out.print("Ingrese cantidad de asistentes: ");
            capacitacion.setCantidadAsistentes(scan.nextInt());
            if (capacitacion.getCantidadAsistentes() > 1000 || capacitacion.getRut() <= 0) {
                System.out.println("Ingrese cantidad de asistentes válida.");
            } else {
                System.out.println("Cantidad de asistentes ingresada correctamente"+"\n");
            }
        } while (capacitacion.getCantidadAsistentes() > 1000);
        agregarCapacitacion(capacitacion);
        System.out.println("\n--------------------------------------------------");
        System.out.println("Capacitación almacenada exitosamente.");
        System.out.println("--------------------------------------------------\n");
    }

    public void eliminarUsuario() {
        if (!usuarios.isEmpty()) {
            int rut = 999999990;
            int indice = -1;
            int contadorIndice = 0;
            Scanner scan = new Scanner(System.in);
            do {
                System.out.print("Ingrese RUN (sin puntos ni dígito verificador): ");
                rut = scan.nextInt();
                if (rut > 99999999 || rut <= 0) {
                    System.out.println("Ingrese rut válido."+"\n");
                } else {
                    for (Usuario usuario : usuarios) {
                        if (usuario.getRun() == rut) {
                            indice = contadorIndice;
                            contadorIndice++;
                        } else {
                            contadorIndice++;
                        }
                    }
                }
            } while (rut > 99999999);
            if (indice != -1) {
                usuarios.remove(indice);
                System.out.println("\n--------------------------------------------------");
                System.out.println("Usuario eliminado correctamente.");
                System.out.println("--------------------------------------------------\n");
            } else {
                System.out.println("\n--------------------------------------------------");
                System.out.println("Rut ingresado no se encontró en la lista de usuarios.");
                System.out.println("--------------------------------------------------\n");
            }
        } else {
            System.out.println("\n--------------------------------------------------");
            System.out.println("La lista está vacía. No puedes borrar más elementos.");
            System.out.println("--------------------------------------------------\n");
        }
    }

    public void listarUsuarios() {
        System.out.println("\n--------------------------------------------------");
        if (!usuarios.isEmpty()) {
            int contador = 1;
            for (Usuario usuario : usuarios) {
                System.out.println("Usuario N°" + contador);
                usuario.analizarUsuario();
                System.out.println("--------------------------------------------------\n");
                contador++;
            }
        } else {
            System.out.println("No existen elementos en la lista.");
            System.out.println("--------------------------------------------------\n");
        }
    }

    public void listarCapacitaciones() {
        System.out.println("\n--------------------------------------------------");
        if (!capacitaciones.isEmpty()) {
            int contador = 1;
            for (Capacitacion capacitacion : capacitaciones) {
                System.out.println("Capacitación N°" + contador);
                System.out.println(capacitacion.toString());
                System.out.println("--------------------------------------------------\n");
                contador++;
            }
        } else {
            System.out.println("No existen elementos en la lista.");
            System.out.println("--------------------------------------------------\n");
        }
    }

    public void listarUsuariosPorTipo() {
        System.out.println("\n--------------------------------------------------");
        if (!usuarios.isEmpty()) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Filtro categorías\n1)Cliente\n2)Administrativo\n3)Profesional\nIngrese opción: ");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("\n--------------------------------------------------");
                    for (int i = 0; i < usuarios.size(); i++) {
                        String aux = String.valueOf(usuarios.get(i).getClass());
                        if (aux.equals("class Cliente")) {
                            usuarios.get(i).analizarUsuario();
                            System.out.println("--------------------------------------------------\n");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("\n--------------------------------------------------");
                    for (int i = 0; i < usuarios.size(); i++) {
                        String aux = String.valueOf(usuarios.get(i).getClass());
                        if (aux.equals("class Administrativo")) {
                            usuarios.get(i).analizarUsuario();
                            System.out.println("--------------------------------------------------\n");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("\n--------------------------------------------------");
                    for (int i = 0; i < usuarios.size(); i++) {
                        String aux = String.valueOf(usuarios.get(i).getClass());
                        if (aux.equals("class Profesional")) {
                            usuarios.get(i).analizarUsuario();
                            System.out.println("--------------------------------------------------\n");
                        }
                    }
                    break;
                }
            }
        } else {
            System.out.println("No existen elementos en la lista.");
            System.out.println("--------------------------------------------------\n");
        }
    }
}

