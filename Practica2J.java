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
