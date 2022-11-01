package GroceryShop;

public class ProductDTO {

	private String nameOfProduct;
	private Double mRPrice;
	private Long bracodeNumber;
	private Boolean isVag;
	private String manufacturingDate;
	private String expiryDate;
	private int quantity;
	
	private ManufacturercompanyDTO mDTO;
	
	
	
	public ProductDTO()
	{
		
		
	}
	

	public String getNameOfProduct() {
		return nameOfProduct;
	}



	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}



	public Double getmRPrice() {
		return mRPrice;
	}



	public void setmRPrice(Double mRPrice) {
		this.mRPrice = mRPrice;
	}



	public Long getBracodeNumber() {
		return bracodeNumber;
	}



	public void setBracodeNumber(Long bracodeNumber) {
		this.bracodeNumber = bracodeNumber;
	}


	public Boolean getIsVag() {
		return isVag;
	}



	public void setIsVag(Boolean isVag) {
		this.isVag = isVag;
	}



	public String getManufacturingDate() {
		return manufacturingDate;
	}



	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}



	public String getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	public ManufacturercompanyDTO getManufacturercompany() {
		return mDTO;
	}



	public void setManufacturercompany(ManufacturercompanyDTO mDTO) {
		this.mDTO = mDTO;
	}
	
	
	
	public String toString()
	{
		return "\nnameOfProduct-"+nameOfProduct +"\nmRPrice-"+mRPrice+"\nbracodeNumber-"+bracodeNumber+"\nisVag-"+isVag+"\nmanufacturingDate-"+manufacturingDate+"\nexpiryDate-"+expiryDate+"\nquantity-"+quantity+"\n"+ mDTO;
	}
	
	
}
