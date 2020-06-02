package ec.edu.ups.jpa;

import javax.persistence.Persistence;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.entidad.Cliente;

public class JPAClienteDAO extends JPAGenericDAO<Cliente, String> implements ClienteDAO{

	public JPAClienteDAO() {
		super(Cliente.class);
		this.em = Persistence.createEntityManagerFactory("Reinoso-Alex-Examen").createEntityManager();
		// TODO Auto-generated constructor stub
	}

}
