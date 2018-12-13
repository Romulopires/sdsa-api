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
		System.out.println("sdsa-api Info: Chamou aula para filtro Professor: "
				+ filtro.getColaborador() + " Dia semana: " + filtro.getDia_semana()
				+ " Periodo: " + filtro.getPeriodo());
		return gDao.listarTabela(filtro.getColaborador(), filtro.getDia_semana(), filtro.getPeriodo(), filtro.getHorario());
		                                                                                                                           
	}
	
	@POST
	@Path("/por-turma")
	public Aulas getAulaTurma(Filtro filtro) {
		return gDao.gradeAulasTurma(filtro.getTurma(), filtro.getDia_semana(), filtro.getPeriodo(), filtro.getHorario()	);
	}
	
	

}
