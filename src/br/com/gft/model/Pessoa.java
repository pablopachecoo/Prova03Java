package br.com.gft.model;

public class Pessoa {

	public String Nome;
	public int idade;

	public Pessoa(String nome, int idade) {
		Nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
