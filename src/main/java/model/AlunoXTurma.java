package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;


@Entity
@Table (name = "ALUNOXTURMA")
public class AlunoXTurma {
	@Id
	@GeneratedValue
	@Column (name = "ID_ALUNOXTURMA")
	private Long idAlunoXTurma;
	
	@ManyToOne (targetEntity = Aluno.class)
	@JoinColumn (name = "ID_ALUNO")
	private Aluno aluno;
	
	@ManyToOne (targetEntity = Turma.class)
	@JoinColumn (name = "ID_TURMA")
	private Turma turma;
	
	@Column (name = "MEDIA")
	private float media;
	
	@Column (name = "PRESENCA")
	private float presenca;
	
	@OneToMany (targetEntity = AlunoTurmaXAtividade.class, mappedBy = "alunoXTurma")
	private Collection<AlunoTurmaXAtividade> alunoTurmaXAtividade = new ArrayList<AlunoTurmaXAtividade>();

	public Long getIdAlunoXTurma() {
		return idAlunoXTurma;
	}

	public void setIdAlunoXTurma(Long idAlunoXTurma) {
		this.idAlunoXTurma = idAlunoXTurma;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public float getPresenca() {
		return presenca;
	}

	public void setPresenca(float presenca) {
		this.presenca = presenca;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Collection<AlunoTurmaXAtividade> getAlunoTurmaXAtividade() {
		return alunoTurmaXAtividade;
	}

	public void setAlunoTurmaXAtividade(Collection<AlunoTurmaXAtividade> alunoTurmaXAtividade) {
		this.alunoTurmaXAtividade = alunoTurmaXAtividade;
	}
}
