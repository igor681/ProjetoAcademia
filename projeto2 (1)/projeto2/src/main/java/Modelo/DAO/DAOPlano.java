
package Modelo.DAO;

import Modelo.Plano;
import java.util.ArrayList;
import java.util.List;


public class DAOPlano {
    
    private static List<Plano> planos = new ArrayList<>();
    
    public static boolean salvarPlano(Plano plano){
        for(Plano plan : planos){
            
           if(plan.getNome().equals(plano.getNome())){
                return false;
           }
        }
        planos.add(plano);
        return true;
    }
        
    
   public static List<Plano> getPlano(){
        return planos;
    }
    
    public static boolean excluirPlano(String CPF){
        for(Plano fun : planos){
            if(fun.getNome().equals(CPF)){
                planos.remove(fun);
                return true;
            }
        }
        return false;
    }
}
