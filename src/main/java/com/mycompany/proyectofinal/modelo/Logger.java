/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal.modelo;

import com.mycompany.proyectofinal.DTO.LoggerDTO;
import com.mycompany.proyectofinal.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VGRCAORT
 */
public class Logger {
	
	private final static String INSERT_LOGGER = "INSERT INTO logger (user_id,fecha,hora,id_Persona) VALUES (?,?,?,?)";
	private String GET_ALL = "SELECT * FROM logger";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/municipio_ortiz_carlos?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String USER = "root";
	private static final String PASS = "Prisma01";
	
	
	public int addLog(LoggerDTO log) throws SQLException {
		int registroAgregado=0;
		try(Connection con= Conexion.getConexion(DRIVER, URL, USER, PASS); PreparedStatement ps = con.prepareStatement(INSERT_LOGGER)){
			fps(ps, log);
			registroAgregado= ps.executeUpdate();
		
		} catch (SQLException ex){
			 throw new RuntimeException("Error de SQL en el logger", ex);
		}
		

		return registroAgregado;
	}
	
	
	
	public List<LoggerDTO> mostrarList(Persona m) throws SQLException {
		List<LoggerDTO> log = new ArrayList<>();
		GET_ALL=m.getLogs();
		try (Connection con = Conexion.getConexion(DRIVER, URL, USER, PASS); PreparedStatement ps = con.prepareStatement(GET_ALL)) {
	ResultSet rs = ps.executeQuery();
		while (rs.next()) {
                log.add(rsToLog(rs));
            }
	} catch (SQLException ex) {
            throw new RuntimeException("Error al obtener datos ", ex);
        }
		return log;
	}
	
	
	

	private void fps(PreparedStatement ps, LoggerDTO log) throws SQLException {
		ps.setString(1, log.getId());
		ps.setObject(2, log.getDia());
		ps.setObject(3, log.getHora());
		ps.setLong(4, log.getId_Persona());
		
		
		
	}

	private LoggerDTO rsToLog(ResultSet rs) throws SQLException {
	int id = rs.getInt("id_logger");
        String user = rs.getString("user_id");
        LocalDate fecha = rs.getDate("fecha").toLocalDate();
        LocalTime hora = rs.getTime("hora").toLocalTime();

        return new LoggerDTO(id,user,fecha, hora);
	}
	
	public LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDateTime();
}
		

}
