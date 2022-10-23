package task2.dao;

import task2.entity.Car;

import java.awt.*;

public class CarDAO {
    void add (Car car);

    List<Car> getAll();

    Car getByID(int id);

    void updatePrice (int price, int carId);

    void remove (String mark);
}
