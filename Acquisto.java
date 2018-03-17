
public class Acquisto {
	private Cliente Cliente;
	private int Data;
	private ArrayList<Articoli> Articoli;
	//mi è venuto un dubbio, visto che negli array<Articoli> sono contenuti gli articoli che richiamiamo
	//nella classe "Articoli" non dovrei faro lo stesso lavoro fatto con "private Cliente Cliente"?
	
	public Acquisto(Cliente Cliente, int Data, ArrayList<Articoli> Articoli){
		this.Cliente=Cliente;
		this.Data=Data;
		this.Articoli=Articoli;
	}
	
	public Cliente getCliente(){
		return Cliente;
	}
	
	public String getData(){
		return Data;
	}
	
	public ArrayList<Articoli> getArticoli(){
		return Articoli;
	}

}
