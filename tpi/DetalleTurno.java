import java.util.ArrayList;
import java.util.List;

public class DetalleTurno
{
    private List<Servicio> servicios = new ArrayList<>();
    
    public DetalleTurno(Servicio servicio){
        this.servicios.add(servicio);
    }
    
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