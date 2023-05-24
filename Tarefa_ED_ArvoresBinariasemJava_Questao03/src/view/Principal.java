package view;

import br.edu.fateczl.arvoreChar.Arvore;

public class Principal {

	public static void main(String[] args) throws Exception{
		char[] vetor = {'M','F','S','D','J','P','U','A','E','H','Q','T','W','K'};
		Arvore arvore = new Arvore();
		for(char i: vetor) {
			arvore.insert(i);
		}
		arvore.prefixSearch();
		System.out.println("");
		arvore.infixSearch();
		System.out.println("");
		arvore.postfixSearch();
		System.out.println("");
		arvore.remove('F');
		arvore.remove('U');
		arvore.prefixSearch();
		System.out.println("");
		arvore.infixSearch();
		System.out.println("");
		arvore.postfixSearch();
		
	}

}
