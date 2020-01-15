package br.uff.diogo.lp.animais;

import java.util.Map.Entry;
import java.util.TreeMap;

import br.uff.diogo.lp.animais.tipos.Ave;
import br.uff.diogo.lp.animais.tipos.Mamifero;
import br.uff.diogo.lp.animais.tipos.Reptil;
import br.uff.diogo.lp.funcionarios.Funcionario;
import br.uff.diogo.lp.util.TipoAnimal;
import java.util.ArrayList;
import java.util.List;

public class AnimalManager {

	private static TreeMap<String, Animal> animais = new TreeMap<String, Animal>();;
	private static int qtdMamiferos = 0;
	private static int qtdAve = 0;
	private static int qtdReptil = 0;
	
	public static Animal adicionarAnimal(String nome, Funcionario funcionario, TipoAnimal animal) {
		Animal ani = null;
		try {
			ani = animal.getClasse().newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		if(animal.getFamilia().equals("Ave")) {
			qtdAve++;
		}else if(animal.getFamilia().equals("Mamifero")) {
			qtdMamiferos++;
		}else {
			qtdReptil++;
		}
		
		ani.setFuncionario(funcionario);
		ani.setNome(nome);
		
		animais.put(nome, ani);
		
		return ani;
	}
	
	public static Animal getAnimal(String nome) {
		return animais.get(nome);
	}
	
	//public static void removeFuncionario(String nome) {
	public static void removeAnimal(String nome) {
		animais.remove(nome);//se for null ele ja nao vai remover
	}
	
	public static Mamifero[] getMamiferos() {
		int aux=0;
		Mamifero ani[] = new Mamifero[qtdMamiferos];
		for(Entry<String, Animal> ani1 : animais.entrySet()) {
			if(ani1.getValue() instanceof Mamifero) {
				ani[aux] = (Mamifero)ani1.getValue();
				aux++;
			}
		}
		return ani;
	}
	
	public static Reptil[] getRepteis() {
		int aux=0;
		Reptil ani[] = new Reptil[qtdReptil];
		for(Entry<String, Animal> ani1 : animais.entrySet()) {
			if(ani1.getValue() instanceof Reptil) {
				ani[aux] = (Reptil)ani1.getValue();
				aux++;
			}
		}
		return ani;
	}
	
	public static Ave[] getAves() {
		int aux=0;
		Ave ani[] = new Ave[qtdAve];
		for(Entry<String, Animal> ani1 : animais.entrySet()) {
			if(ani1.getValue() instanceof Ave) {
				ani[aux] = (Ave)ani1.getValue();
				aux++;
			}
		}
		return ani;
	}
        
        public static List<Animal> getListaAnimais(){
            List<Animal> lista = new ArrayList<>(animais.values());
            return lista;
        }
        
        
        
}
