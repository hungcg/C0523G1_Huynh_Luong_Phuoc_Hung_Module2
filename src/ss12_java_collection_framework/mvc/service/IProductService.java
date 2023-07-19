package ss12_java_collection_framework.mvc.service;

import ss08_cleancode_reflactoring.excercise.mvc.model.Customer;
import ss12_java_collection_framework.mvc.model.Product;

import java.util.ArrayList;

public interface IProductService {
    void displayAll();

    void add();

    void update();

    void remove();

    void search();

    void sortByPriceIncrease();

    void sortByPriceDecrease();
}
