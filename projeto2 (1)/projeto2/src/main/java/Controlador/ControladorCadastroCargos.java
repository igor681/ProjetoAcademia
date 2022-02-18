/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cargo;
import Modelo.DAO.DAOCargo;
import Tabela.TabelaCargo;
import Visao.TelaCadastraCargos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControladorCadastroCargos {
    
    private TelaCadastraCargos telaCargos;
    private Cargo cargo;
    private TabelaCargo cargoTabela;
    private DAOCargo cargoDAO;

    public ControladorCadastroCargos() {
         telaCargos = new TelaCadastraCargos();
         cargoTabela = new TabelaCargo(cargoDAO.getCargos());
         setTableModelCargo();
        inicializarAcaoBotoesMenu();
    
    }
    
     private void setTableModelCargo(){
        telaCargos.setTableModelCargo(this.cargoTabela);
    }
    
    public void exibirTela() {
        telaCargos.exibirTela();
    }

    private void inicializarAcaoBotoesMenu() {
        telaCargos.adicionarAcaoCadastroCargo(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cadastra();
            }
        });

        telaCargos.adicionarAcaoOrdenaPorNome(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                
            }
        });

         telaCargos.adicionarAcaoOrdenaPorSalario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                
                
            }
        });
    }

    public TelaCadastraCargos telas(){
        return telaCargos;
    }
    
    public void Cadastra(){
        
        if (validarCargo()) {
            cargo = new Cargo( telaCargos.getNome(), telaCargos.getSalario());
            DAOCargo dao = new DAOCargo();
            if(DAOCargo.salvarCargo(cargo)){
                telaCargos.exibirMensagem("Cargo salvo com sucesso. ");
            }
        }
        else {
            telaCargos.exibirMensagem("Algum campo esta em branco ou preenchido incorretamente! ");
        }
   
    }

    private boolean validarCargo() {
        if (this.telaCargos.getNome().equals(""))  
            return false;
    
        if (this.telaCargos.getSalario().equals(""))
            return false;
       
        return true;
    }
    
    
    
}
