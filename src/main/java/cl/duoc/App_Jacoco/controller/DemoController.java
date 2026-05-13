package cl.duoc.App_Jacoco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/saludo")

    // se agrega pipeline
    public String saludo(){
        return "saludos desde Springboot";
    }
}
