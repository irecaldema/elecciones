import java.util.Scanner;

public class Elecciones 
{
    public static void main (String args[]) 
	{
        String nombre, direccion, apellido1, apellido2;
        String[] repres = new String[10];
        int edad, poblacion;
        char opcion, opcion2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\ningresa la opcion: registrar (r), leer (l), salir (s)");
        opcion = sc.next().charAt(0);
         
        while (opcion!='s')
        {
            
            Partido party = new Partido();
            Inmueble inmu = new Inmueble();
            Habitante habi = new Habitante();
            EspacioPublico espacio = new EspacioPublico();
            Ayuntamiento ayu = new Ayuntamiento();
            
            if (opcion=='r')
            {
                System.out.println("\ningresa la opcion: Partido (p), Inmueble (i), Habitante (h), EspacioPublico(e), Ayuntamiento(a), salir (s)");
                opcion2 = sc.next().charAt(0);
                
                while (opcion2!='s')
                {
                    if (opcion2=='p')
                    {
                        
                    }
                    else if (opcion2=='i')
                    {
                        
                    }
                    else if (opcion2=='h')
                    {
                        /*String nombre, apellido1, apellido2, direccion;
                        int edad;*/
                        
                        System.out.println("\ningresa el nombre: ");
                        nombre = sc.next();
                        habi.setNombre(nombre);

                        
                    }
                    else if (opcion2=='e')
                    {
                        
                    }
                    else if (opcion2=='a')
                    {
                        
                    }
                    else
                    {
                        System.out.println("\nNo se selecciono la opcion correcta");//opcion2
                    }                
                    System.out.println("\ningresa la opcion: Partido (p), Inmueble (i), Habitante (h), EspacioPublico(e), Ayuntamiento(a), salir (s)");
                    opcion2 = sc.next().charAt(0);
                }
                
            }
            else if (opcion=='l')
            {
                System.out.println("\ningresa la opcion: Partido (p), Inmueble (i), Habitante (h), EspacioPublico(e), Ayuntamiento(a), salir (s)");
                opcion2 = sc.next().charAt(0);
                
                while (opcion2!='s')
                {
                    if (opcion2=='p')
                    {
                        
                    }
                    else if (opcion2=='i')
                    {
                        
                    }
                    else if (opcion2=='h')
                    {
                        /*String nombre, apellido1, apellido2, direccion;
                        int edad;*/
                        
                        nombre=habi.getNombre();
                        System.out.println("\nnombre: " + nombre);
                    }
                    else if (opcion2=='e')
                    {
                        
                    }
                    else if (opcion2=='a')
                    {
                        
                    }
                    else
                    {
                        System.out.println("\nNo se selecciono la opcion correcta");//opcion2
                    } 
                }    
            }        
            else
            {
                System.out.println("\nNo se selecciono la opcion correcta");//opcion1
            }
            System.out.println("\ningresa la opcion: registrar (r), leer (l), salir (s)");
            opcion = sc.next().charAt(0);
        }
        
        System.out.println("\n\nEGUN ONA IZAN!!\n");
    }
}