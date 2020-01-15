package br.uff.diogo.lp.funcionarios;

import br.uff.diogo.lp.util.TipoAnimal;

public class Veterinario implements Funcionario{

	private int ID;
	private String nome;
	private String senha;
	private int salario;
	private boolean logado;
	private TipoAnimal especializacao;
	private boolean hasEquipamentos;
	//private Animal animais[];
	
	public Veterinario() {
		this.ID = -1;
		this.nome = "";
		this.senha = "";
		this.salario = -1;
		this.especializacao = null;
		this.logado = false;
		this.hasEquipamentos = false;
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
	
	public boolean isLogado() {
		return logado;
	}
	
	public void setLogado(boolean b) {
		this.logado = b;
	}
	
	public boolean hasEquipamentos() {
		return hasEquipamentos;
	}
	
	public void setEquipamentos(boolean has) {
		this.hasEquipamentos = has;
	}
        
    @Override
    public String toString(){
    	return this.nome;
    }
}
