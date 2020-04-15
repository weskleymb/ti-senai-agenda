package br.senai.br.ti.agenda;

import br.senai.br.ti.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaApplication implements CommandLineRunner {

    @Autowired
    private ContatoRepository repository;

    public static void main(String... args) {
        SpringApplication.run(AgendaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//		Contato contato1 = new Contato();
//		contato1.setNome("Jose");
//		contato1.setFone("(11) 2222-3333");
//		repository.save(contato1);
//
//		Contato contato2 = new Contato();
//		contato2.setNome("Pedro");
//		contato2.setFone("(33) 98888-0000");
//		repository.save(contato2);
    }

}
