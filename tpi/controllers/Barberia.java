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
    public void cargarTurnos(Scanner Sc){
        System.out.println("ingrese un id");
        int idTurno = Sc.nextInt();
        System.out.println("ingrese el id del cliente");
        int idCliente = Sc.nextInt();
        System.out.println("ingrese el id del barbero");
        for (Barbero barbero : listaBarberos){
            System.out.println("id: " + barbero.getId() + " nombre: " + barbero.getNombre() + " apellido: " + barbero.getApellido());
        }
        int idBarbero = Sc.nextInt();

        Cliente cliente = null;
        for (Cliente candidato : listaClientes){
            if (candidato.getId() == idCliente){
                cliente = candidato;
                break;
            }
        }
        if (cliente == null){
            System.out.println("No existe un cliente con el id " + idCliente);
            return;
        }

        Barbero barberoSeleccionado = null;
        for (Barbero candidato : listaBarberos){
            if (candidato.getId() == idBarbero){
                barberoSeleccionado = candidato;
                break;
            }
        }
        if (barberoSeleccionado == null){
            System.out.println("No existe un barbero con el id " + idBarbero);
            return;
        }

        Turno turno = new Turno(idTurno, cliente, barberoSeleccionado);
        listaTurnos.add(turno);
        System.out.println("Turno " + idTurno + " creado correctamente.");
    }
    public void mostrarTurnos(int idCliente){
        boolean encontrado = false;
        for (Turno turno : listaTurnos){
            if (turno.getCliente().getId() == idCliente){
                imprimirTurno(turno);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontraron turnos para el cliente con id " + idCliente);
        }
    }

    private void imprimirTurno(Turno turno){
        Cliente cliente = turno.getCliente();
        Barbero barbero = turno.getBarbero();
        System.out.println("Turno: " + turno.getId()
                + " | Cliente: " + cliente.getNombre() + " " + cliente.getApellido()
                + " (ID: " + cliente.getId() + ")"
                + " | Estado: " + turno.getEstado()
                + " | Barbero: " + barbero.getNombre() + " " + barbero.getApellido()
                + " (ID: " + barbero.getId() + ")");
    }

    public void cancelarTurno(int id){
        for (Turno turno: listaTurnos){
            if(turno.getId() == id){
                turno.modificarEstado(3);
            }
        }

    }
    public void mostrarListadoTurnos(){
        if (listaTurnos.isEmpty()){
            System.out.println("No hay turnos creados.");
            return;
        }
        System.out.println("Listado completo de turnos (" + listaTurnos.size() + "):");
        for (Turno turno : listaTurnos){
            imprimirTurno(turno);
        }
    }

}

