package ss12_java_collection_framework.mvc.repository;

import ss12_java_collection_framework.mvc.model.Product;
import ss12_java_collection_framework.mvc.comon.SortByPriceDecrease;
import ss12_java_collection_framework.mvc.comon.SortByPriceIncrease;

import java.util.ArrayList;
import java.util.Collections;

public class ProductRepo implements IProductRepo {

    private static ArrayList<Product> myProduct = new ArrayList<>(10);

    static {
        myProduct.add(new Product(1, "Lamborgini", 5000));
        myProduct.add(new Product(2, "Ferrari", 4000));
        myProduct.add(new Product(3, "Bugatti", 8000));
        myProduct.add(new Product(4, "Bugatti Veron", 10000));
    }

    @Override
    public ArrayList<Product> displayAll() {
        Collections.sort(myProduct);
        return myProduct;
    }

    @Override
    public void add(Product e) {
        myProduct.add(e);
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < myProduct.size(); i++) {
            if (product.getId() == myProduct.get(i).getId()) {
                myProduct.set(i, product);
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < myProduct.size(); i++) {
            if (myProduct.get(i).getId() == id) {
                myProduct.remove(i);
                break;
            }
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < myProduct.size(); i++) {
            if (myProduct.get(i).getName().contains(name)) {
                System.out.println(myProduct.get(i));
            }
        }
    }

    @Override
    public void sortByPriceIncrese() {
        SortByPriceIncrease sortByPriceIncrease = new SortByPriceIncrease();
        Collections.sort(myProduct, sortByPriceIncrease);
        for (Product product : myProduct) {
            System.out.println(product);
        }
    }

    @Override
    public void sortByPriceDecrease() {
        SortByPriceDecrease sortByPriceDecrease = new SortByPriceDecrease();
        Collections.sort(myProduct, sortByPriceDecrease);
        for (Product product : myProduct) {
            System.out.println(product);
        }
    }
}

