package ListaAzaferes;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(1, "Carlos", "carlos@gmail.com", "1234");
		Tarefa tarefa1 = new Tarefa(101, "Estudiar Java", "Repasar herencia y polimorfismo", hoy, true,hoy,hoy);
        Tarefa tarefa2 = new Tarefa(102, "Ir al supermercado", "Comprar leche y huevos", hoy, true );
        Tarefa tarefa3 = new Tarefa(103, "Ejercicio", "Correr 5km", hoy, true);


	        usuario.adicionarTarefa(tarefa1);
	        usuario.adicionarTarefa(tarefa2);
	        usuario.adicionarTarefa(tarefa3);

	        System.out.println("📋 Lista de tareas:");
	        usuario.exibirTarefas();


	        usuario.removerTarefa(102);


	        System.out.println("\n📋 Lista de tareas después de eliminar la tarea con ID 102:");
	        usuario.exibirTarefas();
	    }
	}