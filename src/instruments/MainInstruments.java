package instruments;

public class MainInstruments {

	public static void main(String[] args) {
		/*En un grup de m�sica hi ha diferents tipus d�instruments musicals. Hi ha instruments de vent, de corda i de percussi�.

Tots els instruments tenen com a atributs el seu nom, i el seu preu. A m�s, tenen un m�tode anomenat tocar(). 
Aquest, �s abstracte a la classe instrument i, per tant, s�ha d�implementar a les classes filles. 
Si s�est� tocant un instrument de vent, el m�tode ha de mostrar per consola: "Est� sonant un instrument de vent",
 si s�est� tocant un instrument de corda: �Est� sonant un instrument de corda� 
 i si s�est� tocant un instrument de percussi�: �Est� sonant un instrument de percussi�.


El proc�s de c�rrega d'una classe nom�s t� lloc una vegada. 
Demostra que la c�rrega pot ser provocada per la creaci� de la primera inst�ncia d'aquesta classe o per l'acc�s a un membre est�tic d'aquesta. 

Cerca informaci� sobre els blocs d'inicialitzaci� i blocs est�tics en Java.*/
		Corda x = new Corda("violi", 230);
		System.out.println(x.getDescription());
		Vent y = new Vent("tromb�", 150);
		System.out.println(y.getDescription());
		Percussio z = new Percussio("bateria", 300);
		System.out.println(z.getDescription());
		Corda w = new Corda("viola", 180);
		System.out.println(w.getDescription());
		Percussio e = new Percussio("bateria", 300);
		System.out.println(e.getDescription());
	}
	
	
	
	

}
