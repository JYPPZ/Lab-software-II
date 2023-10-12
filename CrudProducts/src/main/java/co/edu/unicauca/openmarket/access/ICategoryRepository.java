package co.edu.unicauca.openmarket.access;
import co.edu.unicauca.openmarket.domain.Category;

import java.util.List;

public interface ICategoryRepository {
    boolean save(Category miCategoria);

    long findId(String name);

}
