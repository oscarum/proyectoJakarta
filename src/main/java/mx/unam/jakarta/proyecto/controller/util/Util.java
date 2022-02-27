package mx.unam.jakarta.proyecto.controller.util;

import java.util.ArrayList;
import java.util.List;

import mx.unam.jakarta.proyecto.model.dto.AreaDTO;

public final class Util {

	public static List<AreaDTO> obtenerAreas(){
		List<AreaDTO> areas = new ArrayList<>();
		areas.add(new AreaDTO(1, "Recursos Humanos", null, null));
		areas.add(new AreaDTO(2, "Area Legal", null, null));
		areas.add(new AreaDTO(3, "Contaduria", null, null));
		areas.add(new AreaDTO(4, "Ventas", null, null));
		areas.add(new AreaDTO(5, "Sistemas", null, null));
		return areas;
	}
	
}
