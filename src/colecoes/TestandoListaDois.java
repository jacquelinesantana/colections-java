package colecoes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestandoListaDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		//nomes = "Maria";
		
		//lista [ ] [ ] [ Ericles ]
		nomes.add("Maria");//indice 0
		nomes.add("Eliana");//indice 1
		
		//for( inicio; condição; contador)
		//for( var : lista) joga dentro da variavel o objeto lista enquanto houver itens na lista
		
		for(String memes : nomes) {
			System.out.println(memes + " é uma pessoa participante da jornada da Generation");
		}
		
		//Iterator é uma classe com métodos que nos permite ver se a lista ainda tem itens e passar para o proximo item da lista
		System.out.println("*********************** saido usando o iterator **************************");
		Iterator <String> iNomes = nomes.iterator();
		
		//hasnext - tem um proximo item na lista? caso sim retorna true
		while(iNomes.hasNext()) {
			
			//next empurra para o proximo item da lista apos exibir o nome atual
			System.out.println(iNomes.next());
		}
	}

}
