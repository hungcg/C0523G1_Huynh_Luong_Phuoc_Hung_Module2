package mvc_practice.hero.repository;

import mvc_practice.hero.model.Hero;

import java.util.ArrayList;

public interface IHeroRepo {
  ArrayList<Hero> displayAll();
  void add(Hero e);
  void update(Hero hero);
  void remove(int id);
  void search(String name);
  void sortByIdIncrease();
  void sortByIdDecrease();
}
