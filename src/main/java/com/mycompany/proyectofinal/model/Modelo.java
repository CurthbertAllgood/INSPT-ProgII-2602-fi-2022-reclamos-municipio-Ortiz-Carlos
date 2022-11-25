
package com.mycompany.proyectofinal.model;

import java.util.List;
public interface Modelo<T> {
    /**
     * Devuelve una lista de alumnos existentes
     * @return 
     */
    public List<T> getList();
    
    /**
     * Retorna un alumno por ID
     * @param id el id del alumno a retornar
     * @return El alumno encontrado por ID o null si no existe
     */
    public T get(int C);
    
    /**
     * Agrega un alumno al modelo
     * @param alumno El alumno a agregar
     * @return La cantidad de registros modificados
     */
    public int add(T C);
    
    /**
     * Modifica un alumno del modelo
     * @param alumno El alumno que contiene los datos para modificar
     * @return La cantidad de registros modificados
     */
    public int update(T C);
    
    /**
     * Borra un alumno por ID
     * @param id el id del alumno a borrar
     * @return La cantidad de registros modificados
     */
    public int remove(int C);

}
