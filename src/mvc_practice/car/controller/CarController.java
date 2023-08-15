package mvc_practice.car.controller;

import mvc_practice.car.service.CarService;
import mvc_practice.car.service.ICarService;

import java.util.Scanner;

public class CarController {
    static ICarService service = new CarService();
    static Scanner scanner = new Scanner(System.in);


    public static void controller() {
        do{
        System.out.println("Car Controller");
        System.out.println("1.display");
        System.out.println("2.add");
        System.out.println("3.edit");
        System.out.println("4.delete");
        System.out.println("5.search");
        System.out.println("6.exit");
        int choose =0;


            try{
                choose =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("wrong format, only number");
            }
            switch (choose){
                case 1:
                    service.displayAll();
                    break;
                case 2:
                    service.add();
                    break;
                case 3:
                    service.edit();
                    break;
                case 4:
                    service.delete();
                    break;
                case 5:
                    service.search();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("out of number");
            }

        }while (true);

    }
}
