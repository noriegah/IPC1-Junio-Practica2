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
}