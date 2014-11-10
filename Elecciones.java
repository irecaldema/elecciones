import java.util.Scanner;

public class Elecciones 
{
    public static void main (String args[]) 
	{
        String nombre, direccion, apellido1, apellido2;
        String[] repres = new String[10];
        int edad, poblacion;
        char opcion, opcion2;
        
        
        Partido party = new Partido();
        Inmueble inmu = new Inmueble();
        Habitante habi = new Habitante();
        EspacioPublico espacio = new EspacioPublico();
        Ayuntamiento ayu = new Ayuntamiento();
            
        /* 
            Partido
        String nombre;
        String[] repres = new String[10];
        */
        
        party.setDireccion("calle desconodida");
        party.setRepres("1","2","3","4","5","6","7","8","9","10");
        
        nombre=party.getNombre();
        repres=party.getRepres();
        
        /*
            Inmueble
        String direccion;
        int setDireccion;
        */
        
        inmu.setDireccion("calle desconodida");
        inmu.setPoblacion(35);
        
        direccion=inmu.getDireccion();
        poblacion=inmu.getPoblacion();
        
        /*
            Habitante
        String nombre, apellido1, apellido2, direccion;
        int edad;
        */
        
        habi.setNombre("Iosu");
        habi.setApellido1("Rec");
        habi.setApellido2("Man");
        habi.setDireccion("Calle desconodida");
        habi.setEdad(50);
        
        nombre=habi.getNombre();
        apellido1=habi.getApellido1();
        apellido2=habi.getApellido2();
        direccion=habi.geDireccion();
        edad=habi.getEdad();
        
        /*
            EspacioPublico
        String nombre, direccion;
        */
        
        espacio.setNombre("Biblioteca nueva");
        espacio.setDireccion("calle 123");
        
        nombre=espacio.setNombre();
        direccion=espacio.setDireccion();
        
        /*
            Ayuntamiento
        String direccion;
        int poblacion;    
        */
        ayu.setDireccion("calle mayor");
        ayu.setPoblacion(200);
        
        direccion=ayu.getDireccion();
        poblacion=ayu.getPoblacion();    
            
        
        /*Scanner sc = new Scanner(System.in);
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
                System.out.println("\ningresa la opcion para registrar: Partido (p), Inmueble (i), Habitante (h), EspacioPublico(e), Ayuntamiento(a), salir (s)");
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
                        int edad;*//*
                        
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
                    System.out.println("\ningresa la opcion para registrar: Partido (p), Inmueble (i), Habitante (h), EspacioPublico(e), Ayuntamiento(a), salir (s)");
                    opcion2 = sc.next().charAt(0);
                }
                
            }
            else if (opcion=='l')
            {
                System.out.println("\ningresa la opcion para leer: Partido (p), Inmueble (i), Habitante (h), EspacioPublico(e), Ayuntamiento(a), salir (s)");
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
                        int edad;*//*
                        //habi.setNombre("iosu");
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
                        System.out.println("\nNo se selecciono la opcion correcta 2");//opcion2
                    } 
                    System.out.println("\ningresa la opcion para leer: Partido (p), Inmueble (i), Habitante (h), EspacioPublico(e), Ayuntamiento(a), salir (s)");
                    opcion2 = sc.next().charAt(0);
                }    
            }        
            else
            {
                System.out.println("\nNo se selecciono la opcion correcta 1");//opcion1
            }
            System.out.println("\ningresa la opcion: registrar (r), leer (l), salir (s)");
            opcion = sc.next().charAt(0);
        }*/
        
        System.out.println("\n\nEGUN ONA IZAN!!\n");
    }
}