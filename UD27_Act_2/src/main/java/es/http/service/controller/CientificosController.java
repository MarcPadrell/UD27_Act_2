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

import es.http.service.dto.Cientificos;
import es.http.service.service.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosController {
	
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosServiceImpl.listarCientificos();
	}
	
	
	@PostMapping("/cientificos")
	public Cientificos salvarCientifico(@RequestBody Cientificos cientifico) {
		
		return cientificosServiceImpl.guardarCientifico(cientifico);
	}
	
	
	@GetMapping("/cientificos/{dni}")
	public Cientificos cientificoXID(@PathVariable(name="dni") String dni) {
		
		Cientificos Cientifico_xid= new Cientificos();
		
		Cientifico_xid=cientificosServiceImpl.cientificosXID(dni);
				
		return Cientifico_xid;
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientificos actualizarCientificos(@PathVariable(name="dni")String dni,@RequestBody Cientificos cientifico) {
		
		Cientificos Cientifico_seleccionado= new Cientificos();
		Cientificos Cientifico_actualizado= new Cientificos();
		
		Cientifico_seleccionado= cientificosServiceImpl.cientificosXID(dni);
		
		Cientifico_seleccionado.setNom_apel(cientifico.getNom_apel());
		
		Cientifico_actualizado = cientificosServiceImpl.actualizarCientificos(Cientifico_seleccionado);
				
		return Cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eleiminarCientifico(@PathVariable(name="dni")String dni) {
		cientificosServiceImpl.eliminarCientificos(dni);
	}

}
