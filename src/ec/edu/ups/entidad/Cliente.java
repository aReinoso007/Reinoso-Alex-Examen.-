package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

import java.util.List;
/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Entity

public class Cliente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private String cedula;
	private String nombre;
	private String direccion;
	private String telefono;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();

	public Cliente() {
		super();
	}

	public Cliente(String cedula, String nombre, String direccion, String telefono, List<Vehiculo> vehiculos) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.vehiculos = vehiculos;
	}

	public Cliente(String cedula, String nombre, String direccion, String telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((vehiculos == null) ? 0 : vehiculos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (vehiculos == null) {
			if (other.vehiculos != null)
				return false;
		} else if (!vehiculos.equals(other.vehiculos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", vehiculos=" + vehiculos + "]";
	}
	
	
   
}
