/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controlador.ControladorLogin;
import Modelo.Funcionario;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
//       Funcionario fun = new Funcionario("1234", "Fabiano", null);
        
       ControladorLogin controlador = new ControladorLogin();
        
        controlador.exibir();
       
        
        
     
       
    }
}
