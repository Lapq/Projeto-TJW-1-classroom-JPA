package control;

import java.io.IOException;
import java.util.Date;
import jpaUtils.ReadLob;
import model.*;

public class SalvarPessoa {
	/*public SalvarPessoa() {
		
	}*/

	public SalvarPessoa() throws IOException {//TODO DELETAR NA VERSÃO DE PRODUÇÃO		
		this(	"João Cordeiro",
				"00000000000",
				new Date(90,0,1),
				new ReadLob().getFoto(".\\foto\\joaocordeiro.jpg"),
				'a'
		);
	}
	
	public SalvarPessoa(String nome, String cpf, Date dtNascimento, byte[] foto, char flagAluProf) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		pessoa.setDataNascimento(dtNascimento);
		pessoa.setFoto(foto);
		
		if (flagAluProf == 'a') new SalvarAluno(pessoa);
		//else if (flagAluProf == 'p') new SalvarProfessor();
		//else if (flagAluProf == 'p') SalvarProfessor (pessoa);
	}
}
