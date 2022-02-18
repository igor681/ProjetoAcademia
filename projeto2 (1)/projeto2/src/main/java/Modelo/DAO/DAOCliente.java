
package Modelo.DAO;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class DAOCliente {
    
    private static List<Cliente> clientes = new ArrayList<>();
    
    public static boolean salvarCliente(Cliente cliente){
        for(Cliente cli : clientes){
            
           if(cli.getCPF().equals(cliente.getCPF())){
                return false;
           }
        }
        clientes.add(cliente);
        return true;
    }
        
    
   public static List<Cliente> getCliente(){
        return clientes;
    }
    
    public static boolean excluirCliente(String CPF){
        for(Cliente cli : clientes){
            if(cli.getCPF().equals(CPF)){
                clientes.remove(cli);
                return true;
            }
        }
        return false;
    }
}
