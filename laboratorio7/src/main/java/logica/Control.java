package logica;

import java.util.ArrayList;
import java.util.List;

public class Control {
    private final List<DecoradorBase> paquetesDecoradosIndividual = new ArrayList<>();
    private final List<DecoradorBase> paquetesDecoradosFamilia = new ArrayList<>();
    private final DecoradorBase miPaqueteBase = new DecoradorBase();

    public void agregarPaqueteIndividual(DecoradorBase paquete) {
        paquetesDecoradosIndividual.add(paquete);
    }

    public void agregarPaqueteFamiliar(DecoradorBase paquete) {
        paquetesDecoradosFamilia.add(paquete);
    }

    public void mostrarCotizacion(boolean esFamiliar, int cantidad) {
        System.out.println("Cotización del Plan Turístico " + (esFamiliar ? "Familiar" : "Individual") + " en Hawaii:");
        System.out.println("--------Paquete Base--------");
        System.out.println("Precio: $" + miPaqueteBase.getPrecio() + (esFamiliar ? " por persona." : ""));
        System.out.println("Duración: " + miPaqueteBase.getDuracion() + " días");
        System.out.println(miPaqueteBase.getDescripcion());
        mostrarPaquetesAdicionales(esFamiliar);
        calcularTotales(esFamiliar, cantidad);
    }

    private void mostrarPaquetesAdicionales(boolean esFamiliar) {
        List<DecoradorBase> paquetesDecorados = esFamiliar ? paquetesDecoradosFamilia : paquetesDecoradosIndividual;
        if (!paquetesDecorados.isEmpty()) {
            System.out.println("--------Paquetes Adicionales--------");
            for (DecoradorBase paqueteDecorado : paquetesDecorados) {
                System.out.println(paqueteDecorado.getDescripcion());
                System.out.println("Precio: $" + paqueteDecorado.getPrecio() + (esFamiliar ? " por persona." : ""));
                System.out.println("Duración: " + paqueteDecorado.getDuracion() + " días\n");
            }
        }
    }

    private void calcularTotales(boolean esFamiliar, int cantidad) {
        List<DecoradorBase> paquetesDecorados = esFamiliar ? paquetesDecoradosFamilia : paquetesDecoradosIndividual;
        double precioTotal = miPaqueteBase.getPrecio() * (esFamiliar ? cantidad : 1);
        int duracionTotal = miPaqueteBase.getDuracion();
        for (DecoradorBase paqueteDecorado : paquetesDecorados) {
            precioTotal += paqueteDecorado.getPrecio() * cantidad;
            duracionTotal += paqueteDecorado.getDuracion();
        }
        System.out.println("\n-Precio Total del Plan " + (esFamiliar ? "Familiar" : "Individual") + ": $" + precioTotal);
        System.out.println("-Duración Total del Plan " + (esFamiliar ? "Familiar" : "Individual") + ": " + duracionTotal + " días\n");
    }

    public List<DecoradorBase> getPaquetesDecoradosFamilia() {
        return paquetesDecoradosFamilia;
    }
}
