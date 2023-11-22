package logica;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final Control controller = new Control();

    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        int opcion;
        do {
            System.out.println("------MENU PRINCIPAL------");
            System.out.println("1. Individual");
            System.out.println("2. Familiar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 ->
                    menuPaquetes();
                case 2 ->{
                    System.out.println("Ingrese la cantidad de miembros de la familia:");
                    int cantidad = sc.nextInt();
                    menuPaquetes(cantidad);
                }
                case 3 ->
                    System.out.println("Adios");
            }
        }while(opcion != 3);
    }
    
    private static void menuPaquetes(){
        int opcion;
        do {
            System.out.println("Configuración Individual de Planes Turísticos en Hawaii");
            System.out.println("1. Agregar paquete Pearl Harbor");
            System.out.println("2. Agregar paquete Nature");
            System.out.println("3. Agregar paquete Amazing Hawaii");
            System.out.println("4. Ver cotización");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    DecoradorBase pearlHarbor = new PaquetePearlHarbor();
                    if (!controller.getPaquetesDecoradosFamilia().contains(pearlHarbor)) {
                        controller.agregarPaqueteIndividual(pearlHarbor);
                        System.out.println("Paquete Pearl Harbor agregado.");
                    } else {
                        System.out.println("El paquete Pearl Harbor ya está agregado.");
                    }
                }
                case 2 -> {
                    DecoradorBase nature = new PaqueteNature();
                    if (!controller.getPaquetesDecoradosFamilia().contains(nature)) {
                        controller.agregarPaqueteIndividual(nature);
                        System.out.println("Paquete Nature agregado.");
                    } else {
                        System.out.println("El paquete Nature ya está agregado.");
                    }
                }
                case 3 -> {
                    DecoradorBase amazingHawaii = new PaqueteAmazingHawaii();
                    if (!controller.getPaquetesDecoradosFamilia().contains(amazingHawaii)) {
                        controller.agregarPaqueteIndividual(amazingHawaii);
                        System.out.println("Paquete Amazing Hawaii agregado.");
                    } else {
                        System.out.println("El paquete Amazing Hawaii ya está agregado.");
                    }
                }
                case 4 ->
                    controller.mostrarCotizacion(false, 1);
                case 5 -> System.out.println("Adios");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }
    private static void menuPaquetes(int cantidad){
        
        int opcion;
        do {
            System.out.println("--Configuración Familiar de Planes Turísticos en Hawaii--");
            System.out.println("1. Agregar paquete Pearl Harbor");
            System.out.println("2. Agregar paquete Nature");
            System.out.println("3. Agregar paquete Amazing Hawaii");
            System.out.println("4. Ver cotización");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    DecoradorBase pearlHarbor = new PaquetePearlHarbor();
                    if (!controller.getPaquetesDecoradosFamilia().contains(pearlHarbor)) {
                        controller.agregarPaqueteFamiliar(pearlHarbor);
                        System.out.println("Paquete Pearl Harbor agregado.");
                    } else {
                        System.out.println("El paquete Pearl Harbor ya está agregado.");
                    }
                    
                }
                case 2 -> {
                    DecoradorBase nature = new PaqueteNature();
                    if (!controller.getPaquetesDecoradosFamilia().contains(nature)) {
                        controller.agregarPaqueteFamiliar(nature);
                        System.out.println("Paquete Nature agregado.");
                    } else {
                        System.out.println("El paquete Nature ya está agregado.");
                    }
                }
                case 3 -> {
                    DecoradorBase amazingHawaii = new PaqueteAmazingHawaii();
                    if (!controller.getPaquetesDecoradosFamilia().contains(amazingHawaii)) {
                        controller.agregarPaqueteFamiliar(amazingHawaii);
                        System.out.println("Paquete Amazing Hawaii agregado.");
                    } else {
                        System.out.println("El paquete Amazing Hawaii ya está agregado.");
                    }
                }
                case 4 ->
                    controller.mostrarCotizacion(true, cantidad);
                case 5 -> System.out.println("Adios");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }
}
