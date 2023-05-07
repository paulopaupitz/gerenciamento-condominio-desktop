package Model;

import java.util.Date;

/**
 *
 * @author paupi
 */
public class Morador extends Pessoa {
   private String endereço;
   private String numeroCasa;

    public Morador(String endereço, String numeroCasa, int id, String nome, Date dataNascimento, String telefone, String cpf) {
        super(id, nome, dataNascimento, telefone, cpf);
        this.endereço = endereço;
        this.numeroCasa = numeroCasa;
    }

    public Morador(int id, String nome, String endereço, String numeroCasa) {
        super(id, nome);
        this.endereço = endereço;
        this.numeroCasa = numeroCasa;
    }

    
    
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
   
  
}
