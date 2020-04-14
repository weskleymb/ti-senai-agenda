package br.senai.br.ti.agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "TB_CONTATOS")
public class Contato {

    @Id
    @Column(name = "CON_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CON_NOME", nullable = false)
    private String nome;

    @Column(name = "CON_FONE", nullable = false, unique = true)
    private String fone;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().toUpperCase();
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(this.id, contato.id) &&
                Objects.equals(this.nome, contato.nome) &&
                Objects.equals(this.fone, contato.fone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nome, this.fone);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", fone='" + fone + '\'' +
                '}';
    }
}
