package epv.apirest.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/api")
public class HomeController {
    @GetMapping("/saludo")
    public String saludo(){
        LocalDateTime fechahora = LocalDateTime.now();
        return "Elecciones presidenciales"+fechahora;
    }

}
