package ch.bfh.ti.pizzaconnection_springboot_html.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * IndexController.
 *
 * @author Thomas Ingold
 * @version 1.0
 */

@Controller
@Slf4j
public class IndexController {

    @RequestMapping(path = {"/", "/index"}, method = RequestMethod.GET)
    public String index() {

        log.info("IndexController::index()");

        return "index.html";
    }
}
