import java.util.*;
import java.io.*;
public class Elecciones 
{
    public static void main (String args[]) throws IOException 
	{
        String nombre_hab, siglas, presi, nombre_rep, nombre_par, nombre_esp, direccion_hab, direccion_ayu, direccion_esp, direccion_inmu, apellido1, apellido2;
        /*String[] repres = new String[10];*/
        int edad, poblacion_ayu, poblacion_inmu;
        char opcion, opcion2;

        
        Partido party = new Partido("","","");
        Inmueble inmu = new Inmueble();
        Habitante habi = new Habitante("","","",0,"");
        EspacioPublico espacio = new EspacioPublico();
        Ayuntamiento ayu = new Ayuntamiento();
        ArrayList <String> lista_partidos = new ArrayList <String> ();
            
        /* 
            Partido
        String nombre;
        String[] repres = new String[10];
        */
        
        party.setNombre("partido burrito");
        party.setSiglas("PB");
        party.setPresi("Pman");
        /*repres[0] = "1";
		repres[1] = "2";
		repres[2] = "3";
		repres[3] = "4";
		repres[4] = "5";
		repres[5] = "6";
		repres[6] = "7";
		repres[7] = "8";
		repres[8] = "9";
		repres[9] = "10";
        party.setRepres(repres);*/
        
        nombre_par=party.getNombre();
        siglas=party.getSiglas();
        presi=party.getPresi();
        /*repres=party.getRepres();*/
        
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
        //System.out.println("\n nombre: " + nombre_par +/* "\n representantes: \n"*/ "\n siglas: " + siglas + "\n presidente: " + presi);
        System.out.println("\n nombre: " + nombre_par + "\n siglas: " + siglas + "\n presidente: " + presi);
        
        /*for (int i=0; i < repres.length; i++)
		{
			nombre_rep = repres[i];
			System.out.println(nombre_rep);
		}*/
        
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
        /*
        while((s = br.readLine()) != null) 
        { 
            lista_partidos.add(s);
            //System.out.println(s);
        }
        System.out.println("muestra el contenido del arraylist");
        for(int i=0; i<lista_partidos.size(); i++)
		{
			System.out.println("    "+lista_partidos.get(i));
		}
        */
        // Vaciar el ArrayList
		lista_partidos.clear();
		
        //ArrayList <Partido> al_party = new ArrayList <Partido> ();	
       /* String[] a_party = new String[3];
        System.out.println("los partidos que se presentan a las elecciones");
	    while((s = br.readLine()) != null) 
        { 
            a_party=s.split(",");
            for(int y=0; y<3; y++)
            { 
                if (y==0)
                {
                    System.out.print("nombre : ");
                }
                else if (y==1)
                {
                    System.out.print("  siglas: ");
                }
                else
                {
                    System.out.print("  presidente: ");
                }
                System.out.print(" " + a_party[y]);
            }
            System.out.println();
        }*/
        /*for(int i=0; i<a_party.size(); i++)
		{
			System.out.println("    "+a_party.get(i));
		}*/
         
        ArrayList <Partido> al_party = new ArrayList <Partido> ();
        String zzz1="", zzz2="", zzz3=""; 

        while((s = br.readLine()) != null) 
        { 
            StringTokenizer st = new StringTokenizer(s);
            for(int y=0; y<3; y++)
            { 
                String zzz = st.nextToken(",");
                if (y==0)
                {
                    //nombre
                    zzz1=zzz;
                }
                else if (y==1)
                {
                    //siglas
                    zzz2=zzz;
                }
                else
                {
                    //presidente
                    zzz3=zzz;
                }
            }
            al_party.add(new Partido(zzz1,zzz2,zzz3));
            System.out.println();
        }
        for(int i=0; i<al_party.size(); i++)
        {
            System.out.print("  nombre: "+al_party.get(i).getNombre() +" siglas: "+al_party.get(i).getSiglas()+" presidente: "+ al_party.get(i).getPresi());
        }
            
        // Vaciar el ArrayList
        al_party.clear();
        
        System.out.println();
        
        // censo personas
        System.out.println("\n Censo: ");
        FileReader fr2 = new FileReader("censo.txt");
        BufferedReader br2 = new BufferedReader(fr2); 
                
        ArrayList <Habitante> al_habi = new ArrayList <Habitante> ();
        String zz1="", zz2="", zz3="", zz5=""; 
        int zz4=0;

        while((s = br.readLine()) != null) 
        { 
            StringTokenizer st = new StringTokenizer(s);
            for(int y=0; y<3; y++)
            { 
                String zz = st.nextToken(",");
                if (y==0)
                {
                    //nombre
                    zz1=zz;
                }
                else if (y==1)
                {
                    //siglas
                    zz2=zz;
                }
                else if (y==2)
                {
                    //presidente
                    zz3=zz;
                }
                else if (y==3)
                {
                    //presidente
                    int zx = Integer.parseInt(zz);                    
                    zz4=zx;
                }
                else
                {
                    //presidente
                    zz5=zz;
                }
            }
            al_habi.add(new Habitante(zz1,zz2,zz3,zz4,zz5));
            System.out.println();
        }
            for(int i=0; i<al_habi.size(); i++)
		    {
			    System.out.print("  nombre: "+al_habi.get(i).getNombre() +" primer apellido: "+al_habi.get(i).getApellido1()+" segundo apellido: "+ al_habi.get(i).getApellido2()+" edad: "+ al_habi.get(i).getEdad()+" direccion: "+ al_habi.get(i).getDireccion());
		    }

            // Vaciar el ArrayList
            al_habi.clear();
        
     
        System.out.println("\n\nEGUN ONA IZAN!!\n");
    }
}