import java.util.*;
public class Partido{
    String nombre, presi, siglas;
    /*String[] repres = new String[10];*/
    
    /*public Partido(String nombre,String[] repres)
    {
        this.nombre=nombre;
        this.repres=repres.clone();
    }*/
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setSiglas(String siglas)
    {
        this.siglas=siglas;
    }
    public void setPresi(String presi)
    {
        this.presi=presi;
    }
    /*public void setRepres(String[] repres)
    {
        this.repres=repres;
    }*/
    
    public String getNombre()
    {
        return nombre;
    }
    public String getSiglas()
    {
        return siglas;
    }
    public String getPresi()
    {
        return presi;
    }       
    /*public String[] getRepres()
    {
        return repres;
    }    */
}