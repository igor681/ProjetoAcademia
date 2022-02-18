/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 6113955
 */
public class Cargo  {
    private String nome;
    private String salario; 

    @Override
    public String toString() {
        return "Cargo{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    public Cargo(String nome, String salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

 

    
    
}
