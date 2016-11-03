package pl.parser.nbp;

public class Printer {
	private String currency, dateStart, dateEnd;
	
	public Printer(String currency, String dateStart, String dateEnd) {
		this.currency = currency;	
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}
	
	public void print(){
		System.out.println("printer: " + " " + currency + " " + dateStart +" " + dateEnd);
	}
}
