package entities;

public class Aulas {

	
	private String curso;
	private String turma;
	private String disciplina;
	private Integer id_sala;
	
	public Aulas() {
		// TODO Auto-generated constructor stub
	}
	
	public Aulas( String curso, String turma, String disciplina, Integer id_sala) {
		super();
		this.curso = curso;
		this.turma = turma;
		this.disciplina = disciplina;
		this.id_sala = id_sala;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Integer getId_sala() {
		return id_sala;
	}

	public void setId_sala(Integer id_sala) {
		this.id_sala = id_sala;
	}


	
	

}
