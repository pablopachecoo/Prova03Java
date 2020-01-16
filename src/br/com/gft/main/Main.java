package br.com.gft.main;

import java.util.ArrayList;

import br.com.gft.model.Pessoa;

public class Main {
	public static void main(String[] args) {

		Pessoa joao = new Pessoa("Joao", 15);
		Pessoa leandro = new Pessoa("Leandro", 21);
		Pessoa paulo = new Pessoa("Paulo", 17);
		Pessoa jessica = new Pessoa("Jessica", 18);

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(joao);
		pessoas.add(leandro);
		pessoas.add(paulo);
		pessoas.add(jessica);
		
	
		System.out.println(pessoas.size() + " Pessoas na Lista" + "\n" + "---------------------------------------------------");
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i).getNome() + " " + pessoas.get(i).getIdade());
		}
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getIdade() < 18) {
				System.out.println(pessoas.get(i).getNome()+ " Removido da lista por ser menor de idade");
				pessoas.remove(i);
			}
		}
		System.out.println("---------------------------------------------------" + "\n");
		System.out.println(pessoas.size() + " Pessoas na lista");
	}

}
