package lehieunghia.spring.buoi4bt_shoppingcart.model;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor(force = true)
@Data
@Entity(name = "product")
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "price")
    private double price;
    @NotNull
    @Column(name = "quantity")
    private int quantity;


}
