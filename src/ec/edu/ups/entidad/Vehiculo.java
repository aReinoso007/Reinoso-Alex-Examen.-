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
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="vehiculo")
	private Ticket ticket;

	public Vehiculo() {
		super();
	}
	
	

	public Vehiculo(String placa, Cliente cliente) {
		super();
		this.placa = placa;
		this.cliente = cliente;
	}



	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
	
	
   
}
