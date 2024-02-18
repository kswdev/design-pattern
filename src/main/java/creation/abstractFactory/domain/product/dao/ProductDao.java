package creation.abstractFactory.domain.product.dao;

import creation.abstractFactory.domain.product.Product;

public interface ProductDao {
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
