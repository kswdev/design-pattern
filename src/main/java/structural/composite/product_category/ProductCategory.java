package structural.composite.product_category;

public abstract class ProductCategory {

    protected int id;
    protected String name;
    protected int price;

    public ProductCategory(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract void addProduct(ProductCategory productCategory);
    public abstract void removeCategory(ProductCategory productCategory);
    public abstract int getCount();
    public abstract int getPrice();
    public abstract String getName();
    public abstract int getId();
}
