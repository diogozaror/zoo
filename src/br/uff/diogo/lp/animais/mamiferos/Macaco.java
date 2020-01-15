package br.uff.diogo.lp.animais.mamiferos;

import br.uff.diogo.lp.animais.tipos.Mamifero;
import br.uff.diogo.lp.funcionarios.Funcionario;
import br.uff.diogo.lp.util.EspecieMamifero;

public class Macaco extends Mamifero{

	private String nome;
	private int quantidadeComida;
	private int peso;
	private Funcionario funcionario;
	
	public Macaco() {
		super.especie = EspecieMamifero.MACACO;
		this.quantidadeComida = 4;// 4kg por dia
		this.peso = 40; // 40 kg 
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
		return 150;// 150 dias
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
