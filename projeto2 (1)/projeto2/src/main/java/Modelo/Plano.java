/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Notebook Roger
 */
public class Plano implements Comparable<Plano>{
    public String nome;
    public String preco;

    @Override
    public String toString() {
        return "Plano{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    
    public Plano(String n, String c){
        this.setNome(n);
        this.setPreco(c);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String m){
        this.nome =m;
    }
    
    public String getPreco(){
        return this.preco;
    }
    public void setPreco(String m){
        this.preco =m;
    }

    @Override
    public int compareTo(Plano o) {
        return this.nome.compareTo(o.getNome());
    }
}
