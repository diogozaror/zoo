package br.uff.diogo.lp.funcionarios;

import br.uff.diogo.lp.util.TipoAnimal;

public interface Funcionario {

	public int getID();
	
	public void setID(int id);
	
	public String getNome();
	
	public void setNome(String nome);
	
	public String getSenha();
	
	public void setSenha(String senha);
	
	public TipoAnimal getEspecializacao();
	
	public void setEspecializacao(TipoAnimal animal);

	public int getSalario();
	
	public void setSalario(int salario);
}