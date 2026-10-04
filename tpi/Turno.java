public class Turno
{
    private String fecha;
    private String hora;
    private estadoTurno estado;
    private Servicio servicio;

    public Turno(String fecha, String hora, String estado, Servicio servicio, int edad){
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.servicio = servicio;
    }

    public enum estadoTurno{
        PENDIENTE,
        COMFIRMADO,
        CANCELADO
    }

    public void modificarEstado(estadoTurno nuevoEstado){
        this.estado = nuevoEstado;
    }

    public void modificarHorario(String nuevaFecha, String nuevaHora){
        if (this.estado != estadoTurno.CANCELADO){
            this.fecha = nuevaFecha;
            this.hora = nuevaHora;
    }
}