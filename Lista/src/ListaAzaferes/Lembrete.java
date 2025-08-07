package ListaAzaferes;
import java.util.Date;
public class Lembrete {

	public int id;
	public Date aviso;
	public String mensagem;
	public Lembrete(int id, Date aviso, String mensagem) {
		this.id = id;
		this.aviso = aviso;
		this.mensagem = mensagem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getAviso() {
		return aviso;
	}
	public void setAviso(Date aviso) {
		this.aviso = aviso;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public void enviarMensagem() {
		System.out.println("Lembrete: " + mensagem);
	}
	
	
}
