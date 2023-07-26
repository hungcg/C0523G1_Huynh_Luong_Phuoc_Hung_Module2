package ss17_binaryfile_serialization.excercise.productbinaryfile.service;

import ss17_binaryfile_serialization.excercise.productbinaryfile.model.Product;
import ss17_binaryfile_serialization.excercise.productbinaryfile.repository.IProductRepo;
import ss17_binaryfile_serialization.excercise.productbinaryfile.repository.ProductRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    private IProductRepo repository = new ProductRepo();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void  displayAll() {
        List<Product> myProduct = repository.displayAll();
        for (int i = 0; i <myProduct.size() ; i++) {
            System.out.println(myProduct.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("input ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input product name");
        String name = scanner.nextLine();
        System.out.println("input price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("input supplier");
        String supplier = scanner.nextLine();
        System.out.println("input status");
        String status = scanner.nextLine();
        Product product = new Product(id,name,price,supplier,status);
        repository.add(product);
    }

    @Override
    public void search() {
        System.out.println("input product name");
        String name = scanner.nextLine();
        repository.search(name);
    }
}
