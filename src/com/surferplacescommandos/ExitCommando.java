package com.surferplacescommandos;

import java.util.Scanner;
	
	public class ExitCommando extends Commando {

		public void execute(String input, Scanner scanner) {
			if ("exit".equalsIgnoreCase(input)) {
				System.out.println("Good bye!");
				scanner.close();
				System.exit(0);			//kein Fehler
			}
		}
		
	


}
