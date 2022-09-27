package ch.bfh.ti.pizzaconnection_springboot_html.controller;

import ch.bfh.ti.pizzaconnection_springboot_html.entity.Pizzas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.List;

/**
 * PizzaController.
 *
 * @author Yavuz Özbay
 * @version 1.0
 */

@Controller
@Slf4j
public class PizzaController {

    @RequestMapping(path = "/pizza", method = RequestMethod.GET)
    public String pizza(Model model) {

        log.info("PizzaController::pizza()");

        List<Pizzas>informations = List.of(
                new Pizzas("images/margherita.png", "Margherita", "Tomato, Mozzarella, Oregano", "23cm / sFr. 11.00", "30cm / sFr. 14.00"),
                new Pizzas("images/funghi.png","Funghi","Tomato, Mozzarella, Mushrooms, Oregano","23cm / sFr. 12.00","30cm / sFr. 15.00"),
                new Pizzas("images/napoli.png","Napoli","Tomato, Mozzarella, Anchovies, Capers, Oregano"," 23cm / sFr. 12.00"," 30cm / sFr. 15.00"),
                new Pizzas("images/verde.png","Verde","Tomato, Mozzarella, Spinach, Broccoli, Oregano","23cm / sFr. 12.00","30cm / sFr. 15.00")
        );

        model.addAttribute("informations", informations);

        return "pizza";
    }
}
