package structural.composite;

import structural.composite.product_category.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class Category extends ProductCategory {

    private List<ProductCategory> list;

    public Category(int id, String name, int price) {
        super(id, name, price);
        this.list = new ArrayList<>();
    }

    @Override
    public void addProduct(ProductCategory productCategory) {
        list.add(productCategory);
    }

    @Override
    public void removeCategory(ProductCategory productCategory) {
        for (ProductCategory temp : list) {
            if (temp.getId() == productCategory.getId()) {
                list.remove(temp);
                return;
            }
        }
        System.out.println("상품이 없습니다.");
    }

    @Override
    public int getCount() {
        int count = 0;
        for (ProductCategory temp : list) {
            count += temp.getCount();
        }
        return count;
    }

    @Override
    public int getPrice() {
        int price = 0;
        for (ProductCategory temp : list) {
            price += temp.getPrice();
        }
        return price;
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
