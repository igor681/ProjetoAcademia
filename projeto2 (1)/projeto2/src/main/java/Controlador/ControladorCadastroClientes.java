/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.DAO.DAOCliente;
import Visao.TelaCadastroCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControladorCadastroClientes {
    
    private TelaCadastroCliente telaCliente;
    private Cliente cliente;
    
    public ControladorCadastroClientes() {
         telaCliente = new TelaCadastroCliente();

        inicializarAcaoBotoesMenu();
    
    }
    
    public void exibirTela() {
        telaCliente.exibirTela();
    }

    private void inicializarAcaoBotoesMenu() {
        telaCliente.adicionarAcaoSalvar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cadastra();
            }
        });

    }

    public TelaCadastroCliente telas(){
        return telaCliente;
    }
    
    
    public void Cadastra(){
        
        if (validarCliente()) {
            cliente = new Cliente( telaCliente.getNome(), telaCliente.getCPF(), telaCliente.getPlano());
            if(DAOCliente.salvarCliente(cliente)){
                telaCliente.exibirMensagem("Cliente cadaastrado com sucesso. ");
            }
        }
        else {
            telaCliente.exibirMensagem("Algum campo esta em branco ou preenchido incorretamente! ");
        }
   
    }

    private boolean validarCliente() {
        if (this.telaCliente.getNome().equals(""))  
            return false;
    
        if (this.telaCliente.getCPF().equals(""))
            return false;
        
        if (this.telaCliente.getPlano().equals(""))
            return false;
       
        return true;
    }
    
}
