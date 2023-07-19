package ss12_java_collection_framework.mvc.service;


import ss12_java_collection_framework.mvc.model.Product;
import ss12_java_collection_framework.mvc.repository.IProductRepo;
import ss12_java_collection_framework.mvc.repository.ProductRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepo repository = new ProductRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        ArrayList<Product> myProduct = repository.displayAll();
        for (int i = 0; i < myProduct.size(); i++) {
            System.out.println(myProduct.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("input Product ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input Product name");
        String name = scanner.nextLine();
        System.out.println("input Product price");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        repository.add(product);
    }

    @Override
    public void update() {
        System.out.println("input Product ID wanna update");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input price");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        repository.update(product);
    }

    @Override
    public void remove() {
        System.out.println("input id u wanna delete");
        int id = Integer.parseInt(scanner.nextLine());
        repository.remove(id);
    }

    @Override
    public void search() {
        System.out.println("search name");
        String name = scanner.nextLine();
        repository.search(name);
    }

    @Override
    public void sortByPriceIncrease() {
        repository.sortByPriceIncrese();
    }

    @Override
    public void sortByPriceDecrease() {
        repository.sortByPriceDecrease();
    }
}

