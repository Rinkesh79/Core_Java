package GroceryShop;

public class AddressDTO {

	private String buildingNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private int zipCoad;
	
	
	
	
	public AddressDTO()
	{
		
	}




	public String getBuildingNo() {
		return buildingNo;
	}




	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}




	public String getArea() {
		return area;
	}




	public void setArea(String area) {
		this.area = area;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public int getZipCoad() {
		return zipCoad;
	}




	public void setZipCoad(int zipCoad) {
		this.zipCoad = zipCoad;
	}
	
	public String toString() {
		
		return "\nAdress\nbuildingNo-"+ buildingNo +"\narea-"+ area +"\ncity-"+ city +"\nstate-"+ state +"\ncountry-"+ country +"\nzipCoad-"+ zipCoad+"\n" ;
	}
	
	
	
}
