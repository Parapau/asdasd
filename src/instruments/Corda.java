package instruments;

public class Corda extends Instrument {
	
	public Corda (String name, double price) {
		super (name, price);
	}
	public String getDescription() {
		return "Est� sonant un instrument de corda";
	}

}
