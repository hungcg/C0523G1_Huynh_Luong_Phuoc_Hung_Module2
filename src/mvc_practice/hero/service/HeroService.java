package mvc_practice.hero.service;

import mvc_practice.hero.model.Hero;
import mvc_practice.hero.repository.HeroRepo;
import mvc_practice.hero.repository.IHeroRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class HeroService implements IHeroService {
    private IHeroRepo repository = new HeroRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        ArrayList<Hero> myHero = repository.displayAll();
        for (int i = 0; i <myHero.size() ; i++) {
            System.out.println(myHero.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("input Hero ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input Hero name");
        String name = scanner.nextLine();
        System.out.println("input Hero skill");
        String skill = scanner.nextLine();
        Hero hero = new Hero(id,name,skill);
        repository.add(hero);
    }

    @Override
    public void update() {
        System.out.println("input Hero ID wanna change");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input Hero name");
        String name = scanner.nextLine();
        System.out.println("input Hero skill");
        String skill = scanner.nextLine();
        Hero hero = new Hero(id,name,skill);
        repository.update(hero);


    }

    @Override
    public void remove() {
        System.out.println("input Hero ID");
        int id = Integer.parseInt(scanner.nextLine());
        repository.remove(id);


    }

    @Override
    public void search() {
        System.out.println("Input Hero name");
        String name = scanner.nextLine();
        repository.search(name);

    }

    @Override
    public void sortByIdIncrease() {
        repository.sortByIdIncrease();

    }

    @Override
    public void sortByIdDecrease() {
        repository.sortByIdDecrease();

    }
}
