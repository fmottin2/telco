package br.com.alura.new_customer_consumer_service;

public class Customer {
	private String nomeCompleto;
	private String email;
	private String telefone;
	private String nomeRua;
	private String cidade;
	
	public Customer(String nomeCompleto, String email, String telefone, String nomeRua, String cidade) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.telefone = telefone;
		this.nomeRua = nomeRua;
		this.cidade = cidade;
	}
}