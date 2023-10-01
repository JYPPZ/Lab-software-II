
package co.edu.unicauca.openmarket.main;

import co.edu.unicauca.openmarket.access.ConnectRepository;
import co.edu.unicauca.openmarket.access.Factory;
import co.edu.unicauca.openmarket.access.IProductRepository;
import co.edu.unicauca.openmarket.access.ProductRepository;
import co.edu.unicauca.openmarket.domain.service.ProductService;
import co.edu.unicauca.openmarket.presentation.GUIProducts;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ConnectRepository conn = new ConnectRepository();
        IProductRepository repository = new ProductRepository(conn.getConn());
        ProductService productService = new ProductService(repository);
        
        GUIProducts instance = new GUIProducts(productService);
        instance.setVisible(true);
    }
    
}
