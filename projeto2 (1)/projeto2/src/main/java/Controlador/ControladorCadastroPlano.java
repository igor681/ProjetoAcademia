
package Controlador;

import Modelo.DAO.DAOPlano;
import Modelo.Plano;
import Visao.TelaCadastroPlano;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCadastroPlano {
    private TelaCadastroPlano telaplano;
    private Plano plano;
    
    public ControladorCadastroPlano() {
         telaplano = new TelaCadastroPlano();

        inicializarAcaoBotoesMenu();
    
    }
    
    public void exibirTela() {
        telaplano.exibirTela();
    }

    private void inicializarAcaoBotoesMenu() {
        telaplano.adicionarAcaoSalvar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cadastra();
            }
        });

    }

    
    public void Cadastra(){
        
        if (validarCliente()) {
            plano = new Plano( telaplano.getNome(), telaplano.getPreco());
            if(DAOPlano.salvarPlano(plano)){
                telaplano.exibirMensagem("Plano cadastrado com sucesso. ");
            }
        }
        else {
            telaplano.exibirMensagem("Algum campo esta em branco ou preenchido incorretamente! ");
        }
   
    }

    private boolean validarCliente() {
        if (this.telaplano.getNome().equals(""))  
            return false;
    
        if (this.telaplano.getPreco().equals(""))
            return false;
        
       
        return true;
    }
    
}
