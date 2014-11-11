import java.util.*;
import java.io.*;
public class Elecciones 
{
    public static void main (String args[]) throws IOException 
	{
        String nombre_hab, nombre_rep, nombre_par, nombre_esp, direccion_hab, direccion_ayu, direccion_esp, direccion_inmu, apellido1, apellido2;
        String[] repres = new String[10];
        int edad, poblacion_ayu, poblacion_inmu;
        char opcion, opcion2;

        
        Partido party = new Partido();
        Inmueble inmu = new Inmueble();
        Habitante habi = new Habitante();
        EspacioPublico espacio = new EspacioPublico();
        Ayuntamiento ayu = new Ayuntamiento();
        ArrayList <String> lista_partidos = new ArrayList <String> ();
            
        /* 
            Partido
        String nombre;
        String[] repres = new String[10];
        */
        
        party.setNombre("partido burrito");
        repres[0] = "1";
		repres[1] = "2";
		repres[2] = "3";
		repres[3] = "4";
		repres[4] = "5";
		repres[5] = "6";
		repres[6] = "7";
		repres[7] = "8";
		repres[8] = "9";
		repres[9] = "10";
        party.setRepres(repres);
        
        nombre_par=party.getNombre();
        repres=party.getRepres();
        
        /*for (int i=0; i < repres.length; i++)
		{
			repres2[i] = repres[i];
		}*/
		
        /*
            Inmueble
        String direccion;
        int setDireccion;
        */
        
        inmu.setDireccion("calle desconodida");
        inmu.setPoblacion(35);
        
        direccion_inmu=inmu.getDireccion();  
        poblacion_inmu=inmu.getPoblacion();
        
        /*
            Habitante
        String nombre, apellido1, apellido2, direccion;
        int edad;
        */
        
        habi.setNombre("Iosu");
        habi.setApellido1("Rec");
        habi.setApellido2("Man");
        habi.setDireccion("calle desconodida");
        habi.setEdad(50);
        
        nombre_hab=habi.getNombre();
        apellido1=habi.getApellido1();
        apellido2=habi.getApellido2();
        direccion_hab=habi.getDireccion();
        edad=habi.getEdad();
        
        /*
            EspacioPublico
        String nombre, direccion;
        */
        
        espacio.setNombre("Biblioteca nueva");
        espacio.setDireccion("calle 123");
        
        nombre_esp=espacio.getNombre();
        direccion_esp=espacio.getDireccion();
        
        /*
            Ayuntamiento
        String direccion;
        int poblacion;    
        */
        ayu.setDireccion("calle mayor");
        ayu.setPoblacion(200);
        
        direccion_ayu=ayu.getDireccion();
        poblacion_ayu=ayu.getPoblacion();   
        
        System.out.println("\n Inmueble");
        System.out.println("\n direccion: " + direccion_inmu + "\n poblacion: " + poblacion_inmu);
        System.out.println();

        System.out.println("\n Partido");
        System.out.println("\n nombre: " + nombre_par + "\n representantes: \n");
        
        for (int i=0; i < repres.length; i++)
		{
			nombre_rep = repres[i];
			System.out.println(nombre_rep);
		}
        
        System.out.println();
        
        System.out.println("\n Habitante");
        System.out.println("\n nombre: " + nombre_hab + "\n apellido 1: " + apellido1 + "\n apellido 2: " + apellido2 + "\n direccion: " + direccion_hab + "\n edad: " + edad);
        System.out.println();
        
        System.out.println("\n EspacioPublico");
        System.out.println("\n nombre_esp: " + nombre_esp + "\n direccion: " + direccion_esp);
        System.out.println();

        System.out.println("\n Ayuntamiento");
        System.out.println("\n direccion: " + direccion_ayu + "\n poblacion: " + poblacion_ayu); 
        System.out.println();
        
        System.out.println();
        System.out.println("\n Partidos que van a participar en las elecciones: ");
        
        FileReader fr = new FileReader("listadoPartidos.txt");
        BufferedReader br = new BufferedReader(fr); 
        String s; 
        while((s = br.readLine()) != null) 
        { 
            lista_partidos.add(s);
            //System.out.println(s);
        }
        
        for(int i=0; i<lista_partidos.size(); i++)
		{
			System.out.println("    "+lista_partidos.get(i));
		}
        
        // Vaciar el ArrayList
		lista_partidos.clear();
		
        System.out.println();
        /*Scanner sc = new Scanner(System.in);
        System.out.println("\ningresa la opcion: registrar (r), leer (l), salir (s)");
        opcion = sc.next().charAt(0);
         
        while (opcion!='s')
        {
            
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