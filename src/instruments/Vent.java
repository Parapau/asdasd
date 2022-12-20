package instruments;

public class Vent extends Instrument {
	
	public Vent (String name, double price) {
		super (name, price);
	}
	
	public String getDescription() {
		return "Està sonant un instrument de vent";
	}

}
