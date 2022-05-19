package es.http.service.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignado_a") // en caso que la tabala sea diferente
public class Asignado_A {

	// Atributos de entidad registro_curso
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cientifico")
    Cientificos cientifico;
 
    @ManyToOne
    @JoinColumn(name = "proyecto")
    Proyecto proyecto;
    
    public Asignado_A() {
    	
    }

	public Asignado_A(int id, Cientificos cientifico, Proyecto proyecto) {
		super();
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientificos getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Asignado_A [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

}
