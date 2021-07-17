package in.github.sandeep.productApp;

public class ProductDB {
	
	public static Product getProduct(String productCode) {
		
		Product p = new Product();
		
		p.setProductCode(productCode);
		
		if(productCode.equalsIgnoreCase("java")) {
			p.setDescription("Murach's Java Programming");
			p.setPrice(49.50);
		}else if(productCode.equalsIgnoreCase("jsps")) {
			p.setDescription("Murach's Java Servlets and JSP");
			p.setPrice(59.50);
		}else if(productCode.equalsIgnoreCase("mcb2")) {
			p.setDescription("Murach's COBOL programming");
			p.setPrice(59.50);
		}else {
			p.setDescription("Unkown");
		}
		return p;
	}

}
