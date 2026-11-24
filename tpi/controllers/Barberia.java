import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Barberia
{

    
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private ArrayList<Barbero> listaBarberos = new ArrayList<Barbero>();
    private ArrayList<Turno> listaTurnos = new ArrayList<Turno>();
    public ArrayList<Servicio> listaServicios = new ArrayList<Servicio>();
    
    public Barberia(){
        
    }
    public void crearBarbero(){
        Barbero barbero1 = new Barbero("Juan", "Perez", 1);
        Barbero barbero2 = new Barbero("Carlos", "Gomez", 2);
        agregarBarbero(barbero1);
        agregarBarbero(barbero2);
    }
    public void crearServicio(){
        Servicio servicio1 = new Servicio("arreglo de barba");
        Servicio servicio2 = new Servicio("tintura");
        agregarServicio(servicio1);
        agregarServicio(servicio2);
    }
    public void agregarServicio(Servicio servicio){
        listaServicios.add(servicio);
    }
    public void cargarDatosCliente(String nombre, String apellido, int id){
        Cliente cliente = new Cliente(nombre, apellido, id);
        listaClientes.add(cliente);
    }
    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    public void agregarBarbero(Barbero barbero){
        listaBarberos.add(barbero);
    }
    public void agregarTurno(Turno turno){
        listaTurnos.add(turno);
    }
    public void cargarTurnos(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("ingrese un id");
        int idTurno = Sc.nextInt();
        System.out.println("ingrese el id del cliente");
        int idCliente = Sc.nextInt();
        for (Barbero barbero : listaBarberos){
            System.out.println("id: " + barbero.getId() + " nombre: " + barbero.getNombre() + " apellido: " + barbero.getApellido());
        }
        System.out.println("ingrese el id del barbero");
        for (Barbero barbero : listaBarberos){
            System.out.println("id: " + barbero.getId() + " nombre: " + barbero.getNombre() + " apellido: " + barbero.getApellido());
        }
        int idBarbero = Sc.nextInt();

        System.out.println("ingrese la fecha del turno (formato: YYYY-MM-DD)");
        int fecha = Sc.nextInt();
        int mes = Sc.nextInt();
        int dia = Sc.nextInt();
        LocalDate fechaTurno = LocalDate.of(fecha, mes, dia);
        System.out.println("ingrese la hora del turno (formato: HH)");
        int hora = Sc.nextInt();

        Turno turno = new Turno(idTurno,listaClientes.get(idCliente), listaBarberos.get(idBarbero), fechaTurno, hora);
        listaTurnos.add(turno);
        Sc.close();
    }
    public void mostrarTurnos(int idCliente){
               

                for (Turno turno : listaTurnos){
                    if (turno.getCliente().getId() == idCliente){
                        System.out.println("ID: " + turno.getId() + " fecha: " + turno.getFecha() + " hora: " + turno.getHora() + " estado: " + turno.getEstado() + " barbero: " + turno.getBarbero());
                    }
                }
            }

    public void cancelarTurno(int id){
        for (Turno turno: listaTurnos){
            if(turno.getId() == id){
                turno.modificarEstado(3);
            }
        }

    }
    public void mostrarListadoTurnos(){
               

                for (Turno turno : listaTurnos){
                    
                    System.out.println("ID: "  + turno.getId() + "fecha: " + turno.getFecha() + " hora: " + turno.getHora() + " estado: " + turno.getEstado()+ " barbero: " + turno.getBarbero());
                    
                }
            }

}

