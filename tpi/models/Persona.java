public abstract class Persona {
    private String nombre;
    private String apellido;
    private int id;
    public Persona(String nombre, String apellido,int id){
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getId(){
        return id;
    }
}
