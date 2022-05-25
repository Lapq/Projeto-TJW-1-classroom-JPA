package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.OneToOne;

@Entity
@Table (name = "ALUNO")
public class Aluno {

	@Id
	@GeneratedValue
	@Column (name = "ID_ALUNO")
	private Long idAluno;
	
	@Column (name = "NUM_MATRICULA")
	private String matricula;
	
	@OneToOne (targetEntity = Pessoa.class)
	@JoinColumn (name = "ID_PESSOA")
	private Pessoa pessoa;
	
	@OneToMany (targetEntity = AlunoXTurma.class, mappedBy = "aluno")
	private Collection<AlunoXTurma> alunoXTurma = new ArrayList<AlunoXTurma>();

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Collection<AlunoXTurma> getAlunoXTurma() {
		return alunoXTurma;
	}

	public void setAlunoXTurma(Collection<AlunoXTurma> alunoXTurma) {
		this.alunoXTurma = alunoXTurma;
	}
}
