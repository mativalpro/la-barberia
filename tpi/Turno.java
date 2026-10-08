import java.util.List;
import java.util.ArrayList;

public class Turno
{
    private String fecha;
    private String hora;
    private EstadoTurno estado;
    private List<Servicio> servicios = new ArrayList<>();
    private Cliente cliente;
    private Barbero barbero;

    public Turno(Cliente cliente, Barbero barbero, String fecha, String hora){
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
}

    public void modificarHorario(String nuevaFecha, String nuevaHora){
        if (this.estado == EstadoTurno.PENDIENTE || this.estado == EstadoTurno.CONFIRMADO){
            this.fecha = nuevaFecha;
            this.hora = nuevaHora;
    }
}

    // mostrar informacion
    
    
    public void agregarServicios(Servicio servicio){
        servicios.add(servicio);
    }
    
    public double calcularPrecioTotal(){
        double total = 0.0;
        for (Servicio s : servicios){
            total += s.getPrecio();
        }
        return total;
    }
}

