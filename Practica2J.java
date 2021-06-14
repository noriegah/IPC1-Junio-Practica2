import java.util.*;

public final class Practica2J {
    public static void main(String [] args){
    Practica2J t=new Practica2J();
}
    Scanner entrada = new Scanner(System.in);
    
    //clientes para 10
    String[] nombreC=new String[10];
    int idC[]=new int[10];
    int telefonoC[]=new int[10];
    boolean [] tienePeliculaPrestada=new boolean[10];
    
    //Peliculas para 10
    int idP[]=new int[10];
    String nombreP[]={"z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z","z"};
    int anoP[]=new int[10];
    String categoria[]=new String[10];
    boolean disponibleP[]=new boolean[10];

    //Prestamo Peliculas
    int idPrestada[]=new int[15];
    int idClientePresto[]=new int[15];
    int dias[]=new int[15];
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
    System.out.println("  Historia");
    System.out.println("  Comedia ");
    System.out.println("  Drama");
    System.out.println("  Fantasia");
    System.out.println("  Accion");
    System.out.println("  Ciencia ficcion");
    System.out.println("  Animada");
    System.out.println("  Terror");
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
}

    public void MostrarPeliculas(){
        for (int i=1; i<=contadorPelisag; i++){
        System.out.println("-ID:"+idP[i]+" -Nombre:"+nombreP[i]+" -Ano de Estreno:"+anoP[i]+" -Categoria:"+categoria[i]);
        }
    }
    public void MostrarClientes(){
        for (int k=1; k<=contadorClientesag; k++){
            System.out.println("-ID:"+idC[k]+" -Nombre:"+nombreC[k]+" -Télefono:"+telefonoC[k]);
        }
    }
}