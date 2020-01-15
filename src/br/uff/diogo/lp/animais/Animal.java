package br.uff.diogo.lp.animais;

import br.uff.diogo.lp.funcionarios.Funcionario;

public interface Animal {
	
	void setFuncionario(Funcionario funcionario); // seta o funcionario responsavel por ele
	Funcionario getFuncionario(); // pega o funcionario responsavel por ele
	void setNome(String nome); // seta o nome dado ao animal
	String getNome(); // o nome dado ao animal
	int getQuantidadeComida(); // em kg por dia
	int getPeso(); //em kg
}
