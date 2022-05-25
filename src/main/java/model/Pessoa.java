package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table (name = "PESSOA")
public class Pessoa {

	@Id
	@GeneratedValue
	@Column (name = "ID_PESSOA")
	private Long idPessoa;
	
	@Column (name = "NOME")
	private String nome;
	
	@Column (name = "CPF")
	private String cpf;
	
	@Temporal (TemporalType.DATE)
	@Column (name = "DATA_NASCIMENTO")
	private Date dataNascimento;
	
	@Lob
	@Column (name = "FOTO")
	private byte[] foto;
	
	@Column (name = "EMAIL")
	private String email;
	
	@OneToOne (targetEntity = Aluno.class, mappedBy = "pessoa")
	private Aluno aluno;
	
	@OneToOne (targetEntity = Professor.class, mappedBy = "pessoa")
	private Professor professor;

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
