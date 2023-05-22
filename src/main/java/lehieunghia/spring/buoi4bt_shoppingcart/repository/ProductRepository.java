package lehieunghia.spring.buoi4bt_shoppingcart.repository;
import lehieunghia.spring.buoi4bt_shoppingcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
