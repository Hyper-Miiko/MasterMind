package fr.page;
import fr.hyper_mïko.default_.*;

public class Welcome {
	boolean validInput;
	String page;
	
	public Welcome() {
		
	}
	public void interact() {
		do {
			validInput = true;
			System.out.print(">");
			page = MasterMind.scanner.nextLine();;
			switch(page) {
				case "Game": validInput = true; break;
				case "Rules": draw((byte) 1); break;
				case "Exit": MasterMind.exit = true; break;
				default: draw((byte) 2);
			}
			
		}while(!validInput);
	}
	public void process() {
		switch(page) {
			case "Game":
				MasterMind.nPage = 2;
				MasterMind.game = new Game();
				break;
		}
	}
	public void draw() {
		System.out.println();
		System.out.println(" ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ██╗███╗   ██╗    ████████╗██╗  ██╗███████╗");
		System.out.println(" ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ██║████╗  ██║    ╚══██╔══╝██║  ██║██╔════╝");
		System.out.println(" ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗      ██║██╔██╗ ██║       ██║   ███████║█████╗  ");
		System.out.println(" ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝      ██║██║╚██╗██║       ██║   ██╔══██║██╔══╝  ");
		System.out.println(" ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗    ██║██║ ╚████║       ██║   ██║  ██║███████╗");
		System.out.println("  ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝    ╚═╝╚═╝  ╚═══╝       ╚═╝   ╚═╝  ╚═╝╚══════╝");
		System.out.println("        ███╗   ███╗ █████╗ ███████╗████████╗███████╗██████╗     ███╗   ███╗██╗███╗   ██╗██████╗     ██╗");
		System.out.println("        ████╗ ████║██╔══██╗██╔════╝╚══██╔══╝██╔════╝██╔══██╗    ████╗ ████║██║████╗  ██║██╔══██╗    ██║");
		System.out.println("        ██╔████╔██║███████║███████╗   ██║   █████╗  ██████╔╝    ██╔████╔██║██║██╔██╗ ██║██║  ██║    ██║");
		System.out.println("        ██║╚██╔╝██║██╔══██║╚════██║   ██║   ██╔══╝  ██╔══██╗    ██║╚██╔╝██║██║██║╚██╗██║██║  ██║    ╚═╝");
		System.out.println("        ██║ ╚═╝ ██║██║  ██║███████║   ██║   ███████╗██║  ██║    ██║ ╚═╝ ██║██║██║ ╚████║██████╔╝    ██╗");
		System.out.println("        ╚═╝     ╚═╝╚═╝  ╚═╝╚══════╝   ╚═╝   ╚══════╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═════╝     ╚═╝");
		MasterMind.scanner.nextLine();
		System.out.println("\n\n\n\n\n\n\n\n\nEntrez le nom de la page vers la quelle vous voulez aller :");
		System.out.println("• \"Game\" pour jouer.");
		System.out.println("• \"Rules\" pour consulter les régles. (disabled)");
		System.out.println("• \"Exit\" pour arréter de jouer.");
	}
	public void draw(byte errorCode) {
		switch(errorCode) {
		case 1: System.out.println("Nan mais sérieux! Vous n'arrivez pas à voir que c'est écrit D-I-S-A-B-L-E-D"); break;
		case 2: System.out.println("Hein? Quoi? KeskC k'ta marké?");
		}
	}
}
