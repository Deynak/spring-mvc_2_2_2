package web.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Dao.CarsDao;
import web.entity.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    @Autowired
    private CarsDao carsDao;

    @Override
    public List<Car> getCars(int count) {
        return carsDao.getCars(count);
    }
}
