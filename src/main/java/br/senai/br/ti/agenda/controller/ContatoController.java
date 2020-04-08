package br.senai.br.ti.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("agenda")
public class ContatoController {

    @GetMapping
    public String home(Model model) {
        String nome = "Weskley";
        model.addAttribute("nome", nome);
        return "index";
    }

}
