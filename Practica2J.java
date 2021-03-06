import java.util.*;

public final class Practica2J {
    public static void main(String [] args){
    Practica2J t=new Practica2J();
}
    Scanner entrada = new Scanner(System.in);
    
    //clientes para 20
    String[] nombreC=new String[20];
    int idC[]=new int[20];
    int telefonoC[]=new int[20];
    boolean [] tienePeliculaPrestada=new boolean[20];
    
    //Peliculas para 20
    int idP[]=new int[20];
    String nombreP[]={"z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z"};
    int anoP[]=new int[20];
    String categoria[]=new String[20];
    boolean disponibleP[]=new boolean[20];

    //Prestamo Peliculas
    int idPrestada[]=new int[20];
    int idClientePresto[]=new int[20];
    int dias[]=new int[20];
    int seleccionMenu;
    int contadorPelisag=0;
    int contadorClientesag=0;
    int []controlP=new int[20];
    int[] contadoresPeliculaCategoria=new int[20];
    int vPrestada[]=new int[20];

    public Practica2J(){
        ImpresionMenu();
    }

    public void ImpresionMenu(){
        System.out.println("Bienvenido a MEMORABILIA ");
        int banderaMenu=1;
        do{
        System.out.println("Ingrese una opcion");
        System.out.println("    1. PRESTAMO DE PELICULAS");
        System.out.println("    2. DEVOLUCION DE PELICULAS");
        System.out.println("    3. MOSTRAR PELICULAS");
        System.out.println("    4. INGRESO PELICULAS");
        System.out.println("    5. ORDENAR PELICULAS");
        System.out.println("    6. INGRESAR CLIENTES");
        System.out.println("    7. MOSTRAR CLIENTES");
        System.out.println("    8. REPORTES");
        System.out.println("    9. SALIR");
        System.out.println("Ingrese el numero de opcion que desea ejecutar");
        seleccionMenu = entrada.nextInt();

        switch(seleccionMenu){
            case 1:
                                System.out.println("---------PRESTAMO DE PELICULAS----------");
                                PrestamoPeliculas();
                break;
            case 2:
                                System.out.println("---------DEVOLUCION DE PELICULAS--------");
                                DevolucionPeliculas();
                break;
            case 3:
                                System.out.println("----------MOSTRAR PELICULAS-------------");
                                MostrarPeliculas();
                break;
            case 4:
                                System.out.println("----------INGRESAR PELICULA-------------");
                                IngresarPeliculas();
                break;
            case 5:
                                System.out.println("----------ORDENAR-----------------------");
				Ordenar();
                break;
            case 6:
                                System.out.println("-------INGRESAR CLIENTE-----------------");
                                IngresarClientes();
                break;
            case 7:
                                System.out.println("-------MOSTRAR CLIENTES-----------------");
                                MostrarClientes();
                break;
            case 8:
                                System.out.println("------------REPORTES--------------------");
				Reportes();
                break;
            case 9:
                banderaMenu=0;
                                System.out.println("-------VUELVA PRONTO----------------");
                break;
            default: System.out.println("El dato ingresado no esta dentro del numero de opciones");
        }
        }while(banderaMenu!=0);
	System.out.println("\n\n");
}

    public void IngresarClientes(){
        int indice;//indice sera num id cliente
        System.out.println("Ingrese Numero de ID");
        indice=entrada.nextInt();
        idC[indice]=indice;
        entrada.nextLine();
        System.out.println("Ingrese el Nombre del Cliente");
        nombreC[indice]=entrada.nextLine();
        System.out.println("Ingrese numero de Telefono");
        telefonoC[indice]=entrada.nextInt();
        tienePeliculaPrestada[indice]=false;
        contadorClientesag+=1;
	System.out.println("\n\n");
    }
    
