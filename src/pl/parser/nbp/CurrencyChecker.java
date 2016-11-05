package pl.parser.nbp;

public class CurrencyChecker {
	private String currency, dateStart, dateEnd;
	
	public CurrencyChecker(String[] args) {
		currency = args[0];
		dateStart = args[1];
		dateEnd = args[2];
	}
	
	public void checkCurrency() {
		
		System.out.println("checker: " + currency + " " + dateStart + " " + dateEnd);
		
		Printer printer = new Printer(currency, dateStart, dateEnd);
		printer.print();
		
	}

}
