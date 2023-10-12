package co.edu.unicauca.openmarket.domain.service;

import co.edu.unicauca.openmarket.access.ICategoryRepository;
import co.edu.unicauca.openmarket.domain.Category;

public class CategoryService {
    private final ICategoryRepository repository;

    public CategoryService(ICategoryRepository repository) {
        this.repository = repository;
    }

    public boolean saveCategory (String name) {
        Category miCategoria = new Category();
        miCategoria.setName(name);
        //Validate product
        if (miCategoria.getName().isEmpty()) {
            return false;
        }
        return repository.save(miCategoria);
    }

    public long findId(String name){
        return repository.findId(name);
    }
}
