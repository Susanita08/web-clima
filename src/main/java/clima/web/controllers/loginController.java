package clima.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clima.web.modelo.Pais;

@WebServlet("/login")
public class loginController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		Collection<Pais> paises = getPaises();
		req.getSession().setAttribute("paises",paises);
		resp.sendRedirect("login.jsp");
	}
	
	private Collection<Pais> getPaises(){
		Collection<Pais> listaPaises = new ArrayList<>();
		Pais arg= new Pais();
		arg.setId(123);
		arg.setName("Argentina");
		
		Pais ale = new Pais();
		ale.setId(321);
		ale.setName("Alemania");
		
		Pais ven = new Pais();
		ven.setId(456);
		ven.setName("Venezuela");
		
		listaPaises.add(arg);
		listaPaises.add(ale);
		listaPaises.add(ven);
		return listaPaises;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = (String)req.getAttribute("exampleInputEmail1");
		String password= (String)req.getAttribute("exampleInputPassword1");
		Integer pais = (Integer)req.getAttribute("exampleFormControlSelect1");
		
		super.doPost(req, resp);
	}

}
