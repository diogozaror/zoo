package br.uff.diogo.lp.funcionarios;

import br.uff.diogo.lp.util.TipoAnimal;

public class Cuidador implements Funcionario{

	private int ID;
	private String nome;
	private String senha;
	private int salario;
	private TipoAnimal especializacao;
	private boolean hasBrinquedos;
	//private Animal animais[];
	
	public Cuidador(){
		this.ID = -1;
		this.nome = "tate";
		this.senha = "";
		this.salario = -1;
		this.especializacao = null;
		this.hasBrinquedos = false;
	}
	
	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void setID(int id) {
		this.ID = id;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getSenha() {
		return senha;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public TipoAnimal getEspecializacao() {
		return especializacao;
	}
	
	@Override
	public void setEspecializacao(TipoAnimal animal) {
		this.especializacao = animal;
	}
	
	@Override
	public int getSalario() {
		return salario;
	}

	@Override
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public void setBrinquedos(boolean has) {
		this.hasBrinquedos = has;
	}
	
	public boolean hasBrinquedos() {
		return hasBrinquedos;
	}
        
	@Override
	public String toString(){
		return this.nome;
	}
}

