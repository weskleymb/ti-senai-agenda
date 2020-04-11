package br.senai.br.ti.agenda;

import br.senai.br.ti.agenda.model.Contato;
import br.senai.br.ti.agenda.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaApplication {

	@Autowired
	private static ContatoService service;

	public static void main(String... args) {
		SpringApplication.run(AgendaApplication.class, args);
//		insereDados();
	}

	private static void insereDados() {
		Contato contato1 = new Contato();
		contato1.setNome("Weskley");
		contato1.setFone("9999-8888");
		service.salvar(contato1);
	}

}
