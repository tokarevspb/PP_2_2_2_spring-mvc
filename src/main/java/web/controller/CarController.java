package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(Model model, @RequestParam(defaultValue = "5") int count) {
        model.addAttribute("text", "This is a Car view");
        model.addAttribute("cars", CarServiceImp.getCars(count));
        return null;
    }

}