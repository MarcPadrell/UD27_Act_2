package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Proyecto;
import es.http.service.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectosController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;

	@GetMapping("/proyectos")
	public List<Proyecto> listarCproyectos() {
		return proyectoServiceImpl.listarProyectos();
	}

	@PostMapping("/proyectos")
	public Proyecto salvarProyectos(@RequestBody Proyecto Proyectos) {

		return proyectoServiceImpl.guardarProyecto(Proyectos);
	}

	@GetMapping("/proyectos/{id}")
	public Proyecto ProyectosXID(@PathVariable(name = "id") String id) {

		Proyecto Proyectos_xid = new Proyecto();

		Proyectos_xid = proyectoServiceImpl.proyectoXID(id);

		return Proyectos_xid;
	}

	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyectos(@PathVariable(name = "id") String id, @RequestBody Proyecto Proyectos) {

		Proyecto Proyectos_seleccionado = new Proyecto();
		Proyecto Proyectos_actualizado = new Proyecto();

		Proyectos_seleccionado = proyectoServiceImpl.proyectoXID(id);

		Proyectos_seleccionado.setNombre(Proyectos.getNombre());
		Proyectos_seleccionado.setHoras(Proyectos.getHoras());

		Proyectos_actualizado = proyectoServiceImpl.actualizarProyecto(Proyectos_seleccionado);

		return Proyectos_actualizado;
	}

	@DeleteMapping("/proyectos/{id}")
	public void eleiminarProyectos(@PathVariable(name = "id") String id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}

}
