package ListaAzaferes;

import java.util.ArrayList;

public class Usuario {

	public int id;
	public String nome;
	private String email;
	private String senha;
	ArrayList<Tarefa> listaTarefas = new ArrayList<>();
	
	
	
	public Usuario(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void adicionarTarefa(Tarefa t){
		listaTarefas.add(t);
	}
	public void removerTarefa(int id) {
		listaTarefas.remove(id);
	}
	public void exibirTarefas(){
		if(listaTarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa cadastrada");
		}
		else{
		
		for(Tarefa t : listaTarefas) {
			System.out.println(t);
		}
	}

	}
}