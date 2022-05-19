package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "proyecto") // en caso que la tabala sea diferente
public class Proyecto {

	// Atributos de entidad curso
	@Id
	@Column(name = "id") // busca ultimo valor e incrementa desde id final de db
	private String id;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	@Column(name = "horas") // no hace falta si se llama igual
	private int horas;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Asignado_A> asignado_a;
	
    public Proyecto() {
    	
    }

	public Proyecto(String id, String nombre, int horas, List<Asignado_A> asignado_a) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignado_a = asignado_a;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @return the Asignado_A
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_A")
	public List<Asignado_A> getAsignado_a() {
		return asignado_a;
	}

	public void setAsignado_a(List<Asignado_A> asignado_a) {
		this.asignado_a = asignado_a;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignado_a=" + asignado_a + "]";
	}
        
    
}
