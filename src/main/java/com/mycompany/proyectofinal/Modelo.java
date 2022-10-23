
package com.mycompany.proyectofinal;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
	
	
	
	
	public List<Reclamo> getReclamo(){
		List<Reclamo> Lista = new ArrayList<>();
		Lista.add(new Reclamo("asgas",1));
		Lista.add(new Reclamo("1241241",2));
		Lista.add(new Reclamo("aasgasgasgagagagsss",3));
		return Lista;
	}

	
	
}
