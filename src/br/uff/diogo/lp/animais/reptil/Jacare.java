package br.uff.diogo.lp.animais.reptil;

import br.uff.diogo.lp.animais.tipos.Reptil;
import br.uff.diogo.lp.funcionarios.Funcionario;
import br.uff.diogo.lp.util.EspecieReptil;

public class Jacare extends Reptil{

	private String nome;
	private int quantidadeComida;
	private int peso;
	private Funcionario funcionario;
	
	public Jacare() {
		super.especie = EspecieReptil.JACARE;
		this.quantidadeComida = 10;
		this.peso = 70; 
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
	public String getHabitat() {
		return "Pantanal";
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
