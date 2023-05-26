/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author Valentina Peñafiel
 * @version 1.0
 */
public class ControladorLogin implements DAOLogin{

    /**
     * @author Valentina Peñafiel
     * Creamos un atributo privado para el usuario,contraseña y controlador  
     */
    
    private static ControladorLogin controladorLogin;
    private String usuario;
    private String contrasenia;
    
    /**
     * Se inicializa el constructor
     */
    private ControladorLogin() {
        
        
    }
    /**
     * Creamos getControladorLogin como static utilizando el singleton 
     * @return controladorLogin  
     */
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }
    /**
     * 
     * @param usuario
     * @param contrasenia
     * @return estado 
     * Antes de entrar verifica usuario y contraseña
     */
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        boolean estado=false;
        
        if((usuario.equals("val"))&&(contrasenia.equals("123")))
            estado=true;
        
        return estado;
    }
    
    /**
     * 
     * @return usuario
     * Para el inicio de usuario
     */

    @Override
    public String getUsuario() {
        return this.usuario;
    }
    /**
     * 
     * @param contrasenia
     * @return estado
     * Lo utilizamos para verificar la constraseña
     */

    @Override
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
    
    
    
    
}
