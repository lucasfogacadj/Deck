import java.util.ArrayDeque;
import java.util.Scanner;

public class Deck {	
	
	public static void main(String[] args) {
		
	Scanner tc = new Scanner(System.in);

	
	ArrayDeque <Integer> Estrutura = new  ArrayDeque<Integer>();
	
	int opc;
	
	do{
		
		System.out.println("1: Para remover da Remover o ultimo\n2: Para Remover do lado Primeiro\n3: Adicionar no Primeiro\n4: Adicionar no utimo\n5: Mostra o Primeiro\n6: Mostra o Ultimo\n7: Sair");
		opc=tc.nextInt();
		
		switch(opc){
		case 1:{
			if(Estrutura.isEmpty()){
				System.out.println("Lista Vazia");
			}
			else{
			Estrutura.removeLast();
			}
			break;
		}
		
		case 2:{
			if(Estrutura.isEmpty()){
				System.out.println("Lista Vazia");
			}
			else{
			Estrutura.removeFirst();
			}
			break;
		}
		case 3:{
			System.out.println("Informe um Elemento para Adiconar na primeira posição");
			Integer primeiro;
			primeiro=tc.nextInt();
			Estrutura.addFirst(primeiro);
			break;
		}
		case 4:{
			System.out.println("Informe um Elemento para Adiconar na primeira posição");
			Integer ultimo;
			ultimo=tc.nextInt();
			Estrutura.addLast(ultimo);
			break;
		}
		
		case 5:{
			System.out.println(Estrutura.getFirst());
			break;
		}
		case 6:{
			System.out.println(Estrutura.getLast());
			break;
		}
		
		}
		
	}while(opc!=7);
	
	
	}

}
