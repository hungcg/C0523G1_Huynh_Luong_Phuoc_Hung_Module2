package ss12_java_collection_framework.mvc.repository;

import ss12_java_collection_framework.mvc.model.Product;

import java.util.ArrayList;

public interface IProductRepo {

    ArrayList<Product> displayAll();

    void add(Product e);

    void update(Product product);

    void remove(int id);

    void search(String name);

    void sortByPriceIncrese();

    void sortByPriceDecrease();
}
