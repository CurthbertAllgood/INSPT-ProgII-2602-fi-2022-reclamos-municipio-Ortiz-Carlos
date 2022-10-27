/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author VGRCAORT
 */
public class Conexion {

	private static Connection con=null;
	private static String user="root";
	private static String pass="Prisma01";
	private static String url="jdbc:mysql://localhost:3306/municipio_ortiz_carlos?allowPublicKeyRetrieval=true&useSSL=false";
	private static String driver="com.mysql.cj.jdbc.Driver";
	
	
	
	public static Connection getConexion(){
		if(con==null){
			try{
				Class.forName(driver);
				con=DriverManager.getConnection(url, user, pass);
				System.out.println("Conexion exitosa: "+ con.getClass().getName());
			}
			catch(ClassNotFoundException ex){
				throw new RuntimeException("no se encuentra el driver"+driver, ex);
			}
			catch(SQLException ex){
				System.out.println("salio error"+ex);
				throw new RuntimeException("no se pudo establecer la conexion con la bd", ex);
			}
		}
		return con;
	}
	
	
	
	
}
