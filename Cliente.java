
public class Cliente {
	private String CodiceFiscale;
	private String Nome;
	private String Citta;

	public Cliente(String CodiceFiscale,String Nome,String Citta){
	this.CodiceFiscale = CodiceFiscale;
	this.Nome = Nome;
	this.Citta = Citta;
	}
	
	public String getCodiceFiscale(){
	    return CodiceFiscale;	
	}
	
	public String getNome(){
		return Nome;
	}
	
	public String getCitta(){
		return Citta;
	}
}
