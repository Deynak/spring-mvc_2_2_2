package web.Dao;

import org.springframework.stereotype.Component;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDaoImp implements CarsDao {

    private List<Car> cars;{
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "m5", "grey"));
        cars.add(new Car("AUDI", "R8", "yellow"));
        cars.add(new Car("MERCEDES", "CLS", "white"));
        cars.add(new Car("NISSAN", "GTR", "orange"));
        cars.add(new Car("HONDA", "CIVIC", "green"));
    }


    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
