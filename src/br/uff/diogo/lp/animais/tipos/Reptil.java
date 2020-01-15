package br.uff.diogo.lp.animais.tipos;

import br.uff.diogo.lp.animais.Animal;
import br.uff.diogo.lp.util.EspecieReptil;

public abstract class Reptil implements Animal{

	public EspecieReptil especie;
	
	public String getHabitat() {
		return "null"; //nome do habitat
	}
	
}
