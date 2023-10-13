package co.edu.unicauca.openmarket.access;
import co.edu.unicauca.openmarket.domain.Category;

public interface ICategoryRepository {
    boolean save(Category miCategoria);
    long findId(String name);
}
