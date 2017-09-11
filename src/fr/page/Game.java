package fr.page;
import java.util.Random;
import fr.hyper_mïko.default_.*;

public class Game {
	public byte essaie;
	public byte perfect, present;
	public byte[][] stage;
	public String strEssaie;
	
	public Game() {
		boolean sameColor;
		byte color;
		essaie = 0;
		Random random = new Random();
		stage = new byte[4][11];
		for(byte i = 0; i < 4; i++) {
			do {
				sameColor = false;
				color = (byte) random.nextInt(6);
				for(byte j = 0; j < i; j++) if(color == stage[j][10]) sameColor = true;
			}while(sameColor);
			stage[i][10] = color;
		}
		for(byte i = 0; i < 10; i++) for(byte j = 0; j < 4; j++) stage[j][i] = -1;
	}
	public void interact() {
		System.out.print("0:♠ | 1:♥ | 2:♦ | 3:♣ | 4:● | 5:■\n>");
		strEssaie = MasterMind.scanner.nextLine();
		while(!isValidCombo(strEssaie)) {
			System.out.print("Désolé votre combinaison ne correspond pas à ce que nous attendions\n0:♠ 1:♥ 2:♦ 3:♣ 4:● 5:■\n>");
			strEssaie = MasterMind.scanner.nextLine();
		}
	}
	public void process() {
		if(essaie == 9) {
			MasterMind.nPage = 3;
			MasterMind.gameOver = new GameOver(false);
		}
		stage[0][essaie] = (byte) Character.getNumericValue(strEssaie.charAt(0));
		stage[1][essaie] = (byte) Character.getNumericValue(strEssaie.charAt(1));
		stage[2][essaie] = (byte) Character.getNumericValue(strEssaie.charAt(2));
		stage[3][essaie] = (byte) Character.getNumericValue(strEssaie.charAt(3));
		if(stage[0][essaie] == stage[0][10] && stage[1][essaie] == stage[1][10] && stage[2][essaie] == stage[2][10] && stage[3][essaie] == stage[3][10]) {
			MasterMind.nPage = 3;
			MasterMind.gameOver = new GameOver(true);
		}
		essaie++;
	}
	public void draw() {
		System.out.println("███████████");
		for(byte i = 9; i >= 0; i--) {
			perfect = 0;
			present = 0;
			System.out.print("█ ");
			for(byte j = 0; j < 4; j++) {
				switch(stage[j][i]) {
					case 0: System.out.print("♠ "); break;
					case 1: System.out.print("♥ "); break;
					case 2: System.out.print("♦ "); break;
					case 3: System.out.print("♣ "); break;
					case 4: System.out.print("● "); break;
					case 5: System.out.print("■ "); break;
					default: System.out.print("_ ");
				}
				if(stage[j][i] != -1) {
					if(stage[j][i] == stage [j][10]) perfect++;
					for(byte k = 0; k < 4; k++) if(stage[j][i] == stage [k][10]) present++;
				}
			}
			System.out.print("█");
			if(stage[0][i] != -1)System.out.println(" ☺:"+perfect+" 😐:"+(present-perfect)+" ☹:"+(4-present));
			else System.out.println();
		}
		System.out.println("███████████");
	}
	public boolean isValidCombo(String str) {
		if(str.length() != 4) return false;
		for(byte i = 0; i < 4; i++) if(str.charAt(i) < '0' || str.charAt(i) > '5') return false;
		for(byte i = 0; i < 4; i++) for(byte j = 0; j < i; j++) if(str.charAt(i) == str.charAt(j)) return false;
		return true;
	}
}
