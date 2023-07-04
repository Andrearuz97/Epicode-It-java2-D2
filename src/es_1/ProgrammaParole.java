package es_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgrammaParole {

	public static void main(String[] args) {
		ProgrammaParole programma = new ProgrammaParole();
		programma.avvia();
	}

	public void avvia() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci il numero di elementi da inserire: ");
		int n = scanner.nextInt();
		scanner.nextLine(); // Consuma il carattere di nuova linea dopo il numero

		Set<String> parole = new HashSet<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Inserisci una parola: ");
			String parola = scanner.nextLine();
			parole.add(parola);
		}
		scanner.close();
		ElencoParole elencoParole = new ElencoParole(parole);
		elencoParole.stampaParole();
		elencoParole.stampaNumeroParoleDistinte();
		elencoParole.stampaParoleDistinte();
	}
}
