package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehiculo
 *
 */
@Entity

public class Vehiculo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private String placa;
	@ManyToOne
	@JoinColumn
	private Cliente cliente;

	public Vehiculo() {
		super();
	}
   
}
