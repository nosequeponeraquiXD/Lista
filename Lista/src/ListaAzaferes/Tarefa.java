package ListaAzaferes;

import java.util.Date;

public class Tarefa {

	public int id;
	public String nome;
	public String descricao;
	public Date data;
	public boolean concluida;
	public Date dataCriacao;
	public Date dataAtualizacao;

	public Tarefa( int id, String nome, String descricao, Date data, boolean concluida, Date dataCriacao,
			Date dataAtualizacao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.data = data;
		this.concluida = concluida;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	} 	

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	
	public boolean marcarConcluida() {
		return true;
	}
	public boolean marcarIncompleta() {
		return false;
	}
	public void reagendar(Date dateVencimento) {
		Date agora = new Date();
	    if (dateVencimento.before(agora)) {
	        System.out.println("❌ A nova data deve ser futura.");
	        return;
	    }
	    this.data = dateVencimento;
	    this.dataAtualizacao = agora;
	    System.out.println("✅ Tarefa reagendada para: " + dateVencimento);
	}
	}
	
	

