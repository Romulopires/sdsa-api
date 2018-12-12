package Services;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.ProfessorDAO;
import entities.ClasseGenerica;
import entities.Professor;

@Path("/ws/professor")	
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfessorService {
	
	ProfessorDAO pDao;
	
	public ProfessorService() {
		pDao = new ProfessorDAO();
	}
	
	@GET
	@Path("/todos")
	public List<ClasseGenerica> buscarTodos(){
		try {
			System.out.println("sdsa-api Info: Obteve lista de professor");
			return pDao.listar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
