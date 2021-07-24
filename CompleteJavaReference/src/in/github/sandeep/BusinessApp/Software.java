package in.github.sandeep.BusinessApp;

public class Software extends Product {
	
	private String version;
	
	// constructor
	
	public Software() {
		super();
		setVersion(" ");
		count++;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"version     :    " + version + "\n";
	}
	
	

}
