package mx.unam.jakarta.proyecto.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.model.SelectItem;
import jakarta.inject.Named;
import mx.unam.jakarta.proyecto.controller.util.Util;
import mx.unam.jakarta.proyecto.model.dto.AreaDTO;
import mx.unam.jakarta.proyecto.model.dto.UsuarioDTO;

@Named
@SessionScoped
public class AdministracionUsuariosBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<UsuarioDTO> listaUsuarios;
	private List<AreaDTO> listaAreas;
	private UsuarioDTO usuarioTmp;
	private AreaDTO areaSeleccionada;
	private UsuarioDTO usuarioSeleccionado;
	private Integer contadorUsuario;
	
	@PostConstruct
	public void init() {
		contadorUsuario = Integer.valueOf(2);
		listaUsuarios = new ArrayList<UsuarioDTO>();
		listaAreas = Util.obtenerAreas();
		/*listaAreas = Util.obtenerAreas().stream().map(a -> 
			new SelectItem(a.getId(), a.getDescripcion())
		).collect(Collectors.toList());*/
		
		listaUsuarios.add(new UsuarioDTO(1, "Oscar", "Urbina", "Martinez", null, "UIMO940613", "oscar@mail.com", "12345678", 
				new AreaDTO(5, "Sistemas", null, null)));
		usuarioTmp = new UsuarioDTO();
	}

	public String guardarUsuario() {
		if(usuarioTmp.getId() == null) {
			usuarioTmp.setId(contadorUsuario);
		} else {
			/*buscar en la lista de usuarios */
		}
		//usuarioTmp.setArea(new AreaDTO(1, areaSeleccionada, null, null));
		listaUsuarios.add(usuarioTmp);
		usuarioTmp = new UsuarioDTO();
		return "administracion";
	}
	
	public String cancelarAlta() {
		return "administracion";
	}
	
	public String irAEditar() {
		/* aqui se va a cargar el usuario seleccionado */
		usuarioTmp = usuarioSeleccionado;
		return "altaUsuario";
	}
	
	public String eliminarUsuario() {
		/* aqui se eliminara el usuario de la lista */
		if(listaUsuarios.contains(usuarioSeleccionado)) {
			listaUsuarios.remove(listaUsuarios.lastIndexOf(usuarioSeleccionado));
			usuarioSeleccionado = new UsuarioDTO();
		}
		
		return "administracion";
	}
	
	public List<UsuarioDTO> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<UsuarioDTO> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<AreaDTO> getListaAreas() {
		return listaAreas;
	}

	public void setListaAreas(List<AreaDTO> listaAreas) {
		this.listaAreas = listaAreas;
	}

	public UsuarioDTO getUsuarioTmp() {
		return usuarioTmp;
	}

	public void setUsuarioTmp(UsuarioDTO usuarioTmp) {
		this.usuarioTmp = usuarioTmp;
	}

	public AreaDTO getAreaSeleccionada() {
		return areaSeleccionada;
	}

	public void setAreaSeleccionada(AreaDTO areaSeleccionada) {
		this.areaSeleccionada = areaSeleccionada;
	}

	public UsuarioDTO getUsuarioSeleccionado() {
		return usuarioSeleccionado;
	}

	public void setUsuarioSeleccionado(UsuarioDTO usuarioSeleccionado) {
		this.usuarioSeleccionado = usuarioSeleccionado;
	}
	
	
}
