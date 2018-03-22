
public class Articolo {
	private String Codice;
	private String NomeArticolo;
	private float Prezzo;
	
	public Articolo(String Codice,String NomeArticolo,float Prezzo){
		this.Codice=Codice;
		this.NomeArticolo=NomeArticolo;
		this.Prezzo=Prezzo;
	}
	
	public String getCodice(){
		return Codice;
	}
	
	public String getNomeArticolo(){
		return NomeArticolo;
	}
	
	public float getPrezzo(){
		return Prezzo;
	}
	

}
