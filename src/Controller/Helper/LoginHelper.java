package Controller.Helper;

import Model.Usuario;
import View.MenuEntrada;

/**
 *
 * @author paupi
 */
public class LoginHelper {
    
       private final MenuEntrada view;

    public LoginHelper(MenuEntrada view) {
        this.view = view;
    }
      public Usuario obterModelo(){
          
       String nome = view.getTextUsuario().getText();
       String senha = view.getTextSenha().getText(); 
       
       Usuario modelo = new Usuario(0, nome, senha);
           return null;
          
      } 
      public void setarModelo(Usuario modelo){
          String nome = modelo.getNome();
          String senha = modelo.getSenha();
          
          view.getTextUsuario().setText(nome);
          view.getTextSenha().setText(senha);
      }
       
}
