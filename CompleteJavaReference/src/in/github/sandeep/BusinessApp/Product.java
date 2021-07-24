package in.github.sandeep.BusinessApp;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {

	private String productCode;
	private String description;
	private double price;
	protected static int count = 0;
	
	public Product() {
		productCode = " ";
		description = " ";
		price = 0;
	}
	
	public String getCode() {
		return productCode;
	}
	public void setCode(String productCode) {
		this.productCode = productCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		return currency.format(this.getPrice());
	}
	
	@Override
	public String toString() {
		return "Code        :    " + productCode + "\n" +
			   "Description :    " + description + "\n" +
			   "Price       :    " + this.getFormattedPrice() + "\n";
	}
	
	public static int getCount() {
		return count;
	}

}
