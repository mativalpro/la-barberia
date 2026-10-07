public class Turno
{
    private String fecha;
    private String hora;
    private EstadoTurno estado;
    private Servicio servicio;
    private Cliente cliente;

    public Turno(String fecha, String hora, EstadoTurno estado, Servicio servicio, int edad, Cliente cliente){
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.servicio = servicio;
    }

    
    //public enum estadoTurno{
    //    PENDIENTE,
    //    COMFIRMADO,
    //    CANCELADO
    //}

    public void modificarEstado(EstadoTurno nuevoEstado){
        this.estado = nuevoEstado;
    }

    public void modificarHorario(String nuevaFecha, String nuevaHora){
        if (this.estado != EstadoTurno.CANCELADO){
            this.fecha = nuevaFecha;
            this.hora = nuevaHora;
    }
}
}