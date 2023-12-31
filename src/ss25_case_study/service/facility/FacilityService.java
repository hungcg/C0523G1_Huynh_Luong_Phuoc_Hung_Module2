package ss25_case_study.service.facility;

import ss25_case_study.controller.FacilityManagement;
import ss25_case_study.model.facility.Facility;
import ss25_case_study.model.facility.House;
import ss25_case_study.model.facility.Room;
import ss25_case_study.model.facility.Villa;
import ss25_case_study.repository.facility.FacilityRepo;
import ss25_case_study.repository.facility.IFacilityRepo;

import java.util.Scanner;

public class FacilityService implements IFacilityService {
    static IFacilityRepo repository = new FacilityRepo();
    static boolean checkChoice;
    static int choice;
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        do {
            checkChoice = false;
            System.out.println("1. Display Villa");
            System.out.println("2. Display House");
            System.out.println("3. Display Room");
            System.out.println("4. Return main menu");
            System.out.println("(^_^)___________(^_^)");
            System.out.println("Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("look at the list carefully");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    repository.villaDisplay();
                    checkChoice = true;
                    continue;
                case 2:
                    repository.houseDisplay();
                    checkChoice = true;
                    continue;
                case 3:
                    repository.roomDisplay();
                    checkChoice = true;
                    continue;
                case 4:
                    FacilityManagement.facilityManagement();
                    break;

                default:
                    System.out.println("look at the list carefully");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
        checkChoice = true;
    }

    @Override
    public void add() {
    }

    public void addVilla() {
        boolean flag = true;
        String inputId = "Enter the villa's ID with the format (SVVL-YYYY) : ";
        String idVilla = null;


        String inputName = "Enter the name Villa for rent : ";
        String nameVilla = null;


        String inputArea = "Enter the villa area (> 30m^2)";
        String areaVilla = null;


        String inputPrice = "Enter the cost of renting a villa : ";
        String priceVilla = null;


        String inputNumPerson = "Enter the number of villas tenants";
        String numPersonVilla = null;


        String inputDateHire = "Enter the rental type";
        String dateHireVilla = null;


        String inputRoomStandard = "Enter room standard : ";
        String roomStandardVilla = null;


        String inputareaPool = "Enter the pool area : ";
        int areaPoolVilla = 0;


        String inputFloor = "Enter the number of villas : ";
        int floorVilla = 0;


        Villa villa = new Villa(idVilla, nameVilla, areaVilla, priceVilla, numPersonVilla, dateHireVilla, roomStandardVilla, areaPoolVilla, floorVilla);
        repository.addVilaa(villa, 0);
        System.out.println("Add successful villa service !\n");
    }

    public void addHouse() {
        boolean flag = true;
        String inputId = "Enter the house's ID with the format (SVHO-YYYY) : ";
        String idHouse = null;


        String inputName = "Enter the name house for rent : ";
        String nameHouse = null;


        String inputArea = "Enter the house area (> 30m^2)";
        String areaHouse = null;


        String inputPrice = "Enter the cost of renting a house : ";
        String priceHouse = null;


        String inputNumPerson = "Enter the number of houses tenants";
        String numPersonHouse = null;


        String inputDateHire = "Enter the rental type";
        String dateHireHouse = null;


        String inputRoomStandard = "Enter room standard : ";
        String roomStandardHouse = null;


        String inputFloor = "Enter the number of villas : ";
        int floorHouse = 0;

        House house = new House(idHouse, nameHouse, areaHouse, priceHouse, numPersonHouse, dateHireHouse, roomStandardHouse, floorHouse);
        repository.addHouse(house, 0);
        System.out.println("Add successful house service !\n");
    }

    @Override
    public void addRoom() {
        boolean flag = true;
        String inputId = "Enter the Room's ID with the format (SVRO-YYYY) : ";
        String idRoom = null;


        String inputName = "Enter the name room for rent : ";
        String nameRoom = null;


        String inputArea = "Enter the room area (> 30m^2)";
        String areaRoom = null;


        String inputPrice = "Enter the cost of renting a room : ";
        String priceRoom = null;


        String inputNumPerson = "Enter the number of rooms tenants";
        String numPersonRoom = null;


        String inputDateHire = "Enter the rental type";
        String dateHireRoom = null;


        System.out.println("Enter the accompanying service : ");
        String roomStandardRoom = scanner.nextLine();


        Room room = new Room(idRoom, nameRoom, areaRoom, priceRoom, numPersonRoom, dateHireRoom, roomStandardRoom);
        repository.addRoom(room, 0);
        System.out.println("Add successful room service !\n");
    }


    @Override
    public void delete() {
        System.out.println("\n---Enter the service you want to delete---");
        String deleFacility = scanner.nextLine();
        Facility key = repository.searchKey(deleFacility);
        if (key == null) {
            System.err.println("There is no service code !\n");
        } else {
            repository.deleteFacility(key);
            System.out.println("---Successful service deletion---\n");
        }
    }

    @Override
    public void displayListMaintainance() {
        repository.displayListMaintainance();
    }
}
