package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.entidad.Cliente;

/**
 * Servlet implementation class CrearCliente
 */
@WebServlet("/CrearCliente")
public class CrearCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cedula;
		String nombre;
		String direccion;
		String telefono;
		
		Cliente cliente = new Cliente();
		
		String accion = request.getParameter("resp");
		ClienteDAO clienteDAO = DAOFactory.getFactory().getClienteDAO();
		
		if(accion.equals("Registrarse")) {
			cedula = request.getParameter("cdi");
			nombre = request.getParameter("nombre");
			direccion = request.getParameter("direccion");
			telefono = request.getParameter("telefono");
			
			cliente = new Cliente(cedula, nombre, direccion, telefono);
			System.out.println("el cliente: "+cliente);
			
			System.out.println("Creando cliente en base");
			clienteDAO.create(cliente);
			System.out.println("Cliente creado en la base"+clienteDAO.findAll());
			
			getServletContext().getRequestDispatcher("/JSPs/Index.jsp").forward(request, response);
		}
		
		
	}

}
