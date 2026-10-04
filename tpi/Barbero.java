
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
    private String getNombre(){return nombre;}
    private String getApellido(){return apellido;}
    private int getIdEmpleado(){return idEmpleado;}
}