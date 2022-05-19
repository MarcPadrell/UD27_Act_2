package es.http.service.service;

import java.util.List;

import es.http.service.dto.Asignado_A;

public interface IAsignado_AService {

	// Metodos del CRUD
	public List<Asignado_A> listarAsignado_A(); // Listar All

	public Asignado_A guardarAsignado_A(Asignado_A asignado_a); // Guarda un RegistroCurso CREATE

	public Asignado_A Asignado_AXID(int id); // Leer datos de un RegistroCurso READ

	public Asignado_A actualizarAsignado_A(Asignado_A asignado_a); // Actualiza datos del RegistroCurso UPDATE

	public void eliminarAsignado_A(int id);// Elimina el RegistroCurso DELETE

}
