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
@Table (name = "PROFESSOR")
public class Professor {

	@Id
	@GeneratedValue
	@Column (name = "ID_PROFESSOR")
	private Long idProfessor;
	
	@Column (name = "NUM_REGISTRO")
	private String registro;
	
	@OneToOne (targetEntity = Pessoa.class)
	@JoinColumn (name = "ID_PESSOA")
	private Pessoa pessoa;
	
	@OneToMany (targetEntity = Turma.class, mappedBy = "professor")
	private Collection<Turma> turma = new ArrayList<Turma>();

	public Long getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Long idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Collection<Turma> getTurma() {
		return turma;
	}

	public void setTurma(Collection<Turma> turma) {
		this.turma = turma;
	}
}
