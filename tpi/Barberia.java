import java.util.ArrayList;

/**
 * Write a description of class Barberia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barberia
{
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
