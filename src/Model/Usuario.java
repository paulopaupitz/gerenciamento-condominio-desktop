package Model;

import java.util.Date;

/**
 *
 * @author paupi
 */
public class Usuario extends Pessoa{
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(String nome, String nivelAcesso, int id, String senha, Date dataNascimento, String telefone, String cpf) {
        super(id, nome, dataNascimento, telefone, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
            
            
            
}
