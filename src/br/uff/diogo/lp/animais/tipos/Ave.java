package br.uff.diogo.lp.animais.tipos;

import br.uff.diogo.lp.animais.Animal;
import br.uff.diogo.lp.util.EspecieAve;

public abstract class Ave implements Animal{

	public EspecieAve especie;
	
	public float getEnvergadura() {
		return 0.0F; //envergadura das asas em cm
	}
}
