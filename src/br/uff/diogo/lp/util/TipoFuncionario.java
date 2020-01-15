package br.uff.diogo.lp.util;

import br.uff.diogo.lp.funcionarios.Cuidador;
import br.uff.diogo.lp.funcionarios.Funcionario;
import br.uff.diogo.lp.funcionarios.Veterinario;

public enum TipoFuncionario {
	CUIDADOR(Cuidador.class),
	VETERINARIO(Veterinario.class);
	
	private Class<? extends Funcionario> clazz; 
	
	private TipoFuncionario(Class<? extends Funcionario> clazz) {
		this.clazz = clazz;
	}
	
	public Class<? extends Funcionario> getClasse(){
		return clazz;
	}
}
