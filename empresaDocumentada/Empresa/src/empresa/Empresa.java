/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import Vistas.Login;

/**
 *
 * @author Valentina Peñafiel
 * @clase Donde esta ubicado main
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamamos a la clase Login y la muestra en pantalla
        Login login=Login.getLogin();
        login.setVisible(true);
    }
    
}
