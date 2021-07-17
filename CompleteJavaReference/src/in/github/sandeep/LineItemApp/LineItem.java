/**
 * 
 */
package in.github.sandeep.LineItemApp;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Sandeep Prajapati
 *
 */
public class LineItem {
	
	private Product product;
	private int quantity;
	private double total;
	
	public LineItem() {
		this.product = new Product();
		this.quantity = 0;
		this.total = 0.0;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double getTotal() {
		this.CalucateTotal();
		return total;
	}
	
	private void CalucateTotal() {
		this.total = quantity * product.getPrice(); 
	}
	
	public String getFormattedTotal() {
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		return currency.format(this.getTotal());
	}
	

}
