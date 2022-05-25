package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Column;

@Entity
@Table (name = "ALUNOTURMAXATIVIDADE")
public class AlunoTurmaXAtividade {

	@Id
	@GeneratedValue
	@Column (name = "ID_ALUNOTURMAXATIVIDADE")
	private Long idATXA;
	
	@ManyToOne (targetEntity = AlunoXTurma.class)
	@JoinColumn (name = "ID_ALUNOXTURMA")
	private AlunoXTurma alunoXTurma;

	@OneToOne (targetEntity = Atividade.class)
	@JoinColumn (name = "ID_ATIVIDADE")
	private Atividade atividade;
	
	@ManyToOne (targetEntity = Arquivo.class)
	@JoinColumn (name = "ID_ARQUIVO")
	private Arquivo arquivo;
	
	@Temporal (TemporalType.DATE)
	@ManyToOne (targetEntity = Calendario.class)
	@JoinColumn (name = "ENTREGUE_EM")
	private Calendario entregueEm;

	public Long getIdATXA() {
		return idATXA;
	}

	public void setIdATXA(Long idATXA) {
		this.idATXA = idATXA;
	}

	public AlunoXTurma getAlunoXTurma() {
		return alunoXTurma;
	}

	public void setAlunoXTurma(AlunoXTurma alunoXTurma) {
		this.alunoXTurma = alunoXTurma;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	public Calendario getEntregueEm() {
		return entregueEm;
	}

	public void setEntregueEm(Calendario entregueEm) {
		this.entregueEm = entregueEm;
	}
}
