/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Visao.ViewLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ControladorLogin {
        
    private ViewLogin tela;
    
    public ControladorLogin() {
        tela = new ViewLogin();
        adicionarAcoesBotoes();
    }

    public void exibir(){
        tela.exibirTela();
    }

    public void adicionarAcoesBotoes(){
        tela.addAcaoBotaoLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorTelaPrincipal cont = new ControladorTelaPrincipal();
                cont.exibirTela();
               // tela.setTableModelConsultas(cargoTabela);


                tela.setVisible(false);
            }
        });

        tela.addAcaoBotaoLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificaUsuario();
            }
        });

    }

    public void verificaUsuario() { 
        String senha = "123456";
        String login = tela.getCpf();

   
        if (tela.getCpf() != null) {
            if (tela.getSenha().equalsIgnoreCase(senha)) {

                ControladorTelaPrincipal telaprincipal = new ControladorTelaPrincipal();
                telaprincipal.exibirTela();

                tela.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Senha inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else  {                
              JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    
}
}