    public void IngresarPeliculas(){
    int indice; //indice sera num id de pelicula
    System.out.println("Ingrese Numero ID de pelicula");
    indice=entrada.nextInt();
    entrada.nextLine();
    idP[indice]=indice;
    System.out.println("Ingrese el Nombre de la Pelicula");
    nombreP[indice]=entrada.nextLine();
    System.out.println("Ingrese el ano de estreno de la Pelicula");
    anoP[indice]=entrada.nextInt();
    entrada.nextLine();
    System.out.println("Ingrese el nombre de la Categoria a la que pertenece");
    System.out.println("  -Historia");
    System.out.println("  -Comedia ");
    System.out.println("  -Drama");
    System.out.println("  -Fantasia");
    System.out.println("  -Accion");
    System.out.println("  -Ciencia ficcion");
    System.out.println("  -Animada");
    System.out.println("  -Terror");
    categoria[indice]=entrada.nextLine();
    disponibleP[indice]=false;
    contadorPelisag+=1;
    if("Historia".equals(categoria[indice]) || "historia".equals(categoria[indice])){
        contadoresPeliculaCategoria[0]+=1;
    } 
    if("Comedia".equals(categoria[indice]) || "comedia".equals(categoria[indice])){
        contadoresPeliculaCategoria[1]+=1;
    } 
    if("Drama".equals(categoria[indice]) || "drama".equals(categoria[indice])){
        contadoresPeliculaCategoria[2]+=1;
    } 
    if("Fantasia".equals(categoria[indice]) || "fantasia".equals(categoria[indice])){
        contadoresPeliculaCategoria[3]+=1;
    } 
    if("Accion".equals(categoria[indice]) || "accion".equals(categoria[indice])){
        contadoresPeliculaCategoria[4]+=1;
    } 
    if("ciencia ficcion".equals(categoria[indice]) || "Ciencia ficcion".equals(categoria[indice])){
        contadoresPeliculaCategoria[5]+=1;
    } 
    if("Animada".equals(categoria[indice]) || "animada".equals(categoria[indice])){
        contadoresPeliculaCategoria[6]+=1;
    } 
    if("Terror".equals(categoria[indice]) || "terror".equals(categoria[indice])){
        contadoresPeliculaCategoria[7]+=1;
    } 
System.out.println("\n\n");
}

    public void MostrarPeliculas(){
        for (int i=1; i<=contadorPelisag; i++){
        System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
        }
        System.out.println("\n\n");
    }

    public void MostrarClientes(){
        for (int k=1; k<=contadorClientesag; k++){
            System.out.println("-ID:"+idC[k]+" -Nombre:"+nombreC[k]+" -T??lefono:"+telefonoC[k]);
        }
	System.out.println("\n\n");
    }

    public void Ordenar(){
        Arrays.sort(nombreP);
        for (int i=0; i<nombreP.length; i++){
             System.out.println(nombreP[i]);
        }
	System.out.println("\n\n");
    }

