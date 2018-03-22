import java.util.ArrayList;
import java.util.List;

public class Supermercato {
	// List<Clienti> listaClienti = new ArrayList<Clienti>();
	/*
	 * Enzo non è che se fai una lista le classi diventano al plurale, la lista
	 * è una lista di oggetti "Cliente" non "Clienti", non è italiano che stai
	 * scrivendo, tra l'altro ti da errore, quindi leggi il perchè ti da errore
	 */

	List<Cliente> listaClienti = new ArrayList<Cliente>();
	List<Articolo> listaArticoli = new ArrayList<Articolo>();
	List<Acquisto> listaAcquisti = new ArrayList<Acquisto>();

	public Supermercato(List<Cliente> listaClienti, List<Articolo> listaArticoli, List<Acquisto> listaAcquisti) {
		this.listaClienti = listaClienti;
		this.listaArticoli = listaArticoli;
		this.listaAcquisti = listaAcquisti;

	}

	public List<Cliente> getlistaClienti() {
		return listaClienti;
	}

	public List<Articolo> getlistaArticoli() {
		return listaArticoli;

	}

	public List<Acquisto> getlistaAcquisti() {
		return listaAcquisti;
	}

	public List<String> articoliCitta(String s) {
		ArrayList<String> articoliCitta = new ArrayList<String>();
		for (Acquisto a : listaAcquisti) {
			if (a.getCliente().getCitta().equals(s)) {
				if (articoliCitta.isEmpty()){
					articoliCitta.add(a.getArticoli().getNome());
					//non riesco a sistemare queste 2, ho provato come hai detto tu a creare una
					//nuova variabile e successivamente fare add array ma non worka
				}
				for (Articolo ar: a.getArticoli()){
					if (articoliCitta.contains(ar)){
						articoliCitta.add(ar);
					}	
				}
			}
			
			/*
			 * E' normale che ti blocchi, vai a guardare la classe Acquisto,
			 * cosa ti restituisce quel getCliente()? Un oggetto di tipo cliente,
			 * non una lista, quindi che cazzo ti cicli? Le patate? getCliente
			 * ti restituisce un oggetto solo, non una lista.
			 */
			//Commentiamo sto ciclo e prima di scommentarlo e sistemarlo, sistema le classi
			//in modo che il ciclo stesso abbia un senso
//			for (Cliente c : a.getCliente()) {
//				if (c.getCittÅ•().equals(s)) {
//                //mi sono bloccato
//				}
//			}
		}
		return articoliCitta;
	}

	public List<Articolo> articoliCostosi(int d, double p) {
		ArrayList<Articolo> articoliCostosi = new ArrayList<Articolo>();
		for (Acquisto a : listaAcquisti) {
			if (a.getData()==d ) {
				for (Articolo art: a.getArticoli()){
					if (art.getPrezzo()>=p){
						articoliCostosi.add(art);
					}
				}
			}	
		}
		return articoliCostosi;
	}
	
	private Cliente Elemento(){
		for (Cliente c: listaClienti){
			return c;
		}
		return null;	
	}   
	
	

	public List<Cliente> clientiTop(int di, int df) {
		ArrayList<Cliente> clientiTop = new ArrayList<Cliente>();
		float contatore = 0;
		for (Acquisto a : listaAcquisti) {
			if (a.getCliente().equals(Elemento()) && a.getData()>=di && a.getData()<=df){
				contatore+= a.getArticoli().getPrezzo();
				clientiTop.add(contatore,getCliente());
				//volevo provare ad inserire volta per volta il costo totale degli oggetti
				//e l utente che veniva assegnato quel costo nell'array clientiTop. Cosa sbaglio?
			}
			
			
		}
		return clientiTop;
	}

}
