package com.example.cafeteria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.cafeteria.models.Usuario;

@Controller
public class CadastroController {
    
    @GetMapping("/cadastro")
    public ModelAndView cadastro() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/cadastro");
        mv.addObject("usuario", new Usuario());
        return mv;
    }
}
