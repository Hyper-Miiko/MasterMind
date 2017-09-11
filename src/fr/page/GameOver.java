package fr.page;

import fr.hyper_mïko.default_.*;

public class GameOver {
	boolean win;
	
	public GameOver(boolean w) {
		win = w;
	}
	public void draw() {
		System.out.print("\n\n\n");
		if(win) {
			System.out.println(" ██╗   ██╗ ██████╗ ██╗   ██╗    ██╗    ██╗██╗███╗   ██╗");
			System.out.println(" ╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║    ██║██║████╗  ██║");
			System.out.println("  ╚████╔╝ ██║   ██║██║   ██║    ██║ █╗ ██║██║██╔██╗ ██║");
			System.out.println("   ╚██╔╝  ██║   ██║██║   ██║    ██║███╗██║██║██║╚██╗██║");
			System.out.println("    ██║   ╚██████╔╝╚██████╔╝    ╚███╔███╔╝██║██║ ╚████║");
			System.out.println("    ╚═╝    ╚═════╝  ╚═════╝      ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝");
			System.out.println("\n\n\nVous avez gagné en "+(
					MasterMind.game.essaie-1)+" coups");
		} else {
			System.out.println(" ██╗   ██╗ ██████╗ ██╗   ██╗    ██╗      ██████╗ ███████╗███████╗");
			System.out.println(" ╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║     ██╔═══██╗██╔════╝██╔════╝");
			System.out.println("  ╚████╔╝ ██║   ██║██║   ██║    ██║     ██║   ██║███████╗█████╗  ");
			System.out.println("   ╚██╔╝  ██║   ██║██║   ██║    ██║     ██║   ██║╚════██║██╔══╝  ");
			System.out.println("    ██║   ╚██████╔╝╚██████╔╝    ███████╗╚██████╔╝███████║███████╗");
			System.out.println("    ╚═╝    ╚═════╝  ╚═════╝     ╚══════╝ ╚═════╝ ╚══════╝╚══════╝");
			System.out.println("\n\n\n");
		}
	}
	public void interact() {
		MasterMind.scanner.nextLine();
	}
	public void process() {
		MasterMind.nPage = 1;
	}
}
