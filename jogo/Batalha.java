package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Batalha {

	public static void main(String[] args) {

		List<Player> players = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		System.out.println("======================================");
		System.out.println("            VAMOS COMEÇAR!            ");
		System.out.println("======================================");
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
			System.out.println("[1] MAGO");
			System.out.println("[2] SHAOLIN");
			System.out.println("[3] GARRAS-AFIADAS");
			System.out.println("[4] GUERREIRO");
			System.out.println("[5] ARQUEIRO");
			System.out.println("[6] CAVALEIRO\n");

			int tipo = in.nextInt();

			switch (tipo) {
			case 1:
				Mago m1 = new Mago(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
				m1.apresentar();
				players.add(m1);
				break;
			case 2:
				Shaolin s1 = new Shaolin(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
				s1.apresentar();
				players.add(s1);
				break;
			case 3:
				GarrasAfiadas ga1 = new GarrasAfiadas(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
				ga1.apresentar();
				players.add(ga1);
				break;
			case 4:
				Guerreiro g1 = new Guerreiro(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
				g1.apresentar();
				players.add(g1);
				break;
			case 5:
				Arqueiro a1 = new Arqueiro(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
				a1.apresentar();
				players.add(a1);
				break;
			case 6:
				Cavaleiro c1 = new Cavaleiro(nome);
				System.out.println("\n---------- PLAYER " + i + " CRIADO -----------");
				c1.apresentar();
				players.add(c1);
				break;
			default:
				System.out.println("Você não escolheu nenhum desses!");
			}
			System.out.println();
		}
//		in.close();

		System.out.println("\n\n");

		Player p1 = players.get(0);
		Player p2 = players.get(1);
		String p1Nome = players.get(0).getNome().toUpperCase();
		String p2Nome = players.get(1).getNome().toUpperCase();

		System.out.println("======================================");
		System.out.println("           HORA DA BATALHA!           ");
		System.out.println("======================================\n");

//		****************************************************************

		for (int i = 0; i <= 100; i++) {

			System.out.println("======================================");
			System.out.println(p1Nome + "\t|  HP: " + p1.getHp() + "\t|  Mana: " + p1.getMana());
			System.out.println(p2Nome + "\t|  HP: " + p2.getHp() + "\t|  Mana: " + p2.getMana());
			System.out.println("======================================\n");

			if (i % 2 == 0) {
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
			} else {
				System.out.println(p2Nome + ", O QUE VOCÊ VAI FAZER? ");
				System.out.println("\n[1] Atacar");
				System.out.println("[2] Usar poder");
				System.out.println("[3] Descansar");

				int resposta = in.nextInt();

				if (resposta < 3) {
					p2.atacar(p1, resposta);
				} else if (resposta == 3) {
					p2.descansar();
				}
			}
			if (p1.isVivo() == false || p2.isVivo() == false) {
				break;
			}
		}


		System.out.println("======================================");
		System.out.println("            FIM DA BATALHA            ");
		System.out.println("======================================\n");
		
		in.close();
	}
}