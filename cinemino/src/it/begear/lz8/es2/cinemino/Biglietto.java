package it.begear.lz8.es2.cinemino;

public class Biglietto {
	
	private String nome;

	public Biglietto(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
	 

}
