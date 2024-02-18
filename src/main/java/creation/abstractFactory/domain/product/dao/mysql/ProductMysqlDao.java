package creation.abstractFactory.domain.product.dao.mysql;

import creation.abstractFactory.domain.product.Product;
import creation.abstractFactory.domain.product.dao.ProductDao;

public class ProductMysqlDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into MySql DB productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into MySql DB productId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete from MySql DB productId = " + product.getProductId());
    }
}
