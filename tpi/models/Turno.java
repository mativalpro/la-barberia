import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
public class Turno
{
    private LocalDate fecha;
    private int hora;
    private EstadoTurno estado;
    private List<Servicio> servicios = new ArrayList<>();
    private Cliente cliente;
    private Barbero barbero;

    public Turno(Cliente cliente, Barbero barbero, LocalDate fecha, int hora){
        this.cliente = cliente;
        this.barbero = barbero;
        this.fecha = fecha;
        this.hora = hora;
        
        this.estado = EstadoTurno.PENDIENTE;
}


    public void modificarEstado(int opcion){
        if (opcion == 1){
            this.estado = EstadoTurno.PENDIENTE;
        }
        if (opcion == 2){
            this.estado = EstadoTurno.CONFIRMADO;
        }
        if (opcion == 3){
            this.estado = EstadoTurno.CANCELADO;
        }
        // 3 metodos 
}

    public void modificarHorario(LocalDate nuevaFecha, int nuevaHora){
        if (this.estado == EstadoTurno.PENDIENTE || this.estado == EstadoTurno.CONFIRMADO){
            this.fecha = nuevaFecha;
            this.hora = nuevaHora;
    }
}

    // mostrar informacion
    
    
    public void agregarServicios(Servicio servicio){
        servicios.add(servicio);
    }
    public Cliente getCliente(){
        return cliente;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public int getHora(){
        return hora;
    }
    public EstadoTurno getEstado(){
        return estado;
    }
  
}

