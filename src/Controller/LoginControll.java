package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.MenuEntrada;

public class LoginControll {

    private final MenuEntrada view;
    private LoginHelper helper;
    
    public LoginControll(MenuEntrada view ){
        
        this.view = view;   
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        Usuario usuario = helper.obterModelo();
        //pegar um usuario do Menu Entrada
        //pesquisar usuario no banco
         
      
    }
    
    
    
    
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Logado com sucesso");
    }
    
}
