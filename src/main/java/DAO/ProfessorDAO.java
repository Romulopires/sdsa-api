package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import config.ConnectionDB;
import entities.ClasseGenerica;
import entities.Professor;

public class ProfessorDAO {
	
	Connection con;
	PreparedStatement ps;
	
	public List<ClasseGenerica> listar() throws SQLException{
		String sql = " SELECT * FROM colaboradores ";
		
		con = ConnectionDB.getConnection();
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<ClasseGenerica> lista = new ArrayList<>();
		while(rs.next()) {
			ClasseGenerica p = new ClasseGenerica();
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			lista.add(p);
		}
		return lista;
	}

}
