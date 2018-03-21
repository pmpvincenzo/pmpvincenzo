package concessionaria;

public class Automobile 
{	private String modello;
	private String colore;
	private String casaProduttrice;
	private double prezzo;
	private String numTelaio;
	private int cilindrata;
	
	public Automobile(String modello, String colore, String casaProduttrice, double prezzo, String numTelaio, int cilindrata) 
	{	this.modello = modello;
		this.colore = colore;
		this.casaProduttrice = casaProduttrice;
		this.prezzo = prezzo;
		this.numTelaio = numTelaio;
		this.cilindrata = cilindrata;
	}
	
	public String getNumTelaio() 
	{	return numTelaio;
	}
	
	public String getModello() 
	{	return modello;
	}
	
	public String getColore() 
	{	return colore;
	}
	
	public String getCasaProduttrice() 
	{	return casaProduttrice;
	}
	
	public double getPrezzo() 
	{	return prezzo;
	}
	
	public int getCilindrata() 
	{	return cilindrata;
	}
	
	public String toString() 
	{	return  casaProduttrice + " " + modello; 
	}
	
	public int hashCode() 
	{	return numTelaio.hashCode();
	}
	
	public boolean equals(Object obj) 
	{	if (this == obj)
			return true;
		if (! (obj instanceof Automobile))
			return false;
		Automobile a = (Automobile) obj;
		return numTelaio.equals(a.getNumTelaio());
	}
}
