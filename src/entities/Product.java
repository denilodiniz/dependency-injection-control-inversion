package entities;

import service.ShippingService;
import service.TaxInterface;

public class Product {
	
	private String name;
	private Double value;
	
	
	private ShippingService shippingService;
	private TaxInterface taxInterface;
	
	public Product(String name, Double value, TaxInterface taxInterface) {
		this.name = name;
		this.value = value;
		this.shippingService = new ShippingService();
		this.taxInterface = taxInterface;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double grossValue(String zipCode) {
		return this.value + this.shippingService.getPrice(zipCode) + taxInterface.getPrice(value);
	}
}
