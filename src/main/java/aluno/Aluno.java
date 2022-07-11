package aluno;

import org.bson.codecs.CollectibleCodec;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String uiId;
    private Cpf cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefone = new ArrayList<>();

    public Aluno(Cpf cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public Aluno() {  }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefone.add(new Telefone(ddd, numero));
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone.add(telefone);
    }

    public String getUiId() { return uiId;}

    public void setUiId(String uiId) { this.uiId = uiId;}
}
