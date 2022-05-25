package control;

import javax.persistence.EntityManager;

import jpaUtils.JPAUtil;
import model.*;

public class SalvarAluno {
	public SalvarAluno(Pessoa pessoa){//TODO DELETAR ISSO NA PRODUÇÃO
		this ("2018100000000", pessoa);
	}
	
	public SalvarAluno(String matricula, Pessoa pessoa){
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
		aluno.setPessoa(pessoa);
		
		EntityManager classroomManager = JPAUtil.getEntityManager();
		classroomManager.getTransaction().begin();
		classroomManager.persist(pessoa);
		classroomManager.persist(aluno);
		classroomManager.getTransaction().commit();
		classroomManager.close();
	}
}
