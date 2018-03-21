package concessionaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import IO.IO;

public class Concessionaria 
{	private ArrayList<Automobile> magazzino;

	public Concessionaria() 
	{	magazzino = new ArrayList<Automobile>();
	}
	
	public void aggiungiAuto(Automobile a) 
	{	if(!magazzino.contains(a))
			magazzino.add(a);
	}
	
	public void eliminaAuto(Automobile a) 
	{	magazzino.remove(a);
	}
	
	public void stampaAutoMagazzino() 
	{	for(Automobile a : magazzino)
			IO.println(a);
	}
	
	public double sommaPrezziAuto()
	{	double somma = 0;
		for(Automobile a : magazzino)
			somma+=a.getPrezzo();
		return somma;
	}
	
	public String marcaPiuRicorrente() 
	{	HashMap<String, Integer> marcaOccorrenze = new HashMap<String, Integer>();
		for(Automobile a : magazzino) {
			String marca=a.getCasaProduttrice();
			if (!marcaOccorrenze.containsKey(marca))
				marcaOccorrenze.put(marca, 0);
			int occorrenze = marcaOccorrenze.get(marca);
			marcaOccorrenze.put(marca, occorrenze + 1);
		}
		int maxOccorrenze = 0;
		String marcaPiuRicorrente = "";
		for (String marca:marcaOccorrenze.keySet())
		{	int numeroOccorrenze = marcaOccorrenze.get(marca); 
			if (numeroOccorrenze > maxOccorrenze) 
			{	maxOccorrenze = numeroOccorrenze;
				marcaPiuRicorrente = marca;
			}
		}
		return marcaPiuRicorrente;
	}
	
	public Automobile cilindrataBassa()
	{	Automobile autoCilBassa = null;
		for(Automobile a : magazzino)
			if(a.getPrezzo()<10000)
			{	autoCilBassa = a;
				break;
			}
	
		if(autoCilBassa != null)
		{	int cilBassa=autoCilBassa.getCilindrata();
			for(Automobile a : magazzino)
				if(a.getPrezzo()<10000 && a.getCilindrata() < cilBassa)
				{	autoCilBassa = a;
					cilBassa=a.getCilindrata();
				}
		}
		
		return autoCilBassa;
	}
	
	public Automobile cilindrataAlta()
	{	double mediaPrezzi = mediaPrezzi();
		
		Automobile autoCilAlta = null;
		for(Automobile a : magazzino)
			if(a.getPrezzo()>mediaPrezzi)
			{	autoCilAlta = a;
				break;
			}
		
		if(autoCilAlta!=null)
		{	int cilAlta=autoCilAlta.getCilindrata();
			for(Automobile a : magazzino)
				if(a.getPrezzo()>mediaPrezzi && a.getCilindrata() > cilAlta)
				{	autoCilAlta = a;
					cilAlta=a.getCilindrata();
				}
		}
		
		return autoCilAlta;
	}
	
	private double mediaPrezzi() 
	{	return sommaPrezziAuto()/magazzino.size();
	}

	public ArrayList<String> marcheEconomiche() 
	{	ArrayList<String> listaMarcheEconomiche = new ArrayList<String>();
		double mediaPrezzi = mediaPrezzi();
		
		HashSet<String> marche = new HashSet<>();
		for(Automobile a : magazzino) 
			marche.add(a.getCasaProduttrice());
		
		for(String marca:marche)
		{	boolean marcaEconomica = true;
			for(Automobile a : magazzino) 
				if(a.getCasaProduttrice().equals(marca) && a.getPrezzo() >= mediaPrezzi)
				{	marcaEconomica = false;
					break;
				}
			if(marcaEconomica)
				listaMarcheEconomiche.add(marca);	
		}
		
		return listaMarcheEconomiche;
	}
	
	public ArrayList<String> marcheStessaCilindrata()
	{	ArrayList<String> listaMarcheMonoCilindrata = new ArrayList<>();
		
		HashMap<String, HashSet<Integer>> marcaCilindrate = new HashMap<String, HashSet<Integer>>();
		for(Automobile a : magazzino) 
		{	HashSet<Integer> cilindrate = marcaCilindrate.get(a.getCasaProduttrice());
			if(cilindrate == null) 
			{	cilindrate = new HashSet<Integer>();
				marcaCilindrate.put(a.getCasaProduttrice(), cilindrate);
			}
			cilindrate.add(a.getCilindrata());
		}
		
		for (String marca:marcaCilindrate.keySet()) 
			if (marcaCilindrate.get(marca).size() == 1) 
				listaMarcheMonoCilindrata.add(marca);
		
		return listaMarcheMonoCilindrata;
	}
	
	public static Concessionaria carica(String nomeFile)
	{	Concessionaria c = new Concessionaria();
		try 
        {	BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeFile));
        	String linea = bufferedReader.readLine();
        	while(linea != null) 
        	{	IO.println(linea);
        		String[] datiAuto = linea.split(",");
        		String casaProduttrice = datiAuto[0];
        		String modello = datiAuto[1];
        		String colore = datiAuto[2];
        		double prezzo = Double.parseDouble(datiAuto[3]);
        		String numTelaio = datiAuto[4];
        		int cilindrata = Integer.parseInt(datiAuto[5]);
        		Automobile a = new Automobile(modello, colore, casaProduttrice, prezzo, numTelaio, cilindrata);
        		c.aggiungiAuto(a);
        		linea = bufferedReader.readLine();
            }   
        	bufferedReader.close();         
        }
        catch(IOException e) 
        {	IO.println(e);
        	System.exit(0);
        }
		return c;
	}
	
	public void salva(String nomeFile)
	{	try 
		{	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeFile));
			for(Automobile a : magazzino) 
			{	String s =	a.getCasaProduttrice()+","+a.getModello()+","+
							a.getColore()+","+a.getPrezzo()+","+
							a.getNumTelaio()+","+a.getCilindrata();
				bufferedWriter.write(s);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
		}
    	catch(IOException e) 
    	{	IO.println(e);
    		System.exit(0);
    	}
	}
}
