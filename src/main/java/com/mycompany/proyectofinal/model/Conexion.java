/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *	
 * @author VGRCAORT
 */
public class Conexion{
	
	private static Connection con;
	
	private Conexion(){
	
	}
		
	public static Connection getConexion(String driver, String url, String user, String pass) {
        if (con == null) {
            try {
                Class.forName(driver); // Chequeo de Driver (sujeto a excepciones)
                con = DriverManager.getConnection(url, user, pass); // Obtener la conexión
                System.out.println("Conexión exitosa: " + con.getClass().getName());
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException("No se encuentra driver " + driver, ex);
            } catch (Exception ex) {
                throw new RuntimeException("No se pudo establecer conexión con la BD", ex);
            }
        }
        return con;
    }
	
}
