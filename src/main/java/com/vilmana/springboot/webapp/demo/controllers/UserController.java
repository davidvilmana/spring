package com.vilmana.springboot.webapp.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; //  importar model
import org.springframework.web.bind.annotation.GetMapping;

import com.vilmana.springboot.webapp.demo.controllers.model.User;

@Controller
public class UserController {
    @GetMapping("/details") // Endpoint
    public String details(Model modelo, User user) {// UI
        user.setNombre(("David"));
        user.setApellido(("Vilcabana"));
        modelo.addAttribute("titulo", "Hola Mundo Certus Spring");// addattribute => addattributeName / attributeValue
        // modelo.addAttribute("nombre", "david");
        modelo.addAttribute("users", user);
        return "details";
        
        // theVilm/05
    }

}
