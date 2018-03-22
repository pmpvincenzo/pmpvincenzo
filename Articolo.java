
public class Articolo {
	private String codice;
	private String nomeArticolo;
	private float prezzo;
	
	public Articolo(String codice,String nomeArticolo,float prezzo){
		this.codice=codice;
		this.nomeArticolo=nomeArticolo;
		this.prezzo=prezzo;
	}
	
	public String getCodice(){
		return codice;
	}
	
	public String getNomeArticolo(){
		return nomeArticolo;
	}
	
	public float getPrezzo(){
		return prezzo;
	}
	

}
