package ss12_java_collection_framework.mvc.controller;

import ss08_cleancode_reflactoring.excercise.mvc.service.CustomerService;
import ss08_cleancode_reflactoring.excercise.mvc.service.ICustomerService;
import ss12_java_collection_framework.mvc.service.IProductService;
import ss12_java_collection_framework.mvc.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService service =new ProductService();

    private static int number = 0;

    public static void main(String[] args) {

        do {
            System.out.println("-----ProductManage----");
            System.out.println("1.Product List");
            System.out.println("2.Add");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Search");
            System.out.println("6.Sort by price (price increase)");
            System.out.println("7.Sort by price (price decrease)");
            System.out.println("8.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("what do u want bro?");
            int number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    service.displayAll();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.update();
                    break;
                case 4:
                    service.remove();
                    break;
                case 5:
                    service.search();
                    break;
                case 6:
                    service.sortByPriceIncrease();
                    break;
                case 7:
                    service.sortByPriceDecrease();
                case 8:
                    System.exit(0);
            }

        } while (true);
    }
}
