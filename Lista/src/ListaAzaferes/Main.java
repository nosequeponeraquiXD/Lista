package ListaAzaferes;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(1, "Carlos", "carlos@gmail.com", "1234");
		Tarefa tarefa1 = new Tarefa(101, "Estudar Java", "revisao de herenca y polimorfismo", hoje, true,hoje,hoje);
        Tarefa tarefa2 = new Tarefa(102, "vá ao supermercado", "Comprar leite e ovos", hoje, true );
        Tarefa tarefa3 = new Tarefa(103, "exercício", "Correr 5km", hoje, true);


	        usuario.adicionarTarefa(tarefa1);
	        usuario.adicionarTarefa(tarefa2);
	        usuario.adicionarTarefa(tarefa3);

	        System.out.println(" Lista de tarefas:");
	        usuario.exibirTarefas();


	        usuario.removerTarefa(102);


	        System.out.println("\n Lista de tarefas após a exclusão da tarefa com ID 102:");
	        usuario.exibirTarefas();
	    }
	}
