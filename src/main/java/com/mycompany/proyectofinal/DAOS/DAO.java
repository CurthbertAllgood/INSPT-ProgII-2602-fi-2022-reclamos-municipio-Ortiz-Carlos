
package com.mycompany.proyectofinal.DAOS;

import com.mycompany.proyectofinal.model.Persona;
import java.util.List;



public interface DAO<C, T> {
	
	void agregar(C T);
	
	void modificar(C T);
	void eliminar(C T);
	
	void obtener(C id);
	
	List<C> obtenerLista();
	
}
