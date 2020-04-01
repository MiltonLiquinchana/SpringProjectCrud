package ec.edu.intsuperior.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.intsuperior.model.Persona;

/*ereda una clase conocida como JpaRepository y dentro de los genericos le ponemso a que entidad
 * va a trabajar y por la llave primaria el tipo*/
public interface IPersonaRepo  extends JpaRepository<Persona, Integer>{

}
