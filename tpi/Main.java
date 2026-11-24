import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Barberia gestor = new Barberia();
        gestor.crearBarbero();
        gestor.crearServicio();
        
        Scanner Sc = new Scanner(System.in);
        System.out.println("bienvenido a la barberia");
        System.out.println("toque " + "\n" + "1 para cargar un cliente" + "\n" + "2 para cargar un turno" + "\n" + "3 para mostrar su turno" + "\n" + "4 para cancelar un turno" + "\n"  + "5 para mostrar listado de turnos" + "\n" + "0 para salir");
        int opcion = Sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("ingrese su nombre");
                String nombre = Sc.next();
                System.out.println("ingrese su apellido");
                String apellido = Sc.next();
                System.out.println("ingrese su id");
                int id = Sc.nextInt();
                gestor.cargarDatosCliente(nombre, apellido, id);
                break;
                
            case 2:
                gestor.cargarTurnos();
                break;
            
            case 3:
                System.out.println("ingrese su id");
               
                int idCliente = Sc.nextInt();
                gestor.mostrarTurnos(idCliente);
                break;
            case 4:
                System.out.println("ingrese su id");
               
                int idCliente1 = Sc.nextInt();
                gestor.cancelarTurno(idCliente1);
                break;
            case 5:
                gestor.mostrarListadoTurnos();
                break;
            case 0:
                System.out.println("Cerrando el sistema");
                break;
            
            
            

        }
        Sc.close();

    }

}
