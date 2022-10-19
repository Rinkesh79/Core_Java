package Company;

public class CompanyDTO {
	
	private String name;  
	private String type;
	private int noOfEmploye;
	//private AddressDTO address;
	
	public CompanyDTO() 
	{
		System.out.println("companyDTO const");
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getNoOfEmploye() {
		return noOfEmploye;
	}
	
	//public AddressDTO getAddress() {
	//	return address;
	//}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setNoOfEmploye(int noOfEmploye) {
		this.noOfEmploye = noOfEmploye;
	}
	
	//public void setAddress(AddressDTO address) {
	//	this.address = address;
	//}
	
}
