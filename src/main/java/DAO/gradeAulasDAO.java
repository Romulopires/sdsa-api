package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ConnectionDB;
import entities.Aulas;

public class gradeAulasDAO {
	
	Connection con;
	
	public gradeAulasDAO() throws SQLException {
		con = ConnectionDB.getConnection();
	}
	
	public Aulas listarTabela(int colaborador, int dia_semana, int periodo){
		String sql = "SELECT a.id_sala, t.nome AS nomeTurma, c.nome AS nomeCurso, d.nome AS nomeDisciplina "
				+ " FROM Aulas a INNER JOIN turmas t INNER JOIN cursos c INNER JOIN disciplinas d "
				+ " ON a.id_turmas = t.id AND a.id_cursos = c.id AND a.id_disciplina = d.id "
				+ " WHERE a.id_colaborador = ? AND a.dia_semana = ? AND a.periodo = ? ";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, colaborador);
			ps.setInt(2, dia_semana);
			ps.setInt(3, periodo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Aulas a = new Aulas();
				a.setNomeCurso(rs.getString("nomeCurso"));
				a.setNomeTurma(rs.getString("nomeTurma"));
				a.setNomeDisciplina(rs.getString("nomeDisciplina"));
				a.setId_sala(rs.getInt("id_sala"))	;
				return a;
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	
	public Aulas gradeAulasTurma(int turma, int dia_semana, int periodo) {
		String sql = "SELECT a.id_sala, t.nome AS nomeTurma, c.nome AS nomeCurso, d.nome AS nomeDisciplina "
				+ " FROM Aulas a INNER JOIN turmas t INNER JOIN cursos c INNER JOIN disciplinas d "
				+ " ON a.id_turmas = t.id AND a.id_cursos = c.id AND a.id_disciplina = d.id "
				+ " WHERE a.id_turma = ? AND a.dia_semana = ? AND a.periodo = ? ";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, turma);
			ps.setInt(2, dia_semana);
			ps.setInt(3, periodo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Aulas a = new Aulas();
				a.setNomeCurso(rs.getString("nomeCurso"));
				a.setNomeDisciplina(rs.getString("nomeDisciplina"));
				a.setId_sala(rs.getInt("id_sala"))	;
				return a;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}
