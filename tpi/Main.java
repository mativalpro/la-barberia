import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Barberia gestor = new Barberia();
        Barbero barbero1 = new Barbero("Juan", "Perez", 1);
        Barbero barbero2 = new Barbero("Carlos", "Gomez", 2);
        Servicio servicio1 = new Servicio("arreglo de barba");
        Servicio servicio2 = new Servicio("tintura");
        gestor.agregarBarbero(barbero2);
        gestor.agregarBarbero(barbero1);
        Scanner Sc = new Scanner(System.in);
        System.out.println("bienvenido a la barberia");
        System.out.println("toque " + "\n" + "1 para cargar un cliente" + "\n" + "2 para cargar un turno" + "\n" + "3 para mostrar su turno" + "\n" + "0 para salir");
        int opcion = Sc.nextInt();
        while (opcion != 0){
            if (opcion == 1){
            System.out.println("ingrese su nombre");
            String nombre = Sc.next();
            System.out.println("ingrese su apellido");
            String apellido = Sc.next();
            System.out.println("ingrese su id");
            int id = Sc.nextInt();
            gestor.cargarDatosCliente(nombre, apellido, id);
            }
            if (opcion == 2){
                gestor.cargarTurnos();
            }
            if (opcion == 3){
                gestor.mostrarTurnos();
            }
            
            

        }

    }

}
