package structural.composite.product;

import structural.composite.product_category.ProductCategory;

public class Product extends ProductCategory {
    public Product(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public void addProduct(ProductCategory productCategory) {

    }

    @Override
    public void removeCategory(ProductCategory productCategory) {

    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
