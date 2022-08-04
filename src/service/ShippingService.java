package service;

public class ShippingService {
	
	public double getPrice(String zipCode) {
		String normalizedZipCode = zipCode.replace("-", "");
		if (normalizedZipCode.equals("58706558")) {
			return 20;
		}
		else if (normalizedZipCode.equals("58600000")) {
			return 30;
		}
		else {
			return 0;
		}
	}

}
