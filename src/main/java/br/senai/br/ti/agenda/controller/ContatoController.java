package br.senai.br.ti.agenda.controller;

import br.senai.br.ti.agenda.model.Contato;
import br.senai.br.ti.agenda.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("agenda")
public class ContatoController {

    @Autowired
    private ContatoService service;

    @GetMapping
    public String home(Model model) {
        Contato contato = new Contato();
        List<Contato> contatos = service.findAll();
        model.addAttribute("contato", contato);
        model.addAttribute("contatos", contatos);
        return "index";
    }

    @PostMapping
    public String save(Contato contato) {
        service.save(contato);
        System.out.println(contato);
        return "redirect:/agenda";
    }

}
