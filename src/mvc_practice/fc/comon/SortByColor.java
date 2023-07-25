package mvc_practice.fc.comon;

import mvc_practice.fc.model.Club;

import java.util.Comparator;

public class SortByColor implements Comparator<Club> {
    @Override
    public int compare(Club o1, Club o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
