package mvc_practice.fc.repository;

import mvc_practice.fc.comon.SortByColor;
import mvc_practice.fc.model.Club;

import java.util.ArrayList;
import java.util.Collections;

public class ClubRepo implements IClubRepo {
    private static ArrayList<Club> myClub = new ArrayList<>();

    static {
        myClub.add(new Club(1, "Liverpool", "red"));
        myClub.add(new Club(1, "Real Madrid", "white"));
        myClub.add(new Club(1, "Chelsea", "blue"));
        myClub.add(new Club(1, "Villreal", "yellow"));
    }

    @Override
    public ArrayList<Club> displayAll() {
        Collections.sort(myClub);
        return myClub;
    }

    @Override
    public void add(Club e) {
        myClub.add(e);

    }

    @Override
    public void update(Club club) {
        for (int i = 0; i < myClub.size(); i++) {
            if (myClub.get(i).getId() == club.getId()) {
                myClub.set(i, club);
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < myClub.size(); i++) {
            if (myClub.get(i).getId() == id) {
                myClub.remove(i);
                break;
            }
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i <myClub.size() ; i++) {
            if (myClub.get(i).getName().contains(name)){
                System.out.println(myClub.get(i));
            }

        }

    }

    @Override
    public void sortByColor() {
        SortByColor sortByColor = new SortByColor();
        Collections.sort(myClub,sortByColor);
        for (Club club:myClub) {
            System.out.println(club);

        }

    }
}
