/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Pessoa;

/**
 *
 * @author Notebook Roger
 */
public class Funcionario extends Pessoa implements Autentica{ 
    public String PIS;
    
    public Funcionario(String n, String c, String p){
        this.setNome(n);
        this.setCPF(c);
        this.setPIS(p);
    }
    
    public String getPIS(){
        return this.PIS;
    }
    public void setPIS(String m){
        this.PIS =m;
    }


    @Override
    public boolean autentica(String senha) {
        String senha1 = "1234";
            if(senha.equalsIgnoreCase(senha1)){ 
                    return true;
            }else {
                    return false;
	  }    }

    
}
