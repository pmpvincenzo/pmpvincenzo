import java.util.ArrayList;
import java.util.List;

public class Vivaio {

	List<Proprietario> listaProprietari = new ArrayList<Proprietario>();
	List<Fiore> listaFiori = new ArrayList<Fiore>();
	List<Giardino> listaGiardini = new ArrayList<Giardino>();
	
	
	public Vivaio(List<Proprietario> listaProprietari, List<Fiore> listaFiori, List<Giardino> listaGiardini) {
		this.listaProprietari = listaProprietari;
		this.listaFiori = listaFiori;
		this.listaGiardini = listaGiardini;
	}
	
	
	public List<Proprietario> getListaProprietari() {
		return listaProprietari;
	}
	public List<Fiore> getListaFiori() {
		return listaFiori;
	}
	public List<Giardino> getListaGiardini() {
		return listaGiardini;
	}
	
	public ArrayList<Proprietario> metodo1(double p1, double p2){
		ArrayList<Proprietario> listaProp = new ArrayList<Proprietario>();
		for(Giardino giard : listaGiardini) {
			boolean tuttiFioriCompresi = true;
			for(Fiore fiore : giard.getV()) {
				if(!(fiore.getCosto() >= p1 && fiore.getCosto() <= p2)) {
					tuttiFioriCompresi = false;
					break;
				}
			}
			if(tuttiFioriCompresi) {
				listaProp.add(giard.GetProprietario());
			}
		}
		return listaProp;
		
	}
}
