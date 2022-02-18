
package Modelo.DAO;

import Modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class DAOFuncionario {
    
    private static List<Funcionario> funcionarios = new ArrayList<>();
    
    public static boolean salvarFuncionario(Funcionario funcionario){
        for(Funcionario fun : funcionarios){
            
           if(fun.getCPF().equals(funcionario.getCPF())){
                return false;
           }
        }
        funcionarios.add(funcionario);
        return true;
    }
        
    
   public static List<Funcionario> getFuncionario(){
        return funcionarios;
    }
    
    public static boolean excluirFuncionario(String CPF){
        for(Funcionario fun : funcionarios){
            if(fun.getCPF().equals(CPF)){
                funcionarios.remove(fun);
                return true;
            }
        }
        return false;
    }
}
