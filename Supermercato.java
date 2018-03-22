import java.util.ArrayList;
import java.util.List;

public class Supermercato {
//	List<Clienti> listaClienti = new ArrayList<Clienti>();
	/*
	 * Enzo non è che se fai una lista le classi diventano al plurale, la
	 * lista è una lista di oggetti "Cliente" non "Clienti", non è italiano
	 * che stai scrivendo, tra l'altro ti da errore, quindi leggi il perchè ti da errore
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
			/*
			 * Non hai chiaro il concetto del forEach, il ciclo 
			 * funziona che a destra tu metti una lista, a sinistra
			 * è come se creassi un oggetto temporaneo dello stesso tipo della lista
			 * tipo 
			 * for(OggettoX oggetto : listaOggettiTipoX){
			 * }
			 * non puoi dare all'oggetto temporaneo un tipo a cazzo di cane
			 * tipo 
			 * for(OggettoY oggetto :listaOggettiTipoX)
			 * Questo non funzionerebbe
			 */
			//Commentiamo sto forEach tuo
//			for (Data d : a.getData()) {
//				if (a.getData() == d && a.getPrezzo() >= p) {
//					articoliCostosi.addAll(a.getArticoli);
//				}
//			}
			/*
			 * Io non so cosa ci devi fare con la data che c'è dentro acquisto
			 * ma esattamente come sopra, se vai a guardare la classe Articolo
			 * vedrai che data non è una lista di int, ma un singolo int,
			 * quindi ripeto, che stracazzo ti cicli?
			 */
			
		}
		return articoliCostosi;
	}
	
	public List<Cliente> clientiTop(int di,int df){
		ArrayList<Cliente> clientiTop = new ArrayList<Cliente>();
		int contatore= 0;
		//L'oggetto è Cliente, non cliente, se stai programmando con Eclipse
		//vedi che diventa rosso? C'è un motivo
		for (Cliente c: listaClienti){
			/*
			 * Guarda la classe CLiente, esiste un getCliente che ti restituisce un
			 * oggetto Cliente con cui fare l'uguaglianza? Per il momento no, quindi
			 * devi sistemare la classe, anche se il fatto che fai un'uguaglianza
			 * del genere non ha sente, sostanzialmente stai chiedendo se il cliente c è
			 * uguale a se stesso.
			 */
//			if(c.getCliente().eguals(c) && c.getData >=di && c.getData <= df ){
//				contatore += c.getArticoli().getPrezzo()
//			}
		//mi sono bloccato anche qui mannaia la puttana	
		}
		return clientiTop;
	}

}
