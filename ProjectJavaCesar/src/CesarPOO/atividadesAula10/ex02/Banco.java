package cesarPOO.atividadesAula10.ex02;

public class Banco {
	
	private String nome;
	private String endereco;
	private Cliente[] cliente;
	private Transacao[] transacao;
	private Calendario calendario;
	
	public Banco() {
		
	}
	
	public Banco(String nome, String endereco, Cliente[] cliente, Transacao[] transacao, Calendario calendario) {
		this.nome = nome;
		this.endereco = endereco;
		this.cliente = cliente;
		this.transacao = transacao;
		this.calendario = calendario;
	}


	public Transacao[] getTransacao() {
		return transacao;
	}



	public void setTransacao(Transacao[] transacao) {
		this.transacao = transacao;
	}



	public Calendario getCalendario() {
		return calendario;
	}



	public void setCalendario(Calendario calendario) {
		this.calendario = calendario;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Cliente[] getCliente() {
		return cliente;
	}



	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}


}
