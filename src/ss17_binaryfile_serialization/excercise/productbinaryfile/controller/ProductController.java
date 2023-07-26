package ss17_binaryfile_serialization.excercise.productbinaryfile.controller;

import mvc_practice.fc.service.IClubService;
import ss17_binaryfile_serialization.excercise.productbinaryfile.model.Product;
import ss17_binaryfile_serialization.excercise.productbinaryfile.service.IProductService;
import ss17_binaryfile_serialization.excercise.productbinaryfile.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService service = new ProductService();

    private int number =0;
    public static void main(String[] args) {
        do {
            System.out.println("---Product---");
            System.out.println("1.Product List");
            System.out.println("2.Add");
            System.out.println("3.Search");
            System.out.println("4.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("choose your option boy");
            int number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    service.displayAll();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.search();
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
