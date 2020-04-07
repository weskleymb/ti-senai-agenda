package br.senai.br.ti.agenda.service;

import br.senai.br.ti.agenda.model.Contato;
import br.senai.br.ti.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public Contato salvar(Contato contato) {
        if (contato.getNome().equals("")) {
            throw new RuntimeException("Contato não pode ter nome em Branco");
        }
        return repository.save(contato);
    }

}
