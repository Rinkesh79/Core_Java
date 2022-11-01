package GroceryShop;

public class ManufacturercompanyDTO {
	
	private String companyname;
	private AddressDTO add;
	private Long contactNo;
	private String mailId;
	
	
	public ManufacturercompanyDTO() {
		
	}


	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	

	public Long getContactNo() {
		return contactNo;
	}


	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}


	public String getMailId() {
		return mailId;
	}


	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	
	
	public AddressDTO getAdd() {
		return add;
	}


	public void setAdd(AddressDTO add) {
		this.add = add;
	}

	
	
	public String toString() {
		
		return "\ncompanyname-"+companyname +"\ncontactNo-"+ contactNo+"\nmailId-"+mailId+"\n"+add ;
	}
}
