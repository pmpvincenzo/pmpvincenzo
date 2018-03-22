
public class Cliente {
	private String codiceFiscale;
	private String nome;
	private String citta;

	public Cliente(String codiceFiscale,String nome,String citta){
	this.codiceFiscale = codiceFiscale;
	this.nome = nome;
	this.citta = citta;
	}
	
	public String getCodiceFiscale(){
	    return codiceFiscale;	
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCitta(){
		return citta;
	}
}
