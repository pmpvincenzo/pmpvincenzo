//Prima cosa: Indentazione, porco giuda CTRL+SHIFT+F devi consumarli


public class Fiori {
//	Queste sono variabili di classe, sono quindi utilizzabili all'interno
//	della classe stessa e non all'esterno
	private String nome;
	private float costo;

	public Fiori(String nome, float costo) {
		//Questo � un costruttore
		this.nome = nome;
//Con questa riga tu assegni alla singola variabile di classe un valore
//che dai in pasto come parametro, vedi nella firma?float costo, quello
//� il parametro, quindi tu gli stai dicendo:
//this(cio� questa variabile per questo oggetto che sto creando) avr�
//il valore di costo che sto passando come parametro, te ne rendi conto perch�
//sono colorati uguali per aiutarti, in blu le variabili globali, in marroncino
//i parametri
		this.costo = costo;
	}
	
	public String getNome() {
		return nome;
	}

	public float getCosto() {
		return costo;
	}
}