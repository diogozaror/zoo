package br.uff.diogo.lp.animais.ave;

import br.uff.diogo.lp.animais.tipos.Ave;
import br.uff.diogo.lp.funcionarios.Funcionario;
import br.uff.diogo.lp.util.EspecieAve;

public class Aguia extends Ave{

	private String nome;
	private int quantidadeComida;
	private int peso;
	private Funcionario funcionario;
	
	public Aguia() {
		super.especie = EspecieAve.AGUIA;
		this.quantidadeComida = 3;
		this.peso = 7;
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int getQuantidadeComida() {
		return quantidadeComida;
	}

	@Override
	public int getPeso() {
		return peso;
	}
	
	@Override
	public float getEnvergadura() {
		return 230;// 230 cm
	}

	@Override
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	@Override
	public String toString(){
		return this.nome;
	}
}
