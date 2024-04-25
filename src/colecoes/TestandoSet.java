package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TestandoSet {

	public static void main(String[] args) {
		// utilizando o set para coleções de dados
		//criar o set com nome nomes
		Set<String> nomes = new HashSet<String>();
		//nomes = "Thiago";
		nomes.add("Luana");//adiciona nomes na coleção set
		nomes.add("Ellen");
		nomes.add("Luana");
		
		System.out.println(nomes);
		nomes.add("Carol");
		nomes.add("Ana");
		nomes.add("Carol");
		nomes.remove("Ellen");//remove itens da coleção sert
		System.out.println(nomes);
		
		System.out.println(nomes.size());//exibe o tamanho da lista
		
		System.out.println(nomes.contains("Gustavo"));//verifica se existe esse item na lista
		
		System.out.println(nomes.hashCode());//exibe o hashcode do objeto nomes
		
		//foreach envia para a variavel festa os itens da coleção nomes
		for(String festa : nomes) {
			System.out.println(festa);//printando o conteudo que esta dentro da variavel 
		}
	}

}
