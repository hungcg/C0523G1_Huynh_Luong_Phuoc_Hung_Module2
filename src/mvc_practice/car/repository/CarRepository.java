package mvc_practice.car.repository;

import mvc_practice.car.model.Car;
import mvc_practice.car.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {

    static final String CAR_FILE = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\mvc_practice\\car\\data\\car.csv";

    @Override
    public int checkId(String id) {
        int index = -1;
        List<Car> carList = displayAll();
        for (Car car : carList) {
            if (car.getId().equals(id)) {
                index = carList.indexOf(car);
            }
        }
        return index;

    }

    @Override
    public List<Car> displayAll() {
        List<Car> carList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFromFile(CAR_FILE);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Car car = new Car(array[0], array[1], array[2]);
            carList.add(car);
        }
        return carList;
    }

    @Override
    public void add(Car car) {
        List<String> stringList= new ArrayList<>();
        stringList.add(car.getInforCsv());
        ReadAndWriteFile.writeFromFile(CAR_FILE,stringList,true);
    }

    @Override
    public void edit(int id, Car car) {
        List<Car> carList = displayAll();
        List<String> stringList = new ArrayList<>();
        carList.set(id,car);
        for(Car cars:carList){
            stringList.add(cars.getInforCsv());
        }
        ReadAndWriteFile.writeFromFile(CAR_FILE,stringList,false);

    }

    @Override
    public void delete(int id) {
        List<Car> carList =displayAll();
        List<String> stringList=new ArrayList<>();
        carList.remove(id);
        for(Car car:carList){
            stringList.add(car.getInforCsv());
        }ReadAndWriteFile.writeFromFile(CAR_FILE,stringList,false);
    }

    @Override
    public List<Car> search(String name) {
        List<Car>carList =displayAll();
        List<Car>cars = new ArrayList<>();
        for (int i = 0; i <carList.size() ; i++) {
            if(carList.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                cars.add(carList.get(i));
            }
        }
        return cars;
    }
}
