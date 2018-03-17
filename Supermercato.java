import java.util.ArrayList;
import java.util.List;

public class Supermercato {
	List<Clienti> listaClienti = new ArrayList<Clienti>();
	List<Articoli> listaArticoli = new ArrayList<Articoli>();
	List<Acquisti> listaAcquisti = new ArrayList<Acquisti>();

	public Supermercato(List<clienti> listaClienti, List<Articoli> listaArticoli, List<Acquisti> listaAcquisti) {
		this.listaClienti = listaClienti;
		this.listaArticoli = listaArticoli;
		this.listaAcquisti = listaAcquisti;

	}

	public List<Clienti> getlistaClienti() {
		return listaClienti;
	}

	public List<Articoli> getlistaArticoli() {
		return listaArticoli;

	}

	public List<Acquisti> getlistaAcquisti() {
		return listaAcquisti;
	}

	public List<String> articoliCittŕ(String s) {
		ArrayList<String> articoliCittŕ = new ArrayList<String>();
		for (Acquisti a : listaAcquisti) {
			for (Cliente c : a.getCliente()) {
				if (c.getCittŕ().equals(s)) {
                //mi sono bloccato
				}
			}
		}
		return articoliCittŕ;
	}

	public List<Articolo> articoliCostosi(int d, double p) {
		ArrayList<Articolo> articoliCostosi = new ArrayList<articolo>();
		for (Acquisti a : listaAcquisti) {
			for (Data d : a.getData()) {
				if (a.getData() == d && a.getPrezzo() >= p) {
					articoliCostosi.addAll(a.getArticoli);
				}
			}
		}
		return articoliCostosi;
	}
	
	public List<Cliente> clientiTop(int di,int df){
		ArrayList<Cliente> clientiTop = new ArrayList<Cliente>();
		int contatore= 0;
		for (cliente c: listaClienti){
			if(c.getCliente().eguals(c) && c.getData >=di && c.getData <= df ){
				contatore += c.getArticoli().getPrezzo()
			}
		//mi sono bloccato anche qui mannaia la puttana	
		}
	}

}
