import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Barberia gestor = new Barberia();
        gestor.crearBarbero();
        gestor.crearServicio();
        int opcion = 6;
        Scanner Sc = new Scanner(System.in);
        
        while (opcion != 0){
            System.out.println("bienvenido a la barberia");
            System.out.println("toque " + "\n" + "1 para cargar un cliente" + "\n" + "2 para cargar un turno" + "\n" + "3 para mostrar su turno" + "\n" + "4 para cancelar un turno" + "\n"  + "5 para mostrar listado de turnos" + "\n" + "0 para salir");
            opcion = Sc.nextInt();
            if(opcion==1){
                System.out.println("ingrese su nombre");
                String nombre = Sc.next();
                System.out.println("ingrese su apellido");
                String apellido = Sc.next();
                System.out.println("ingrese su id");
                int id = Sc.nextInt();
                gestor.cargarDatosCliente(nombre, apellido, id);
            }
                
            if(opcion==2){
                gestor.cargarTurnos(Sc);
            }
            
            if (opcion==3){
                System.out.println("Ingrese el id del cliente para buscar sus turnos");
               
                int idCliente = Sc.nextInt();
                gestor.mostrarTurnos(idCliente);
            }
            if (opcion==4){
                System.out.println("ingrese su id");
               
                int idCliente1 = Sc.nextInt();
                gestor.cancelarTurno(idCliente1);
            }
            if (opcion==5){
                gestor.mostrarListadoTurnos();
                }
            if (opcion==0){
                System.out.println("Cerrando el sistema");
                
            }
            
            
        }
        }
        
    }