    public void PrestamoPeliculas(){
        System.out.println("Ingrese el ID del cliente");
        int cliente=entrada.nextInt();
       if(tienePeliculaPrestada[cliente]==false){
           System.out.println("---LISTA DE PELICULAS DISPONIBLES-----");
        for (int i=1; i<=contadorPelisag; i++){
            if (disponibleP[i]==false){
              System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);  
            }
        }
    System.out.println("Ingrese el ID de la pelicula que desea Prestar");
    int prestar=entrada.nextInt();
    disponibleP[prestar]=true;
    System.out.println("Ingrese la cantidad de d??as que la tendra");
    dias[prestar]=entrada.nextInt();
    tienePeliculaPrestada[cliente]=true;
    controlP[prestar]=cliente;
    vPrestada[prestar]+=1;
       }else{
           System.out.println("El Cliente ya tiene actualmente una pelicula prestada");
       }
	System.out.println("\n\n");
    }

    public void DevolucionPeliculas(){
        System.out.println("Ingrese el ID del cliente");
        int cliente=entrada.nextInt();
        if (tienePeliculaPrestada[cliente]==true){
            System.out.println("---LISTA DE PELICULAS PRESTADAS");
            for(int i=1; i<=contadorPelisag; i++){
                if(disponibleP[i]==true){
                    System.out.println("-ID:"+idP[i]+" -Pelicula:"+nombreP[i]+" -Cliente:"+nombreC[controlP[i]]);
                }
            }
        System.out.println("Ingrese el ID de a pelicula que desea Devolver");
        int devolver=entrada.nextInt();
        disponibleP[devolver]=false;
        tienePeliculaPrestada[cliente]=false;
        }else{
            System.out.println("El cliente no tiene ninguna pelicula para devolver");
        }
	System.out.println("\n\n");
    }

    public void Reportes(){
        //numero de peliculas por categoria
        System.out.println("-----------REPORTES-----------");
        System.out.println("  1. Cantidad de Peliculas por Categoria");
        System.out.println("  2. Peliculas de una Categoria en Especifico");
        System.out.println("  3. Cantidad de veces que se ha prestado una pelicula");
        System.out.println("  4. Pelicula mas y menos prestada");
        System.out.println(" Ingrese el numero de opcion que desea ejecutar");
        int banderaR=entrada.nextInt();
        switch(banderaR){
            case 1:    
                System.out.println("Numero de peliculas de Historia"+contadoresPeliculaCategoria[0]);
                System.out.println("Numero de Peliculas de Comedia"+contadoresPeliculaCategoria[1]);
                System.out.println("Numero de Peliculas de Drama"+contadoresPeliculaCategoria[2]);
                System.out.println("Numero de peliculas de Fantasia"+contadoresPeliculaCategoria[3]);
                System.out.println("Numero de peliculas de Accion"+contadoresPeliculaCategoria[4]);
                System.out.println("Numero de peliculas de Ciencia Ficcion"+contadoresPeliculaCategoria[5]);
                System.out.println("Numero de peliculas Animadas"+contadoresPeliculaCategoria[6]);
                System.out.println("Numero de peliculas de Terror"+contadoresPeliculaCategoria[7]);
                break;
            case 2:
                System.out.println("Ingrese el numero de Categoria que desea ver");
                System.out.println(" 1. Historia");
                System.out.println(" 2. Comedia");
                System.out.println(" 3. Drama");
                System.out.println(" 4. Fantasia");
                System.out.println(" 5. Accion");
                System.out.println(" 6. Ciencia Ficcion");
                System.out.println(" 7. Animada");
                System.out.println(" 8. Terror");
                int selec=entrada.nextInt();
                switch(selec){
                    case 1:
                    for(int i=0; i<=contadorPelisag; i++){
                        if("Historia".equals(categoria[i]) || "historia".equals(categoria[i])){
                            System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
                        } 
                    }
                        break;
                    case 2:
                        for(int i=0; i<=contadorPelisag; i++){
                        if("Comedia".equals(categoria[i]) || "comedia".equals(categoria[i])){
                            System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
                        } 
                    }
                        break;
                    case 3:
                        for(int i=0; i<=contadorPelisag; i++){
                        if("Drama".equals(categoria[i]) || "drama".equals(categoria[i])){
                            System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
                        } 
                    }
                        break;
                    case 4:
                        for(int i=0; i<=contadorPelisag; i++){
                        if("Fantasia".equals(categoria[i]) || "fantasia".equals(categoria[i])){
                            System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
                        } 
                    }
                        break;
                    case 5:
                        for(int i=0; i<=contadorPelisag; i++){
                        if("Accion".equals(categoria[i]) || "accion".equals(categoria[i])){
                            System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
                        } 
                    }
                        break;
                    case 6:
                        for(int i=0; i<=contadorPelisag; i++){
                        if("Ciencia ficcion".equals(categoria[i]) || "ciencia ficcion".equals(categoria[i])){
                            System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
                        } 
                    }
                        break;
                    case 7:
                        for(int i=0; i<=contadorPelisag; i++){
                        if("Animada".equals(categoria[i]) || "animada".equals(categoria[i])){
                            System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
                        } 
                    }
                        break;
                    case 8:
                        for(int i=0; i<=contadorPelisag; i++){
                        if("Terror".equals(categoria[i]) || "terror".equals(categoria[i])){
                            System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
                        } 
                    }
                        break;
                }
                break;
            case 3:
                for(int i=1; i<=contadorPelisag;i++){
                    System.out.println("-Nombre:"+nombreP[i]+" ha sido prestada:"+vPrestada[i]+" veces.");
                }
                break;
            case 4:
                break;
            default: System.out.println("El numero ingresado no esta dentro de las opciones");
        }
	System.out.println("\n\n");
    }
}
	

