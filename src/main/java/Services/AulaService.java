package Services;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.gradeAulasDAO;
import entities.Aulas;
import entities.Filtro;

@Path("/ws/aula")	
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AulaService {
	
	gradeAulasDAO gDao;
	Aulas aulas;
	
	public AulaService() throws SQLException {
		gDao = new gradeAulasDAO();
	}
	
	@POST
	@Path("/por-filtro")
	public Aulas getAula(Filtro filtro) {
		gDao.listarTabela(filtro.getColaborador(), filtro.getDia_semana(), filtro.getPeriodo());
		return getAula(filtro);                                                                                                                           
	}
	
	

}
