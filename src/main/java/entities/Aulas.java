package entities;

public class Aulas {

	
	private String curso;
	private String turma;
	private String disciplina;
	private Integer id_sala;
	private String nomeCurso;
	private String nomeTurma;
	private String nomeDisciplina;
	private String nomeProfessor;
	private String horario;
	
	public Aulas() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Aulas(String curso, String turma, String disciplina, Integer id_sala, String nomeCurso, String nomeTurma,
			String nomeDisciplina, String nomeProfessor) {
		super();
		this.curso = curso;
		this.turma = turma;
		this.disciplina = disciplina;
		this.id_sala = id_sala;
		this.nomeCurso = nomeCurso;
		this.nomeTurma = nomeTurma;
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProfessor = nomeProfessor;
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

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	


	
	

}
