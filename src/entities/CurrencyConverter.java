package entities;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double dollarConversion(double quotation, double dollar) {
		double conversionSimple, conversionPlusTax, tax;
		
		conversionSimple = quotation * dollar;
		tax = conversionSimple * IOF;
		conversionPlusTax = conversionSimple + tax;
		
		return conversionPlusTax;
	}
}
