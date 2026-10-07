import java.util.List;
import java.util.ArrayList;

public class Turno
{
    private String fecha;
    private String hora;
    private EstadoTurno estado;
    private List<DetalleTurno> detalles = new ArrayList<>();
    private Cliente cliente;
    private Barbero barbero;

    public Turno(Cliente cliente, Barbero barbero, String fecha, String hora, DetalleTurno detalle){
        this.cliente = cliente;
        this.barbero = barbero;
        this.fecha = fecha;
        this.hora = hora;
        this.detalles.add(detalle);
        this.estado = EstadoTurno.PENDIENTE;
}

    //public enum estadoTurno{
    //    PENDIENTE,
    //    COMFIRMADO,
    //    CANCELADO
    //}
    
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

    public String mostrarInformacion(){
        return "Cliente: " + cliente.getNombre() + " " + cliente.getApellido()
        + "\nBarbero: " + barbero.getNombre() + " " + barbero.getApellido()
        + "\nServicios: " + detalles
        + "\nTotal a pagar: $" + detalles.get(0).calcularPrecioTotal();
}
}
