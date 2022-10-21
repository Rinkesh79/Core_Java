package Mobiles;

public interface Mobilesmethods {
	
	public void boolenadd(MobilesDTO dto);
	
	public void getAll();
	
	public void getAllByBrandname(String brandName);
	
	public String updateBySerialNo(String serialNo ,int moblieID,String brandName,String mobileNmae,int NoOfCamera,int memory,int price);
	
	public String deletByMobileId(int mobileId);
	
}
