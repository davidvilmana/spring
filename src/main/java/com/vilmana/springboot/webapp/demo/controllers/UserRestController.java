package com.vilmana.springboot.webapp.demo.controllers;

import java.util.HashMap;
import java.util.Map;// map

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping; // importar requestmapping

import com.vilmana.springboot.webapp.demo.controllers.model.User;


@RestController
@RequestMapping("/api") // Endpoint base

public class UserRestController {

    @GetMapping("/details") //
    public Map<String, Object>  details(User user) {// UI
        user.setNombre(("David"));
        user.setApellido(("Vilcabana"));

        Map<String, Object> body = new HashMap();   //instancias
                                                    //body = HashMap() => python
                                                    //Student estudiante = Student();  => c++

        body.put("titulo", "hola mundo certus");// addattribute => addattributeName / attributeValue
        body.put("usuario", user);
        // body.put("apellido", "vilcabana manayay");

        return body;
    }

    

}
