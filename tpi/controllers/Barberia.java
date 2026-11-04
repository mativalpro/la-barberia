import java.util.ArrayList;

public class Barberia
{

    
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

