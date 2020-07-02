package it.begear.lz8.es2.cinemino;

public class Spettatore {
	
	private String nome;
	
	public Spettatore (String nome) {
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

