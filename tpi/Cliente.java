public class Cliente
{
    private String nombre;
    private String apellido;
    private int nroSocio;

    public Cliente(String nombre, String apellido, int nroSocio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroSocio = nroSocio;
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
}