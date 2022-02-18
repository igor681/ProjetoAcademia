/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Cargo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DAOCargo {
    
    private static List<Cargo> cargos = new ArrayList<>();
    
    public static boolean salvarCargo(Cargo cargo){
        for(Cargo carg : cargos){
            
           if(carg.getNome().equals(cargo.getNome())){
                return false;
           }
        }
        cargos.add(cargo);
        return true;
    }
        
    
   public static List<Cargo> getCargos(){
        return cargos;
    }
    
    public static boolean excluirCargo(String nomeCargo){
        for(Cargo carg : cargos){
            if(carg.getNome().equals(nomeCargo)){
                cargos.remove(carg);
                return true;
            }
        }
        return false;
    }

}
