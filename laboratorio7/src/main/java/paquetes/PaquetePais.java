package paquetes;

import Interface.IPaqueteComponent;

import java.util.ArrayList;
import java.util.List;

public class PaquetePais implements IPaqueteComponent {
    private final String nombre;
    private final List<IPaqueteComponent> paquetesCiudad;

    public String getNombre() {
        return nombre;
    }

    public PaquetePais(String nombrePais) {
        this.nombre = nombrePais;
        paquetesCiudad = new ArrayList<>();
    }

    @Override
    public void agregar(IPaqueteComponent componente) {
        paquetesCiudad.add(componente);
    }

    @Override
    public String mostrarInformacion() {
        return String.format("Pais -> %s\n", nombre);
    }

    @Override
    public List<IPaqueteComponent> getComponentes() {
        return paquetesCiudad;
    }
}
