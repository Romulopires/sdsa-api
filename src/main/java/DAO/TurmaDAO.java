package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.ConnectionDB;
import entities.ClasseGenerica;
import entities.ClasseTurma;

public class TurmaDAO {
	Connection con;
	PreparedStatement ps;
	
	public List<ClasseTurma> listar() throws SQLException{
		String sql = " SELECT * FROM turmas ";
		
		con = ConnectionDB.getConnection();
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<ClasseTurma> lista = new ArrayList<>();
		while(rs.next()) {
			ClasseTurma p = new ClasseTurma();
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			lista.add(p);
		}
		return lista;
		
	}
}
