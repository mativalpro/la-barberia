public class Barbero
{
    private String nombre;
    private String apellido;
    private int idEmpleado;
    public Barbero(){}
    public Barbero(String nombre, String apellido,int idEmpleado){
        this.nombre=nombre;
        this.apellido=apellido;
        this.idEmpleado=idEmpleado;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getIdEmpleado(){
        return idEmpleado;
    }
}