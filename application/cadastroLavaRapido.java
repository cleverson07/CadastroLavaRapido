package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Carros;

public class cadastroLavaRapido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Criando um HashMap para armazenar os carros
		Map<String,Carros> Sistema = new HashMap<>(); 
		
		while (true) {
			System.out.println("---- CADASTRO LAVA RAPIDO ----");
			System.out.println();
			System.out.println("Informe o numero da placa do carro:");
			System.out.println("ou digite 'sair' para finalizar:");
			String placa= sc.next();
			
			if(placa.equalsIgnoreCase("sair")){
				System.out.println("Finalizado");
				break;
			}
			
			
			
			// Verifica se a placa está no banco de dadoS (Sistema)
			if( Sistema.containsKey(placa)) {
				System.out.println("Dados do carro:");
			// Obtendo o carro pelo número de placa
				System.out.println(Sistema.get(placa));
				System.out.println();
				break;
				
			}else {
				System.out.println("---- Cadastro não encontrado ----");
				System.out.println();
				System.out.println("---- NOVO CADASTRO ----");
				System.out.println();
				System.out.println("Nome do Proprietário:");
				String name = sc.next();
				System.out.print("Modelo do Carro:");
				String modelo = sc.next();
				System.out.print("Ano do carro:");
				Integer ano = sc.nextInt();
				
				// Adiciona a placa e a instância do carro ao banco de dados (Sistema)
				Carros carro1 = new Carros(name, modelo, ano);
				Sistema.put(placa, carro1);
				System.out.println("-CADASTRADO COM SUCESSO!!");
				System.out.println();
				System.out.println();
			}
			
		}
		
		
		
		
		
		
	}

}
