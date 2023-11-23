package paquetes;

public class CityTour {
    private final String Id;
    private final String nombre;
    private final String descripcion;
    private final String recomendaciones;
    private final int duracion;

    public CityTour(String Id, String nombre, String descripcion, String recomendaciones, int duracion) {
        this.Id = Id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.recomendaciones = recomendaciones;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return String.format("CityTour (%n" +
                        "  id = %s,%n" +
                        "  Nombre = %s,%n" +
                        "  Descripción = %s,%n" +
                        "  Recomendaciones = %s,%n" +
                        "  Duración = %d horas%n)",
                Id, nombre, descripcion, recomendaciones, duracion);
    }
}
