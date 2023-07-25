package mvc_practice.hero.comon;

import mvc_practice.hero.model.Hero;

import java.util.Comparator;

public class SortByIdIncrease implements Comparator<Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {
        return o1.getId()-o2.getId();
    }
}
