package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarsDao;
import web.Dao.CarsDaoImp;
import web.Service.CarService;

@Controller
public class CarController {

    private final CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", required = false,
            defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
