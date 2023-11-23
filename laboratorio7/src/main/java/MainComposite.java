import Interface.IPaqueteComponent;
import paquetes.CityTour;
import paquetes.PaqueteCiudad;
import paquetes.PaqueteContinental;
import paquetes.PaquetePais;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainComposite {
    static List<PaqueteCiudad> ciudades = new ArrayList<>();
    static List<PaquetePais> paises = new ArrayList<>();
    static List<PaqueteContinental> continentes = new ArrayList<>();
    static PaqueteContinental continente;

    public static void main(String[] args) {

            quemaInfo();
            Scanner sc = new Scanner(System.in);
            int opcion;
            do{
                System.out.println("\t--Bienvenido a agencia de viajes--\n");
                System.out.println("Elija una opción...");
                System.out.println("1) Agregar y ver información del tour.");
                System.out.println("2) salir.");
                System.out.print("--------------->");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1 -> {
                        System.out.println("¿A qué continente le gustaría viajar?");
                        for (int i = 0; i < continentes.size(); i++) {
                            continente = continentes.get(i);
                            System.out.println("Índice " + i + ": " + continente.getNombre());
                        }

                        try {
                            int indiceContinente = sc.nextInt();
                            PaqueteContinental continenteSeleccionado = continentes.get(indiceContinente);

                            // Mostrar información del continente seleccionado
                            System.out.println("Has seleccionado viajar a " + continenteSeleccionado.getNombre());

                            // Mostrar los países disponibles en el continente
                            System.out.println("Países en " + continenteSeleccionado.getNombre() + ":");
                            for (int i = 0; i < continenteSeleccionado.getComponentes().size(); i++) {
                                IPaqueteComponent pais = continenteSeleccionado.getComponentes().get(i);
                                System.out.println("Índice " + i + ": " + pais.mostrarInformacion());
                            }

                            // Elegir un país
                            System.out.println("¿A qué país le gustaría viajar?");
                            int indicePais = sc.nextInt();
                            PaquetePais paisSeleccionado = (PaquetePais) continenteSeleccionado.getComponentes().get(indicePais);

                            // Mostrar información del país seleccionado
                            System.out.println("Has seleccionado viajar a " + paisSeleccionado.getNombre());

                            // Mostrar las ciudades disponibles en el país
                            System.out.println("Ciudades en " + paisSeleccionado.getNombre() + ":");
                            for (int i = 0; i < paisSeleccionado.getComponentes().size(); i++) {
                                IPaqueteComponent ciudad = paisSeleccionado.getComponentes().get(i);
                                System.out.println("Índice " + i + ": " + ciudad.mostrarInformacion());
                            }
                        } catch (IndexOutOfBoundsException | InputMismatchException e) {
                            System.out.println("¡Opción inválida! Asegúrate de ingresar un índice válido.");
                        }

                    }
                    case 2 -> System.out.println("Adios");
                }
            }while (opcion != 2);
        }
    static void quemaInfo(){
        //ciudades
        PaqueteCiudad madrid = new PaqueteCiudad("Madrid", "10/08/2023",
                "28/11/2023", "Iberia IB587", "Hotel Gran Maestro",
                "Desayuno y almeurzo incluido",
                new CityTour("1", "primer tour", "Recorrido por la ciudad de los 15 minutos",
                        "Use protector solar", 2));
        PaqueteCiudad nuevaYork = new PaqueteCiudad("Nueva York", "10/08/2023",
                "28/11/2023", "Delta Airlines DL101", "Hotel Estrellas",
                "Desayuno incluido",
                new CityTour("1", "Tour en Manhattan", "Exploración de los lugares icónicos de Manhattan",
                        "Llevar cámara para fotos", 3));
        PaqueteCiudad dubai = new PaqueteCiudad("Dubái", "10/08/2023",
                "28/11/2023", "Emirates EK202", "Hotel del Desierto",
                "Cena bajo las estrellas",
                new CityTour("1", "Tour por el Desierto", "Aventura en el desierto con safari",
                        "Ropa cómoda y gafas de sol", 4));
        PaqueteCiudad sidney = new PaqueteCiudad("Sídney", "10/08/2023",
                "28/11/2023", "Qantas QF501", "Hotel Océano",
                "Excursión a la Ópera de Sídney",
                new CityTour("1", "Tour por Sídney", "Descubre los encantos de la ciudad",
                        "Zapatos cómodos para caminar", 5));
        //agregar a lista
        ciudades.add(madrid);
        ciudades.add(nuevaYork);
        ciudades.add(dubai);
        ciudades.add(sidney);

        //paises
        PaquetePais spain = new PaquetePais("España");
        spain.agregar(madrid);
        PaquetePais usa = new PaquetePais("Estados Unidos");
        usa.agregar(nuevaYork);
        PaquetePais arabia = new PaquetePais("Arabia Saudita");
        arabia.agregar(dubai);
        PaquetePais australia = new PaquetePais("Australia");
        australia.agregar(sidney);
        //agregar a lista
        paises.add(spain);
        paises.add(usa);
        paises.add(arabia);
        paises.add(australia);

        //continentes
        PaqueteContinental europa = new PaqueteContinental("Europa");
        europa.agregar(spain);
        PaqueteContinental norteAmerica = new PaqueteContinental("Norte America");
        norteAmerica.agregar(usa);
        PaqueteContinental orienteMedio = new PaqueteContinental("Oriente Medio");
        orienteMedio.agregar(arabia);
        PaqueteContinental oceania = new PaqueteContinental("Oceania");
        oceania.agregar(australia);
        //agregar a lista
        continentes.add(europa);
        continentes.add(norteAmerica);
        continentes.add(orienteMedio);
        continentes.add(oceania);
    }
}
