
public class Cliente {
	private String CodiceFiscale;
	private String Nome;
	private String Città;

	public Cliente(String CodiceFiscale,String Nome,String Città){
	this.CodiceFiscale = CodiceFiscale;
	this.Nome = Nome;
	this.Città = Città;
	}
	
	public String getCodiceFiscale(){
	    return CodiceFiscale;	
	}
	
	public String getNome(){
		return Nome;
	}
	
	public String getCittà(){
		return Città;
	}
}
