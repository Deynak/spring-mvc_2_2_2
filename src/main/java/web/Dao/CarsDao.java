package web.Dao;

import web.entity.Car;

import java.util.List;

public interface CarsDao {
    public List<Car> getCars(int count);

}
