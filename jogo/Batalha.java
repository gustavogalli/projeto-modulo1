package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Batalha {

	public static void main(String[] args) {

		List<Player> players = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		System.out.println("**************************************");
		System.out.println("            VAMOS COMEÇAR!            ");
		System.out.println("**************************************");
		System.out.println();
		;
		for (int i = 1; i < 3; i++) {

//			System.out.println("\n**************************************");
			System.out.println("\n        VAMOS CRIAR O PLAYER " + i + "        ");
//			System.out.println("**************************************\n");

			System.out.println("\n\n------------- PLAYER " + i + " --------------");
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
//		in.close();

		System.out.println("\n\n\n");

		Player p1 = players.get(0);
		Player p2 = players.get(1);
		String p1Nome = players.get(0).getNome().toUpperCase();
		String p2Nome = players.get(1).getNome().toUpperCase();

		System.out.println("**************************************");
		System.out.println("           HORA DA BATALHA!           ");
		System.out.println("**************************************\n");

//		****************************************************************

		while (p1.isVivo() && p2.isVivo()) {

			System.out.println("**************************************");
			System.out.println(p1Nome + "\t  |  HP: " + p1.getHp() + "  |  Mana: " + p1.getMana());
			System.out.println(p2Nome + "\t  |  HP: " + p2.getHp() + "  |  Mana: " + p2.getMana());
			System.out.println("**************************************\n");

			System.out.println(p1Nome + ", O QUE VOCÊ VAI FAZER? ");
			System.out.println("\n[1] Atacar");
			System.out.println("[2] Usar poder");
			System.out.println("[3] Descansar");

			int resposta = in.nextInt();

			if (resposta < 3) {
				p1.atacar(p2, resposta);
			} else if (resposta == 3) {
				p1.descansar();
				
			}
		}

		System.out.println("**************************************");
		System.out.println("            FIM DA BATALHA            ");
		System.out.println("**************************************\n");

	}
}