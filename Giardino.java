import java.util.List;

//INDENTAZIONE

public class Giardino {
	private int codice;
	private Proprietario proprietario;
	private String indirizzo;
	private int dimensione;
	private List<Fiore> v;
	private List<Integer> w;


	public Giardino(int codice, Proprietario proprietario, String indirizzo, int dimensione, List<Fiore> v, List<Integer> w) {
		this.codice = codice;
		this.proprietario = proprietario;
		this.indirizzo = indirizzo;
		this.dimensione = dimensione;
		this.v = v;
		this.w = w;
	}

	// I METODI VANNO SCRITTI CON LA LETTERA MINUSCOLA
	// getCodice non GetCodice, altrimenti getCancer()
	public int getCodice() {
		return codice;

	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public int getDimensione() {
		return dimensione;
	}

	public List<Fiore> getV() {
		return v;
	}

	public List<Integer> getW() {
		return w;
	}



}
