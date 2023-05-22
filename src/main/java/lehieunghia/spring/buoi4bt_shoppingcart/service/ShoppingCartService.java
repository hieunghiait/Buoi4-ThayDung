package lehieunghia.spring.buoi4bt_shoppingcart.service;

import lehieunghia.spring.buoi4bt_shoppingcart.model.CartItem;

import java.util.Collection;

public interface ShoppingCartService {
    void add(CartItem newItem);

    void remove(int id);

    CartItem update(int productID, int quantity);

    void clear();

    double getAmount();

    int getCount();

    Collection<CartItem> getAllItems();
}
