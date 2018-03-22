import java.util.ArrayList;

public class Acquisto {
	//Le variabili vanno scritte in lettera minuscola : Dario
	private Cliente cliente;
	private int data;//int data???? Una data rappresentata da un intero???
	private ArrayList<Articolo> articolo;
	//mi è venuto un dubbio, visto che negli array<Articolo> sono contenuti gli articoli che richiamiamo
	//nella classe "Articolo" non dovrei faro lo stesso lavoro fatto con "private Cliente Cliente"?
	
	public Acquisto(Cliente cliente, int data, ArrayList<Articolo> articolo){
		this.cliente=cliente;
		this.data=data;
		this.articolo=articolo;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public int getData(){
		return data;
	}
	
	public ArrayList<Articolo> getArticoli(){
		return articolo;
	}

}
