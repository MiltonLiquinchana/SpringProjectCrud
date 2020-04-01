package ec.edu.intsuperior.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Persona {

	/*con @Id definimos que es una llave primaria*/
	@Id
	private int idPersona;
	/*comulm le desimos que es una columna(name="", length=50) con
	 * name le monemos un nombre a la columna independiente
	 * del nombre de la variable, y el tamaño que soporta*/
	@Column(name="nombre", length = 50)
	private String nombre;
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
