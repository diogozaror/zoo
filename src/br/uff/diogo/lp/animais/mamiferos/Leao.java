package br.uff.diogo.lp.animais.mamiferos;

import br.uff.diogo.lp.animais.tipos.Mamifero;
import br.uff.diogo.lp.funcionarios.Funcionario;
import br.uff.diogo.lp.util.EspecieMamifero;

public class Leao extends Mamifero{

	private String nome;
	private int quantidadeComida;
	private int peso;
	private Funcionario funcionario;
	
	public Leao() {
		super.especie = EspecieMamifero.LEAO;
		this.quantidadeComida = 35;//35kg
		this.peso = 170; //170 kg
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
	public int getTempoGestacao() {
		return 110;// 110 dias
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
