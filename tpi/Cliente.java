public class Cliente
{
    private String nombre;
    private String apellido;
    private int nroSocio;
    private int edad;

    public Cliente(String nombre, String apellido, int nroSocio, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroSocio = nroSocio;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getNumeroDeSocio(){
        return nroSocio;
    }

    public int getEdad(){
        return edad;
    }
}