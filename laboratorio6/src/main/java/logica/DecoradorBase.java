package logica;

public class DecoradorBase implements IPaqueteTuristico {
    protected double precio;
    protected int duracion;
    protected String descripcion;

    public DecoradorBase() {
        this.precio = 7000.0;
        this.duracion =  5;
        this.descripcion = """
                  --Paquete Base--\s
                 -Tiquetes aéreos\s
                 -Hotel en habitación estándar
                 -Alimentación
                 -Vuelta a la isla
                 -Camiseta de Millonarios""";
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
}
