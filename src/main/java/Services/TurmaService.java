package Services;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.TurmaDAO;
import entities.ClasseGenerica;
import entities.ClasseTurma;

@Path ("/ws/turma")	
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class TurmaService {
	
	TurmaDAO tDao;
	
	public TurmaService() {
		tDao = new TurmaDAO();
	}
	
	@GET
	@Path("/todos")
	public List<ClasseTurma> buscarTodos(){
		try {
			return tDao.listar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}
