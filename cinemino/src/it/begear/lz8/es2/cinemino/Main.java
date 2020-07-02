package it.begear.lz8.es2.cinemino;

//ESERCIZIO 2 - Gestire la biglietteria di un cinema. Generare un numero casuale di biglietti disponibili. Creare un numero casuale di spettatori e determinare un
//ordine di arrivo (eseguire una serie di operazioni che ognuno degli spettatori acquisti un biglietti finchè disponibili | contesto di Queue).
//Assegnare ogni biglietto a ogni spettatore, in ordine di arrivo, fino a quando ci sono biglietti disponibili. Gli spettatori con biglietto vanno messi nel cinema,
//gli altri fuori.

import java.util.*;

public class Main {

	public static void main(String[] args) {

		double rand1 = (int) (Math.random()*10)+1;
		double rand2 = (int) (Math.random()*10)+1;

		List<Spettatore> spettatori = new LinkedList<Spettatore>(); 
		for (int i = 0; i < rand1; i++) {
			Spettatore p2 = new Spettatore("spettatore" + (i+1));
			spettatori.add(i, p2);
		}					// creo e metto in coda spettatori

		List<Biglietto> biglietti = new ArrayList<Biglietto>();
		for (int i = 0; i < rand2; i++) {
			Biglietto c1 = new Biglietto("biglietto" + (i+1));
			biglietti.add(i, c1);
		}					//creo e mando al botteghino biglietti

		System.out.println("Spettatori in coda al cine: " + spettatori);
		System.out.println("Sono " + spettatori.size() + " persone!");
		System.out.println("Biglietti disponibili stasera: " + biglietti.size());  //la maschera controlla spettatori e biglietti


		Map<Spettatore, Biglietto> cinema = new LinkedHashMap<Spettatore, Biglietto>(); //se tolgo Linked non li ordina
		try {
			for (int i = 0; i < biglietti.size(); i++) {
				cinema.put(spettatori.get(i), biglietti.get(i));  
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Ci sono più biglietti che spettatori! MANCATO INCASSO!!!");
		}										//gli spettatori acquistano i biglietti
		
		System.out.println("Fortunati presenti in sala: " + cinema); //Spettacolo iniziato
		
		
		if (biglietti.size() < spettatori.size()) {
			List<Spettatore> fuori = new ArrayList<Spettatore>();
			for (int i = biglietti.size(); i < spettatori.size(); i++) {
				int a = 0;
				fuori.add(a, spettatori.get(i));
			}
			System.out.println("All'esterno ci sono: " + fuori);
		}						//gli spettatori in esubero si disperdono
		

	}
}
