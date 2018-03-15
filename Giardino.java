//INDENTAZIONE

public class Giardino {
	private int codice;
	private String proprietario;
	private String indirizzo;
	private int dimensione;
	private char v;
	private char w;

	public Giardino(int codice, String proprietario, String indirizzo, int dimensione, char v, char w) {
		this.codice = codice;
		this.proprietario = proprietario;
		this.indirizzo = indirizzo;
		this.dimensione = dimensione;
		this.v = v;
		this.w = w;
	}

	// I METODI VANNO SCRITTI CON LA LETTERA MINUSCOLA
	// getCodice non GetCodice, altrimenti getCancer()
	public int GetCodice() {
		return codice;

	}

	public String GetProprietario() {
		return proprietario;
	}

	public String GetIndirizzo() {
		return indirizzo;
	}

	public int GetDimensione() {
		return dimensione;
	}

	public char Getv() {
		return v;
	}

	public char getw() {
		return w;
	}

}
