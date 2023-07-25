package mvc_practice.fc.service;

import mvc_practice.fc.model.Club;
import mvc_practice.fc.repository.ClubRepo;
import mvc_practice.fc.repository.IClubRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class ClubService implements IClubService {
    private IClubRepo repository = new ClubRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        ArrayList<Club> myClub = repository.displayAll();
        for (int i = 0; i < myClub.size(); i++) {
            System.out.println(myClub.get(i));

        }
    }

    @Override
    public void add() {
        System.out.println("Input ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input color");
        String color = scanner.nextLine();
        Club club = new Club(id, name, color);
        repository.add(club);

    }

    @Override
    public void update() {
        System.out.println("Input ID change");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input color");
        String color = scanner.nextLine();
        Club club = new Club(id, name, color);
        repository.update(club);

    }

    @Override
    public void remove() {
        System.out.println("Input ID");
        int id = Integer.parseInt(scanner.nextLine());
        repository.remove(id);


    }

    @Override
    public void search() {
        System.out.println("input name");
        String name = scanner.nextLine();
        repository.search(name);

    }

    @Override
    public void sortByColor() {
        repository.sortByColor();

    }
}
