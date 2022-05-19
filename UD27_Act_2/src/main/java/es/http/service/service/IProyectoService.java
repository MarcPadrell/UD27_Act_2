package es.http.service.service;

import java.util.List;

import es.http.service.dto.Proyecto;

public interface IProyectoService {

	// Metodos del CRUD
	public List<Proyecto> listarProyectos(); // Listar All

	public Proyecto guardarProyecto(Proyecto proyecto); // Guarda un Estudiante CREATE

	public Proyecto proyectoXID(String id); // Leer datos de un Estudiante READ

	public Proyecto actualizarProyecto(Proyecto proyecto); // Actualiza datos del estudiante UPDATE

	public void eliminarProyecto(String id);// Elimina el estudiante DELETE

}
