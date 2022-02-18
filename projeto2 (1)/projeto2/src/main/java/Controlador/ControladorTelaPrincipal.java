/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Visao.ViewPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControladorTelaPrincipal {
    
    private ViewPrincipal principal;
    
    public ControladorTelaPrincipal() {
        principal = new ViewPrincipal();
        //daoConsulta = new DAOConsulta();
        //DAOExame = new DAOExame();

        inicializarAcaoBotoesMenu();
    }

    public void exibirTela() {
        principal.exibirTela();
    }

    private void inicializarAcaoBotoesMenu() {
        principal.adicionarAcaoCadastraCargo(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorCadastroCargos cont = new ControladorCadastroCargos();
                //principal.desktoPanel(cont.telas());
                cont.exibirTela();

            }
        });

        principal.adicionarAcaoCadastrarCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorCadastroClientes cont = new ControladorCadastroClientes();
                cont.exibirTela();

                //principal.setVisible(false);
            }
        });

         principal.adicionarAcaoCadastrarFuncionario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorCadastroFuncionario perfil = new ControladorCadastroFuncionario();
                perfil.exibirTela();
                //principal.setVisible(false);
            }
        });

        principal.adicionarAcaoCadastrarPlanos(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                    ControladorCadastroPlano cont = new ControladorCadastroPlano();
                    cont.exibirTela();
                    //principal.setVisible(true);

                
            }
        });

        

    }
}
