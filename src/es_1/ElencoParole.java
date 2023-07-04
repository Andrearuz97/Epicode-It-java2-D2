package es_1;

import java.util.Set;

public class ElencoParole {

	private Set<String> parole;

	public ElencoParole(Set<String> parole) {
		this.parole = parole;
	}

	public void stampaParole() {
		System.out.println("Elenco delle parole inserite:");
		for (String parola : parole) {
			System.out.println(parola);
		}
	}

	public void stampaNumeroParoleDistinte() {
		System.out.println("Numero di parole distinte: " + parole.size());
	}

	public void stampaParoleDistinte() {
		System.out.println("Elenco delle parole distinte:");
		for (String parola : parole) {
			System.out.println(parola);
		}
	}
}
