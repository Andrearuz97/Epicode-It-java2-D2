package es_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<Integer> numeriCasuali = generaNumeriCasuali(10);
		System.out.println("Numeri casuali: " + numeriCasuali);

		List<Integer> nuovaLista = creaNuovaLista(numeriCasuali);
		System.out.println("Nuova lista: " + nuovaLista);

		System.out.println("Numeri in posizioni pari:");
		stampaNumeriPariDispari(numeriCasuali, true);

		System.out.println("Numeri in posizioni dispari:");
		stampaNumeriPariDispari(numeriCasuali, false);
	}

	public static List<Integer> generaNumeriCasuali(int n) {
		List<Integer> numeriCasuali = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			int numero = random.nextInt(101);
			numeriCasuali.add(numero);
		}

		return numeriCasuali;
	}

	public static List<Integer> creaNuovaLista(List<Integer> listaOriginale) {
		List<Integer> nuovaLista = new ArrayList<>(listaOriginale);
		List<Integer> listaInversa = new ArrayList<>(listaOriginale);
		listaInversa.sort((a, b) -> b - a);
		nuovaLista.addAll(listaInversa);
		return nuovaLista;
	}

	public static void stampaNumeriPariDispari(List<Integer> lista, boolean pari) {
		for (int i = 0; i < lista.size(); i++) {
			if (pari && i % 2 == 0) {
				System.out.println(lista.get(i));
			} else if (!pari && i % 2 != 0) {
				System.out.println(lista.get(i));
			}
		}
	}
}
