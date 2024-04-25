package colecoes;

import java.util.ArrayList;
import java.util.Comparator;

public class TestandoList {

	public static void main(String[] args) {
		// utilizando o ArrayList - coleção de dados
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		//nomes = "Maria";
		
		//lista [ ] [ ] [ Ericles ]
		nomes.add("Maria");//indice 0
		nomes.add("Eliana");//indice 1
		
		//metodo add adiciona os dados dentro do objeto nomes
		System.out.println(nomes);
		
		nomes.add(1, "Ericles");
		System.out.println(nomes);
		
		System.out.println(nomes.get(2) + " é uma participante da jornada dev java");
		
		nomes.add("Maria");
		
		System.out.println(nomes.indexOf("Maria"));
		System.out.println(nomes);
		
		//metodo set altera um dado de uma posição, precisa informar o indice
		nomes.set(0, "Maria Silva");
		
		System.out.println(nomes);
		
		//metodo remove - remove um item da list
		nomes.remove(3);
		
		System.out.println(nomes);
		
		//metodo size exibe o tamanho da lista, quantos itens temos na lista
		System.out.println("o tamanho do objeto é: "+nomes.size());
		
		//metodo isEmpty retorna se a lista esta vazia um true
		System.out.println("a lista esta vazia? " + nomes.isEmpty());
		
		//metodo contains retorna se o nome existe dentro da lista - no caso se sim retorna true caso não false
		System.out.println("Tem Eliana na lista? " + nomes.contains("Eliana"));
		
		//metodo sort ordena os itens da lista em ordem alfabetica crescente
		nomes.sort(null);
		System.out.println(nomes);
		
		//metodo sort ordena os itens da lista em ordem alfabetica decrescente
		nomes.sort(Comparator.reverseOrder());
		
		System.out.println(nomes);
		nomes.clear();//limpa a minha lista
		System.out.println("a lista esta vazia? " + nomes.isEmpty());
		
		System.out.println(nomes);
	}

}
