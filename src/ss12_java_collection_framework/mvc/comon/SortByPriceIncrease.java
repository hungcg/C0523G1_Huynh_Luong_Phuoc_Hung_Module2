package ss12_java_collection_framework.mvc.comon;

import ss12_java_collection_framework.mvc.model.Product;

import java.util.Comparator;

public class SortByPriceIncrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
