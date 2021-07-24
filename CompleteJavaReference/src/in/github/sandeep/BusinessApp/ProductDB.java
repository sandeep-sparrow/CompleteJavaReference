package in.github.sandeep.BusinessApp;

public class ProductDB {


		public static Product getProduct(String productCode) {
			
			Product p = null;
			
			if(productCode.equalsIgnoreCase("Java") ||
			   productCode.equalsIgnoreCase("Jsps") ||
			   productCode.equalsIgnoreCase("mcb2")) {
				
				Book b = new Book();
				
				if(productCode.equalsIgnoreCase("java")) {
					b.setCode("Java");
					b.setDescription("Murach's Java Programming");
					b.setPrice(49.50);
					b.setAuthor("SteelMan");
				}else if(productCode.equalsIgnoreCase("jsps")) {
					b.setCode("Jsps");
					b.setDescription("Murach's Java Servlets and JSP");
					b.setPrice(59.50);
					b.setAuthor("Murach's");
				}else if(productCode.equalsIgnoreCase("mcb2")) {
					b.setCode("Mcb2");
					b.setDescription("Murach's COBOL programming");
					b.setPrice(59.50);
					b.setAuthor("COBOL");
				}else {
					b.setDescription("Unkown");
				}
				p = b;
				
			}else if (productCode.equalsIgnoreCase("txtp")) {
				
				Software s = new Software();
				
				if (productCode.equalsIgnoreCase("txtp")){
					s.setCode("Txtp");
					s.setDescription("Text Pad");
					s.setPrice(20.00);
					s.setVersion("12.1.21");
				}else {
					s.setDescription("Unkown");
				}
				p = s;
			}
			
			return p;
			
		}
}
