/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Notebook Roger
 */
public abstract class Pessoa {
    protected String nome;
    protected String CPF;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String m){
        this.nome =m;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    public void setCPF(String m){
        this.CPF =m;
    }

     public String toString(){
        return "nome:"+this.nome+".";
    }
}
