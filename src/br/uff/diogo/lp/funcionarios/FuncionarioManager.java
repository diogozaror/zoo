package br.uff.diogo.lp.funcionarios;

import java.util.ArrayList;
import java.util.List;

import br.uff.diogo.lp.util.TipoAnimal;
import br.uff.diogo.lp.util.TipoFuncionario;

public class FuncionarioManager {

	private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private static int idGlobal = 0;
	private static int qtdCuidadores = 0;
	private static int qtdVeterinarios = 0;
	
	public static Funcionario adicionarFuncionario(String nome, String senha, int salario, TipoAnimal especializacao, TipoFuncionario tipo) {
		Funcionario func = null;
		try {
			func = tipo.getClasse().newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		func.setID(idGlobal);
		func.setNome(nome);
		func.setSenha(senha);
		func.setSalario(salario);
		func.setEspecializacao(especializacao);
		

		funcionarios.add(func);

		if(tipo.equals(TipoFuncionario.CUIDADOR)) {
			qtdCuidadores++;
		}else {
			qtdVeterinarios++;
		}
		
		idGlobal++;
		
		return func;
	}
	
	public static Funcionario getFuncionario(int id) {
		for(Funcionario func : funcionarios) {
			if(func.getID() == id)return func;
		}
		return null;
	}
	
	public static Funcionario getFuncionario(String nome) {
		for(Funcionario func : funcionarios) {
			if(func.getNome().equals(nome))return func;
		}
		return null;
	}
	
	public static void removeFuncionario(int id) {
		funcionarios.remove(getFuncionario(id));//se for null ele ja nao vai remover
	}

	
	public static Funcionario[] getVeterinarios() {
		int aux=0;
		Funcionario func[] = new Funcionario[qtdVeterinarios];
		for(int i=0;i<funcionarios.size();i++) {
			if(funcionarios.get(i) instanceof Veterinario) {
				func[aux] = funcionarios.get(i);
				aux++;
			}
		}
		return func;
	}
	
	public static Funcionario[] getCuidadores() {
		int aux=0;
		Funcionario func[] = new Funcionario[qtdCuidadores];
		for(int i=0;i<funcionarios.size();i++) {
			if(funcionarios.get(i) instanceof Cuidador) {
				func[aux] = funcionarios.get(i);
				aux++;
			}
		}
		return func;
	}
	
	public static String[] getNomes() {
		int aux = 0;
		String[] nomes = new String[qtdCuidadores+qtdVeterinarios];
		for(Funcionario a : getVeterinarios()) {
			nomes[aux] = a.getNome();
			aux++;
		}
		for(Funcionario a : getCuidadores()) {
			nomes[aux] = a.getNome();
			aux++;
		}
		
		return nomes;
	}
        
	public static void editarVeterinario(int id, String nome, int salario, TipoAnimal especializacao, boolean equipamentos){
		Veterinario v = (Veterinario) getFuncionario(id);
		v.setNome(nome);
		v.setSalario(salario);
		v.setEspecializacao(especializacao);
		v.setEquipamentos(equipamentos);
	}
        
	public static void editarCuidador(int id, String nome, int salario, TipoAnimal especializacao, boolean brinquedos){
		Cuidador c = (Cuidador) getFuncionario(id);
		c.setNome(nome);
		c.setSalario(salario);
		c.setEspecializacao(especializacao);
		c.setBrinquedos(brinquedos);
	}
        
        public static List<Funcionario> getListaFuncionarios(){
            return funcionarios;
        }
	
	public static int getIdGlobal() {
		return idGlobal;
	}
}
