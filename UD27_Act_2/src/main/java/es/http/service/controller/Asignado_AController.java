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

import es.http.service.dto.Asignado_A;
import es.http.service.service.Asignado_AServiceImpl;

@RestController
@RequestMapping("/api")
public class Asignado_AController {
	
	@Autowired
	Asignado_AServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignado_a")
	public List<Asignado_A> listarAsignado_A(){
		return asignadoAServiceImpl.listarAsignado_A();
	}
	
	
	@PostMapping("/asignado_a")
	public Asignado_A salvarAsignado_A(@RequestBody Asignado_A Asignado_A) {
		
		return asignadoAServiceImpl.guardarAsignado_A(Asignado_A);
	}
	
	
	@GetMapping("/asignado_a/{id}")
	public Asignado_A Asignado_AXID(@PathVariable(name="id") int id) {
		
		Asignado_A Asignado_A_xid= new Asignado_A();
		
		Asignado_A_xid=asignadoAServiceImpl.Asignado_AXID(id);
				
		return Asignado_A_xid;
	}
	
	@PutMapping("/asignado_a/{id}")
	public Asignado_A actualizarAsignado_A(@PathVariable(name="id")int id,@RequestBody Asignado_A Asignado_A) {
		
		Asignado_A Asignado_A_seleccionado= new Asignado_A();
		Asignado_A Asignado_A_actualizado= new Asignado_A();
		
		Asignado_A_seleccionado= asignadoAServiceImpl.Asignado_AXID(id);
		
		
		Asignado_A_seleccionado.setCientifico(Asignado_A.getCientifico());
		Asignado_A_seleccionado.setProyecto(Asignado_A.getProyecto());
		
		Asignado_A_actualizado = asignadoAServiceImpl.actualizarAsignado_A(Asignado_A_seleccionado);
				
		return Asignado_A_actualizado;
	}
	
	@DeleteMapping("/asignado_a/{id}")
	public void eleiminarAsignado_A(@PathVariable(name="id")int id) {
		asignadoAServiceImpl.eliminarAsignado_A(id);
	}

}
