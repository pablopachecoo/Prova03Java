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
        
        
        int idadeMax = 0;
        for (int i = 0; i < pessoas.size(); i++) {
        	if (pessoas.get(i).getIdade() > idadeMax) {
        		idadeMax = pessoas.get(i).getIdade();
			}
        	
			
		}
        System.out.println("A idade da pessoa mais velha é de " + idadeMax + " Anos");
	}
	
	

}
