package jogo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Jogo {

	public void start() {
		
		Set<Player> players = new HashSet<>();

		Scanner in = new Scanner(System.in);

		System.out.println("**************************************");
		System.out.println("           HORA DA BATALHA!           ");
		System.out.println("**************************************");
		System.out.println();
		;
		for (int i = 1; i < 3; i++) {

			System.out.println("**************************************");
			System.out.println("        VAMOS CRIAR O PLAYER " + i + "        ");
			System.out.println("**************************************\n");

			System.out.println("-------------- PLAYER " + i + " --------------");
			System.out.print("QUAL O NOME DO PERSONAGEM? ");
			String nome = in.next();

			System.out.println("\n" + nome.toUpperCase() + ", ESCOLHA SUA CLASSE:\n");
			System.out.println("[1] GUERREIRO");
			System.out.println("[2] SHAOLIN MATADOR DE PORCOS");
			System.out.println("[3] GARRAS-AFIADAS");
			System.out.println("[4] HERCULES");
			System.out.println("[5] AUGUSTO");
			System.out.println("[6] ANDERSON\n");

			int tipo = in.nextInt();

			switch (tipo) {
			case 1:
				Guerreiro g1 = new Guerreiro(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
				g1.apresentar();
				players.add(g1);
				break;
			case 2:
//				Shaolin s1 = new Shaolin(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
//				s1.apresentar();
				break;
			case 3:
				System.out.println("Garras afiadas...");
//				GarrasAfiadas ga1 = new GarrasAfiadas(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
//				ga1.apresentar();
				break;
			case 4:
				System.out.println("Hercules...");
				break;
			case 5:
				System.out.println("Augusto...");
				break;
			case 6:
				System.out.println("Anderson...");
				break;
			default:
				System.out.println("Você não escolheu nenhum desses!");
			}
			System.out.println();	
		}
		in.close();
		
		System.out.println(players.size());
		System.out.println(players);
		
		
	}
}
