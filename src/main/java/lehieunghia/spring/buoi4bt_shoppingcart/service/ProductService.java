package lehieunghia.spring.buoi4bt_shoppingcart.service;

import lehieunghia.spring.buoi4bt_shoppingcart.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void saveProduct(Product product);

    Product getProductById(int id);

    void deleteProductById(int id);
}
