package br.uff.diogo.lp.animais.tipos;

import br.uff.diogo.lp.animais.Animal;
import br.uff.diogo.lp.util.EspecieMamifero;

public abstract class Mamifero implements Animal{

	public EspecieMamifero especie;
	
	public int getTempoGestacao() {
		return 1; //dias
	}
	
}
