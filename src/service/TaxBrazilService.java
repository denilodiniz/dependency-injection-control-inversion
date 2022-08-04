package service;

public class TaxBrazilService implements TaxInterface{
	
	//Retorna o valor do imposto no Brasil que é 20%
	public double getPrice(Double value) {
		return value * 0.20;
	}
	
}
