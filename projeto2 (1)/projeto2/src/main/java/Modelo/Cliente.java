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
public class Cliente extends Pessoa { 
    private String plano;
    
    public Cliente(String n, String c, String p){
        this.setNome(n);
        this.setCPF(c);
        this.setPlano(p);
    }
    public Cliente(String n){
        this.setNome(n);  
    }
    
    public String getPlano(){
        return this.plano;
    }
    public void setPlano(String m){
        this.plano =m;
    }
    
    @Override
    public String toString(){
        return "Nome: "+this.nome+". \n"
               +"CPF: "+this.CPF+". \n"
               +"Plano: "+this.plano+".\n";
    }

   @Override
    public int hashCode() {
        
        return 0;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        return true;
    }

   
}
