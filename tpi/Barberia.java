import java.util.ArrayList;

public class Barberia
{
<<<<<<< HEAD
    
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private ArrayList<Barbero> listaBarberos = new ArrayList<Barbero>();
    private ArrayList<Turno> listaTurnos = new ArrayList<Turno>();
    
    public Barberia(){
        
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
}
=======
    private String nombre;
    private String direccion;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Barbero> listaBarberos;
    private ArrayList<Servicio> listaServicios;
    
    public Barberia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaClientes = new ArrayList<>();
        this.listaBarberos = new ArrayList<>();
        this.listaServicios = new ArrayList<>();
    }
    
    public void agregarBarbero(Barbero barbero) {
        this.listaBarberos.add(barbero);
        System.out.println("Barbero agregado correctamente");
    }
    
    public void agregarServicio(Servicio servicio) {
        this.listaServicios.add(servicio);
        System.out.println("Servicio agregado correctamente");
    }
    
    public void agregarTurnos(Turno turno) {
        System.out.println("Turno agregado con exito");
    }
    
    
public String getNombre() {
    return nombre;
}

public String getDireccion() {
    return direccion;
}
}
>>>>>>> 8f1871804578a47d356df79d2c664228e6e71c9e
