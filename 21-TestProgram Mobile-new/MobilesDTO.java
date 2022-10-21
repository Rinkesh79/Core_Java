package Mobiles;

public class MobilesDTO {
	
	
	private int moblieID;
	private String brandName;
	private String mobileNmae;
	private String serialNo;
	private int NoOfCamera;
	private int memory;
	private int price;
	

	public MobilesDTO() {
		//System.out.println("Mobiles dto constr");
	}
	
	public int getMoblieID() {
		return moblieID;
	}
	public void setMoblieID(int moblieID) {
		this.moblieID = moblieID;
	}
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getMobileNmae() {
		return mobileNmae;
	}
	public void setMobileNmae(String mobileNmae) {
		this.mobileNmae = mobileNmae;
	}
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	
	public int getNoOfCamera() {
		return NoOfCamera;
	}
	public void setNoOfCamera(int noOfCamera) {
		NoOfCamera = noOfCamera;
	}
	
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	
	
}
