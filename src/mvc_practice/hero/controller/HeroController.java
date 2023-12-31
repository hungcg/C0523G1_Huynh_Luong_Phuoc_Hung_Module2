package mvc_practice.hero.controller;

import mvc_practice.hero.service.HeroService;
import mvc_practice.hero.service.IHeroService;

import java.util.Scanner;

public class HeroController {
    private static IHeroService service = new HeroService();

    private static int number = 0;

    public static void main(String[] args) {
        do {
            System.out.println("---Hero---");
            System.out.println("1.Hero List");
            System.out.println("2.Add");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Search");
            System.out.println("6.Sort by Id ( Increase)");
            System.out.println("7.Sort by Id ( Decrease)");
            System.out.println("8,Exit");
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
                    service.update();
                    break;
                case 4:
                    service.remove();
                    break;
                case 5:
                    service.search();
                    break;
                case 6:
                    service.sortByIdIncrease();
                    break;
                case 7:
                    service.sortByIdDecrease();
                    break;
                case 8:
                    System.exit(0);

            }
        } while (true);
    }
}
