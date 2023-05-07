package Model;

import java.util.Date;

/**
 *
 * @author paupi
 */
public class Pessoa {
    protected int id;
    protected String nome;
    protected Date dataNascimento;
    protected String telefone;
    protected String cpf;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id, String nome, Date dataNascimento, String telefone, String cpf) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
