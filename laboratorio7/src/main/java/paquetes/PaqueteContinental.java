package paquetes;

import Interface.IPaqueteComponent;

import java.util.ArrayList;
import java.util.List;

public class PaqueteContinental implements IPaqueteComponent {
    String nombre;
    private final List<IPaqueteComponent> paquetesPais;

    public String getNombre() {
        return nombre;
    }

    public PaqueteContinental(String nombre) {
        this.nombre = nombre;
        paquetesPais = new ArrayList<>();
    }

    @Override
    public void agregar(IPaqueteComponent componente) {
        paquetesPais.add(componente);
    }

    @Override
    public String mostrarInformacion() {
        return String.format("Continente -> %s\n", nombre);
    }

    @Override
    public List<IPaqueteComponent> getComponentes() {
        return paquetesPais;
    }
}
