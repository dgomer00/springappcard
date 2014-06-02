package es.unileon.springappcard.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author David Gómez Riesgo
 *
 */

/**
 * El objeto de dominio
 */
@Entity
@Table(name = "comissions")
public class Comission implements Serializable {
	private static final long serialVersionUID = 1L;

	// añadimos las anotaciones de JPA que realizan el mapeo entre los campos
	// del objeto
	// y aquellos de la base de datos.
	// Asimismo, hemos añadido el campo id para mapear la clave primaria de la
	// tabla comissions.
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String description;
	private Double comission;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getComission() {
		return comission;
	}

	public void setComission(Double comission) {
		this.comission = comission;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Description: " + description + ";");
		buffer.append("Comission: " + comission);
		return buffer.toString();
	}
}