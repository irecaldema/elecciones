import java.util.*;
public class Partido{
    String nombre;
    String[] repres = new String[10];
    
    /*public Partido(String nombre,String[] repres)
    {
        this.nombre=nombre;
        this.repres=repres.clone();
    }*/
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setRepres(String[] repres)
    {
        this.repres=repres.clone();
    }
    
    public String getNombre()
    {
        return.nombre;
    }
    public String[] getRepres()
    {
        return.repres;
    }    
}