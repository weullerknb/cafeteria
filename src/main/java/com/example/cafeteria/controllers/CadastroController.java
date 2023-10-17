package com.example.cafeteria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.cafeteria.models.Usuario;
import com.example.cafeteria.repositories.UsuarioRepository;

@Controller
public class CadastroController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @GetMapping("/cadastro")
    public ModelAndView cadastro(Usuario usuario) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/cadastro");
        mv.addObject("usuario", new Usuario());
        return mv;
    }

    @PostMapping("insert")
    public ModelAndView insert(Usuario usuario) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/index");
        usuarioRepository.save(usuario);
        return mv;
    }
}
