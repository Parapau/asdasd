package instruments;

public class Percussio extends Instrument {
	
	public Percussio (String name, double price) {
		super (name, price);
	}
	public String getDescription() {
		return "Està sonant un instrument de percussió";
	}

}
