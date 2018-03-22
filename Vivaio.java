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

	public ArrayList<Proprietario> metodo1(double p1, double p2) {
		ArrayList<Proprietario> listaProp = new ArrayList<Proprietario>();
		for (Giardino g : listaGiardini) {
			boolean tuttiFioriCompresi = true;
			for (Fiore fiore : g.getV()) {
				if (!(fiore.getCosto() >= p1 && fiore.getCosto() <= p2)) {
					tuttiFioriCompresi = false;
					break;
				}
			}
			if (tuttiFioriCompresi) {
				listaProp.add(g.getProprietario());
			}
		}
		return listaProp;
	}

	public ArrayList<Fiore> metodo2(int d, String c){
		ArrayList<Fiore> listaFiori = new ArrayList<Fiore>();
		for(Giardino g: listaGiardini) {
			//eguals???? EQUALS, NON EGUALS, guardali i metodi, non scrivere a cazzo
			if (g.getDimensione() == d && g.getProprietario().getCitta().equals(c)){
				listaFiori.addAll(g.getV());
			}
		}
		return listaFiori;
	}

	public ArrayList<Giardino> metodo3(){
		//Programma con un IDE come eclipse, altrimenti non ti compilerà mai un cazzo,
		//errori come lenght anziche length non si possono vedere
//    	int numeroFiori = listaFiori.lenght();
    	int numeroFiori = listaFiori.size();
    	ArrayList<Giardino> listaGiardini = new ArrayList<Giardino>();
        for(Giardino g : listaGiardini) {
        	//Quando si tratta di liste non è length, ma è size()
//        	if  (listaGiardini.length() == 3) {
        	if  (listaGiardini.size() == 3) {
        		if (g.getDimensione() == numeroFiori){
    	    	    listaGiardini.add(g);
    	    	    numeroFiori--;
        		}
    	        else{
    	        	numeroFiori--;
    	        }
    	    break;
            }
        }
        //Se ti deve restituire un Arraylist di giardino il ritorno è sbagliato
        //Se ti deve restituire il numero dei fiori, è sbagliata la firma del metodo che deve restituire un intero
        //Ti lascio il ritorno a null, sistema sta cosa e ritorna quello che ti serve
//        return numeroFiori;
        return null;
	}
}
