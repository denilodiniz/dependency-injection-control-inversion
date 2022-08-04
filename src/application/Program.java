package application;

import entities.Product;
import service.TaxArgentinaService;
import service.TaxBrazilService;

public class Program {

	public static void main(String[] args) {
		
		Product prod1 = new Product("Computer", 3000.0, new TaxBrazilService());
		Product prod2 = new Product("Computer", 3000.0, new TaxArgentinaService());
		
		
		System.out.println("Gross Value tax Brazil: " + prod1.grossValue("58706558"));
		System.out.println("Gross Value tax Argentina: " + prod2.grossValue("58706558"));
	}

}
