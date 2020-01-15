package br.uff.diogo.lp.animais.mamiferos;

import br.uff.diogo.lp.animais.tipos.Mamifero;
import br.uff.diogo.lp.funcionarios.Funcionario;
import br.uff.diogo.lp.util.EspecieMamifero;

public class Elefante extends Mamifero{

	private String nome;
	private int quantidadeComida;
	private int peso;
	private Funcionario funcionario;
	
	public Elefante() {
		super.especie = EspecieMamifero.ELEFANTE;
		this.quantidadeComida = 100;// 100kg por dia
		this.peso = 6000; // 6000 kg 
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
		return 671;// 671 dias
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
