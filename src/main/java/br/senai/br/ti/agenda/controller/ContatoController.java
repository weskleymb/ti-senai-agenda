package br.senai.br.ti.agenda.controller;

import br.senai.br.ti.agenda.model.Contato;
import br.senai.br.ti.agenda.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("contatos")
public class ContatoController {

    @Autowired
    private ContatoService service;

    private final String URL_INDEX = "contatos";
    private final String REDIRECT_INDEX = "redirect:/contatos";

    @GetMapping
    public String home(Model model) {
        Contato contato = new Contato();
        model.addAttribute("contato", contato);
        List<Contato> contatos = service.findAll();
        model.addAttribute("contatos", contatos);
        return URL_INDEX;
    }

    @GetMapping("{id}/editar")
    public String edita(@PathVariable("id") Long id, Model model) {
        Contato contato = service.findById(id);
        model.addAttribute("contato", contato);
        List<Contato> contatos = service.findAll();
        model.addAttribute("contatos", contatos);
        return URL_INDEX;
    }

    @GetMapping("{id}/remover")
    public String remove(@PathVariable("id") Long id) {
        service.removeById(id);
        return REDIRECT_INDEX;
    }

    @PostMapping
    public String save(Contato contato) {
        service.save(contato);
        return REDIRECT_INDEX;
    }

}
