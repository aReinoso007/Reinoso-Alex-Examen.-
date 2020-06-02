package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ticket
 *
 */
@Entity

public class Ticket implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numero;
	@Temporal(TemporalType.DATE)
	private GregorianCalendar fechaIngreso;
	@Temporal(TemporalType.DATE)
	private GregorianCalendar fechaSalida;
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaIngreso;
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaSalida;
	@OneToOne
	@JoinColumn
	private Vehiculo vehiculo;
	
	
	public Ticket() {
		super();
	}


	public Ticket(int numero, GregorianCalendar fechaIngreso, GregorianCalendar fechaSalida, Date horaIngreso,
			Date horaSalida, Vehiculo vehiculo) {
		super();
		this.numero = numero;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.horaIngreso = horaIngreso;
		this.horaSalida = horaSalida;
		this.vehiculo = vehiculo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public GregorianCalendar getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(GregorianCalendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public GregorianCalendar getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(GregorianCalendar fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public Date getHoraIngreso() {
		return horaIngreso;
	}


	public void setHoraIngreso(Date horaIngreso) {
		this.horaIngreso = horaIngreso;
	}


	public Date getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
   
}
