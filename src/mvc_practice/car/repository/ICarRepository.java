package mvc_practice.car.repository;

import mvc_practice.car.model.Car;

import java.util.List;

public interface ICarRepository {

    int checkId(String id);
    List<Car> displayAll();
    void add(Car car);
    void edit(int id, Car car);
    void delete(int id);
    List<Car> search(String name);
}
