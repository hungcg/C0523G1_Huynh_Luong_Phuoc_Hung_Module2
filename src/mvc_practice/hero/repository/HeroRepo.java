package mvc_practice.hero.repository;

import mvc_practice.hero.comon.SortByIdDecrease;
import mvc_practice.hero.comon.SortByIdIncrease;
import mvc_practice.hero.model.Hero;

import java.util.ArrayList;
import java.util.Collections;

public class HeroRepo implements IHeroRepo {
    private static ArrayList<Hero> myHero = new ArrayList<>();

    static {
        myHero.add(new Hero(1, "Batman", "Rich"));
        myHero.add(new Hero(1, "Superman", "Strenght"));
        myHero.add(new Hero(1, "Ironman", "Amor"));
    }

    @Override
    public ArrayList<Hero> displayAll() {
        Collections.sort(myHero);
        return myHero;
    }

    @Override
    public void add(Hero e) {
        myHero.add(e);
    }

    @Override
    public void update(Hero hero) {
        for (int i = 0; i < myHero.size(); i++) {
            if (hero.getId() == myHero.get(i).getId()) {
                myHero.set(i, hero);
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < myHero.size(); i++) {
            if (myHero.get(i).getId() == id) {
                myHero.remove(i);
                break;
            }
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < myHero.size(); i++) {
            if (myHero.get(i).getName().contains(name)) {
                System.out.println(myHero.get(i));
            }
        }
    }


    @Override
    public void sortByIdIncrease() {
        SortByIdIncrease sortIncrease = new SortByIdIncrease();
        Collections.sort(myHero, sortIncrease);
        for (Hero hero : myHero) {
            System.out.println(hero);

        }
    }

    @Override
    public void sortByIdDecrease() {
        SortByIdDecrease sortDecrease = new SortByIdDecrease();
        Collections.sort(myHero, sortDecrease);
        for (Hero hero : myHero) {
            System.out.println(hero);

        }
    }
}