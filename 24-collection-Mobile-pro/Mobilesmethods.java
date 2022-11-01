package Mobile;

import java.util.ArrayList;

public interface Mobilesmethods  {
	
	public boolean add(MobileDTO dto);
	
	public ArrayList getAll();
	
	public ArrayList getAllByBrandname(String brandName);
	

	public String updateBySerialNo(String serialNo, int moblieID, String brandName, String mobileNmae, int NoOfCamera,
			int memory, int price);
	
	
	
	public String deletByMobileId(int mobileId);
	
	
}
