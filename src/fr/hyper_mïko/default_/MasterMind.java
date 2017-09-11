package fr.hyper_mïko.default_;

import java.util.Scanner;
import fr.page.*;

public class MasterMind {
	public static boolean exit;
	public static byte nPage;

	public static Scanner scanner;
	public static Welcome welcome;
	public static Game game;
	public static GameOver gameOver;

	public static void main(String[] args) {
		setup();
		do {
			draw();
		}while(!exit);
	}
	public static void setup() {
		exit = false;
		nPage = 1;
		
		scanner = new Scanner(System.in);
		welcome = new Welcome();
	}
	public static void draw() {
		switch(nPage) {
			case 1:
				welcome.draw();
				welcome.interact();
				welcome.process();
				break;
			case 2:
				game.draw();
				game.interact();
				game.process();
				break;
			case 3:
				gameOver.draw();
				gameOver.interact();
				gameOver.process();
				break;
		}
	}
}
