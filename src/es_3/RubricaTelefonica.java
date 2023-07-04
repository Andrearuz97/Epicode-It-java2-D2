package es_3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

	private Map<String, String> rubrica;

	public RubricaTelefonica() {
		rubrica = new HashMap<>();
	}

	public void inserisciContatto(String nome, String telefono) {
		rubrica.put(nome, telefono);
	}

	public void cancellaContatto(String nome) {
		rubrica.remove(nome);
	}

	public String cercaNumeroTelefono(String nome) {
		return rubrica.get(nome);
	}

	public String cercaNome(String telefono) {
		for (Map.Entry<String, String> entry : rubrica.entrySet()) {
			if (entry.getValue().equals(telefono)) {
				return entry.getKey();
			}
		}
		return null;
	}

	public void stampaContatti() {
		for (Map.Entry<String, String> entry : rubrica.entrySet()) {
			System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		RubricaTelefonica rubrica = new RubricaTelefonica();

		// Inserimento di contatti
		rubrica.inserisciContatto("Mario Rossi", "3385629752");
		rubrica.inserisciContatto("Gerolamo Bianchi", "3339785632");
		rubrica.inserisciContatto("Giuseppe Verdi", "3405567678");

		// Stampa di tutti i contatti
		rubrica.stampaContatti();

		// Cancellazione di un contatto
		rubrica.cancellaContatto("Luca Bianchi");

		// Ricerca del numero di telefono
		String numeroTelefono = rubrica.cercaNumeroTelefono("Mario Rossi");
		System.out.println("Numero di telefono di Mario Rossi: " + numeroTelefono);

		// Ricerca del nome
		String nome = rubrica.cercaNome("555555555");
		System.out.println("Nome associato al numero 555555555: " + nome);
	}
}
