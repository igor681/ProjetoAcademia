/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.DAOFuncionario;
import Modelo.Funcionario;
import Visao.TelaCadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControladorCadastroFuncionario {
    private TelaCadastroFuncionario telaFuncionario;
    private Funcionario funcionario;
    
    public ControladorCadastroFuncionario() {
         telaFuncionario = new TelaCadastroFuncionario();

        inicializarAcaoBotoesMenu();
    
    }
    
    public void exibirTela() {
        telaFuncionario.exibirTela();
    }

    private void inicializarAcaoBotoesMenu() {
        telaFuncionario.adicionarAcaoSalvar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cadastra();
            }
        });

    }

    
    public void Cadastra(){
        
        if (validarFuncionario()) {
            funcionario = new Funcionario( telaFuncionario.getNome(), telaFuncionario.getCPF(), telaFuncionario.getCargo());
            if(DAOFuncionario.salvarFuncionario(funcionario)){
                telaFuncionario.exibirMensagem("Funcionario cadastrado com sucesso. ");
            }
        }
        else {
            telaFuncionario.exibirMensagem("Algum campo esta em branco ou preenchido incorretamente! ");
        }
   
    }

    private boolean validarFuncionario() {
        if (this.telaFuncionario.getNome().equals(""))  
            return false;
    
        if (this.telaFuncionario.getCPF().equals(""))
            return false;
        
        if (this.telaFuncionario.getCargo().equals(""))
            return false;
       
        return true;
    }
    
}
