package mvc_practice.fc.repository;

import mvc_practice.fc.model.Club;

import java.util.ArrayList;

public interface IClubRepo {

    ArrayList<Club> displayAll();
    void add(Club e);
    void update(Club club);
    void remove(int id);
    void search(String name);
    void sortByColor();
}
