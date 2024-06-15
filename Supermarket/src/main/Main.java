package main;
import java.util.*;
import implementation.SupermarketArray;
public class Main {
	private final static int SIZE = 50;
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	SupermarketArray supermarket = new SupermarketArray(SIZE);
	int opcao;
	
	do {
		System.out.println("\nLista de Compras");
		System.out.println("1 - Inserir item");
		System.out.println("2 - Listar itens");
		System.out.println("3 - Remover item");
		System.out.println("4 - Sair");
		System.out.println("Escolha uma opção: ");
		opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.print("Informe o item a ser inserido: ");
			String item = scanner.next();
			supermarket.add(item);
			break;
		case 2:
			supermarket.print();
			break;
		
		case 3:
			System.out.print("Informe a posição do item a ser removido: ");
			int index = scanner.nextInt();
			supermarket.delete(index);
			break;
		case 4:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção inválida");
			
		}
	}
		while(opcao != 4);
		scanner.close();
	}
	
}
