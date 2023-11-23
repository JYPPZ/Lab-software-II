package Interface;

import java.util.List;

public interface IPaqueteComponent {
    void agregar(IPaqueteComponent componente);
    String mostrarInformacion();
    List<IPaqueteComponent> getComponentes();
}
