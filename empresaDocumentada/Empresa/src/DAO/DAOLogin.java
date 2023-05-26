/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Valentina Peñafiel
 * @class Creamos los metodos que se van a utilizar en la clase controladorLogin
 */
public interface DAOLogin {
    //Para prevenir que accedan facilmente a los metodos mediante el DAO
    //Cuidamos los metodos de la clase ControladorLogin 
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    public String getUsuario();
    public boolean CambiarContrasenia(String contrasenia);
    
}
    