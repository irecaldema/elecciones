import java.util.*;
public class Ayuntamiento{
    String nombre, direccion;
    int poblacion;
    
    /*public Ayuntamiento(String nombre, String direccion, int poblacion)
    {
        this.nombre=nombre;
        this.direccion=direccion;
        this.poblacion=poblacion;
    }*/
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    public void setPoblacion(int poblacion)
    {
        this.poblacion=poblacion;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public int getPoblacion()
    {
        return poblacion;
    }
    
}