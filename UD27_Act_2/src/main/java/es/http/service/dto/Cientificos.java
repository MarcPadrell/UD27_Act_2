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
@Table(name = "cientificos") // en caso que la tabala sea diferente
public class Cientificos {

	// Atributos de entidad registro_curso
	@Id
	@Column(name = "dni")//no hace falta si se llama igual
	private String dni;
	
	@Column(name = "nomapels")//no hace falta si se llama igual
	private String nomapels;
	
	@OneToMany
    @JoinColumn(name="dni")
    private List<Asignado_A> asignado_a;
    
    public Cientificos() {
    	
    }

	public Cientificos(String dni, String nom_apel, List<Asignado_A> asignado_a) {
		super();
		this.dni = dni;
		this.nomapels = nom_apel;
		this.asignado_a = asignado_a;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom_apel() {
		return nomapels;
	}

	public void setNom_apel(String nom_apel) {
		this.nomapels = nom_apel;
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
		return "Cientificos [dni=" + dni + ", nom_apel=" + nomapels + ", asignado_a=" + asignado_a + "]";
	}
    
    

}
