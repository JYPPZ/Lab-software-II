package paquetes;

import Interface.IPaqueteComponent;

import java.util.List;

public class PaqueteCiudad implements IPaqueteComponent {
    private final String nombreCiudad;
    private final String checkIn;
    private final String checkOut;
    private final String vuelo;
    private final String hotel;
    private final String planComida;
    private final CityTour cityTour;

    public PaqueteCiudad(String nombreCiudad, String checkIn, String checkOut, String vuelo, String hotel, String planComida, CityTour cityTour) {
        this.nombreCiudad = nombreCiudad;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.planComida = planComida;
        this.cityTour = cityTour;
    }

    @Override
    public void agregar(IPaqueteComponent componente) {
        //
    }

    @Override
    public String mostrarInformacion() {
        return "Ciudad: " + nombreCiudad + "\n"
                + "  Vuelo: " + vuelo + "\n"
                + "  Hotel: " + hotel + "\n"
                + "  Plan de Comida: " + planComida + "\n"
                + "  Check In Date: " + checkIn + "\n"
                + "  Check Out Date: " + checkOut + "\n"
                + "  City Tour: " + cityTour.toString() + "\n";
    }

    @Override
    public List<IPaqueteComponent> getComponentes() {
        return null;
    }
}
