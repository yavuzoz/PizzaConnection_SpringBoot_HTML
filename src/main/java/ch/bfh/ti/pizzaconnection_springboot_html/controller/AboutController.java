package ch.bfh.ti.pizzaconnection_springboot_html.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * AboutController.
 *
 * @author Thomas Ingold
 * @version 1.0
 */

@Controller
@Slf4j
public class AboutController {

    @RequestMapping(path = "/about", method = RequestMethod.GET)
    public String about() {

        log.info("AboutController::about()");

        return "about.html";
    }
}
