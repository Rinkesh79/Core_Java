package Company;

public class AddressDTO extends CompanyDTO{
	
	private String contry;
	private String state;
	private String district;
	private String city;
	private String area;
	private int zipcode;
	
	
	public AddressDTO() {
		System.out.println("AddressDTO const");
	}
	
	public String getContry() {
		return contry;
	}
	
	public String getState() {
		return state;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getArea() {
		return area;
	}
	
	public int getZipcode() {
		return zipcode;
	}
	
	public void setContry(String contry) {
		this.contry = contry;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
