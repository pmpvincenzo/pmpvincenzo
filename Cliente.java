
public class Cliente {
	private String CodiceFiscale;
	private String Nome;
	private String Citt�;

	public Cliente(String CodiceFiscale,String Nome,String Citt�){
	this.CodiceFiscale = CodiceFiscale;
	this.Nome = Nome;
	this.Citt� = Citt�;
	}
	
	public String getCodiceFiscale(){
	    return CodiceFiscale;	
	}
	
	public String getNome(){
		return Nome;
	}
	
	public String getCitt�(){
		return Citt�;
	}
}
