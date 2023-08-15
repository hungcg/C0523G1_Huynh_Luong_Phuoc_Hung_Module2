package mvc_practice.car.service;
import mvc_practice.car.model.Car;
import mvc_practice.car.repository.CarRepository;
import mvc_practice.car.repository.ICarRepository;
import mvc_practice.car.util.Regex;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    static ICarRepository repository = new CarRepository();
    static Scanner scanner = new Scanner(System.in);


    public String[] input() {
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("color");
        String color = scanner.nextLine();
        String[] inforList = {name, color};
        return inforList;


    }

    @Override
    public void displayAll() {
        List<Car> carList = repository.displayAll();
        for (Car car : carList) {
            System.out.println(car);
        }

    }

    @Override
    public void add() {
        String id;
        System.out.println("id");
        do {
            id = scanner.nextLine();
            if (!Regex.idRegex(id)) {
            } else if (repository.checkId(id) != -1) {
                System.out.println("id exist,try agian");
            } else {
                String[] array = input();
                Car car = new Car(id, array[0], array[1]);
                repository.add(car);
                return;
            }
        } while (true);
    }

    @Override
    public void edit() {
        String id;
        System.out.println("id");
        do {
            id = scanner.nextLine();
            int index = repository.checkId(id);
            if (!Regex.idRegex(id)) {
            } else if (repository.checkId(id) == -1) {
                System.out.println("id not exist");
            } else {
                String[] array = input();
                Car car = new Car(id, array[0], array[1]);
                repository.edit(index, car);
                break;
            }
        } while (true);

    }

    @Override
    public void delete() {
        String id;
        System.out.println("id");
        do {
            id = scanner.nextLine();
            int index = repository.checkId(id);
            if (!Regex.idRegex(id)) {
            } else if (repository.checkId(id) == -1) {
                System.out.println("id not exist");
            } else {
                repository.delete(index);
                break;
            }
        } while (true);
    }

    @Override
    public void search() {
        System.out.println("name");
        String name = scanner.nextLine();
        List<Car> cars =repository.search(name);
        for (Car car:cars){
            System.out.println(car);
        }
    }
}
