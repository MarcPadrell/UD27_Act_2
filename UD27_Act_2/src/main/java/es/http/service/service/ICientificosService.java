package es.http.service.service;

import java.util.List;

import es.http.service.dto.Cientificos;

public interface ICientificosService {

	// Metodos del CRUD
	public List<Cientificos> listarCientificos(); // Listar All

	public Cientificos guardarCientifico(Cientificos cientifico); // Guarda un  CREATE

	public Cientificos cientificosXID(String dni); // Leer datos de un  READ

	public Cientificos actualizarCientificos(Cientificos cientifico); // Actualiza datos del  UPDATE

	public void eliminarCientificos(String dni);// Elimina el  DELETE

}
