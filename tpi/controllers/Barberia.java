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
        System.out.println("ingrese su id");
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

        Turno turno = new Turno(listaClientes.get(idCliente), listaBarberos.get(idBarbero), fechaTurno, hora);
        listaTurnos.add(turno);
    }
    public void mostrarTurnos(){
                System.out.println("ingrese su id");
                Scanner Sc = new Scanner(System.in);
                int idCliente = Sc.nextInt();
                for (Turno turno : listaTurnos){
                    if (turno.getCliente().getId() == idCliente){
                        System.out.println("fecha: " + turno.getFecha() + " hora: " + turno.getHora() + " estado: " + turno.getEstado());
                    }
                }
            }

}

