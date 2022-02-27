package mx.unam.jakarta.proyecto.model.dto;

import java.util.Date;


public class AreaDTO {

	private Integer id;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	
	
	public AreaDTO() {
	}
	public AreaDTO(Integer id, String descripcion, Date fechaInicio, Date fechaFin) {
		this.id = id;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
}
