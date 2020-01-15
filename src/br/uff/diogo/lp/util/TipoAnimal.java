package br.uff.diogo.lp.util;

import br.uff.diogo.lp.animais.Animal;
import br.uff.diogo.lp.animais.ave.Aguia;
import br.uff.diogo.lp.animais.ave.Arara;
import br.uff.diogo.lp.animais.ave.Falcao;
import br.uff.diogo.lp.animais.mamiferos.Elefante;
import br.uff.diogo.lp.animais.mamiferos.Leao;
import br.uff.diogo.lp.animais.mamiferos.Macaco;
import br.uff.diogo.lp.animais.reptil.Cobra;
import br.uff.diogo.lp.animais.reptil.Jacare;
import br.uff.diogo.lp.animais.reptil.Lagarto;

public enum TipoAnimal {
	AGUIA("Aguia", "Ave", Aguia.class),
	ARARA("Arara", "Ave", Arara.class),
	FALCAO("Falcao", "Ave", Falcao.class),
	LEAO("Leao", "Mamifero", Leao.class),
	ELEFANTE("Elefante", "Mamifero", Elefante.class),
	MACACO("Macaco", "Mamifero", Macaco.class),
	LAGARTO("Lagarto", "Reptil", Lagarto.class),
	JACARE("Jacare", "Reptil", Jacare.class),
	COBRA("Cobra", "Reptil", Cobra.class);
	
        
	private Class<? extends Animal> clazz;
	private String nome;
	private String familia;
	
	private TipoAnimal(String nome, String familia, Class<? extends Animal> clazz) {
		this.clazz = clazz;
		this.nome = nome;
		this.familia = familia;
	}
	
	public Class<? extends Animal> getClasse(){
		return clazz;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getFamilia() {
		return familia;
	}
}
