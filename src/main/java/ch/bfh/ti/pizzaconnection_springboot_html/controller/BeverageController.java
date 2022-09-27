package ch.bfh.ti.pizzaconnection_springboot_html.controller;


import ch.bfh.ti.pizzaconnection_springboot_html.entity.Baverage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.List;
/**
 * BeverageController.
 *
 * @author Thomas Ingold
 * @version 1.0
 */

@Controller
@Slf4j
public class BeverageController {

    @RequestMapping(path = "/beverage", method = RequestMethod.GET)
    public String beverage(Model model) {

        log.info("BeverageController::beverage()");
        List<Baverage> inform = List.of(
                new Baverage("images/coke.png", "Coke", "sFr. 3.50"),
                new Baverage("images/ice_tea_lemon.png","Ice Tea Lemon","sFr. 3.50")
        );

        model.addAttribute("inform", inform);

        return "beverage";
    }
}
