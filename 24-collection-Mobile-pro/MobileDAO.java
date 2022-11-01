package Mobile;

import java.util.ArrayList;

public class MobileDAO implements Mobilesmethods {


	ArrayList list= new ArrayList();
	
	
	public boolean add(MobileDTO dto)
	{
		list.add(dto);
		System.out.println("added");
		return dto.getMobileNmae() != null; 
	}


	public ArrayList getAll()
	{
		
		
		return list;
		
		
	}

	
	public ArrayList getAllByBrandname(String brandName)
	{
		ArrayList a= new ArrayList<>();
		for (int i = 0; i < list.size(); i++)
		{
			
			MobileDTO dto= (MobileDTO)list.get(i);
			if(dto.getBrandName().equals(brandName))
			{
				
				a.add(dto);
				
			}
		}
		
		
		return a;
		
	}

	
	public String updateBySerialNo(String serialNo, int moblieID, String brandName, String mobileNmae, int NoOfCamera,
			int memory, int price) 
	{
		
		for (int i = 0; i < list.size(); i++) {
			
			MobileDTO dto= (MobileDTO) list.get(i);
			if(dto.getSerialNo().equals(serialNo))
			{
				
				dto.setBrandName(brandName);
				dto.setMoblieID(moblieID);
				dto.setMobileNmae(mobileNmae);
				dto.setNoOfCamera(NoOfCamera);
				dto.setMemory(memory);
				dto.setPrice(price);
				System.out.println("updeted");
			}
			
		}
		
		return null;
	}

	
	public String deletByMobileId(int mobileId)
	{
		for (int i = 0; i < list.size(); i++)
		{
			
			MobileDTO dto= (MobileDTO)list.get(i);
		
			if(dto.getMoblieID()==mobileId)
			{
				list.remove(i);
			
			}
		}
		
		return null;
	}
	
	
	
	
	
	

}
