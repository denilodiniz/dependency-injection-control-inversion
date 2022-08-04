package service;

public class TaxArgentinaService implements TaxInterface{
	
	//Retorna o valor do imposto na Agentina que é 10%
	public double getPrice(Double value) {
		return value * 0.10;
	}
	
}
