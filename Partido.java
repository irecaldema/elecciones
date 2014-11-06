import java.util.*;
public class Partido{
    String nombre;
    String[] repres = new String[20];
    public Partido(String nombre,String repres){
        this.nombre=nombre;
        this.repres=repres;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setRepres(String[] repres)
    {
        this.repres=repres;
    }
}