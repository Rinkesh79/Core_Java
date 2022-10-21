package Mobiles;





public class MobilesDAO {

	private int i=0;
	MobilesDTO []mobilesDTOs= new MobilesDTO[10];
	
	
	public void boolenadd(MobilesDTO dto)
	{
		mobilesDTOs[i++]=dto;
		System.out.println("new mobile data added\n");
	}
	
	public void getAll()
	{
		int counter=0;
		for (int i = 0; i < mobilesDTOs.length; i++) 
		{
			if(mobilesDTOs[i]!=null)
			{
				System.out.println("\n"+mobilesDTOs[i].getMoblieID()+"\n"+mobilesDTOs[i].getBrandName()+"\n"+mobilesDTOs[i].getMobileNmae()+"\n"+mobilesDTOs[i].getSerialNo()+"\n"+mobilesDTOs[i].getNoOfCamera()+"\n"+mobilesDTOs[i].getMemory()+"\n"+mobilesDTOs[i].getPrice());
				counter++;
			}
			
		}
		
		if(counter==0)
			System.out.println( "mobile is  not Present\n");
	}
	
	
	
	
	public void getAllByBrandname(String brandName)
	{
		int counter=0;
		for (int i = 0; i < mobilesDTOs.length; i++) 
		{
			if(mobilesDTOs[i]!=null && mobilesDTOs[i].getBrandName().equals(brandName))
			{
				System.out.println("\n"+mobilesDTOs[i].getMoblieID()+"\n"+mobilesDTOs[i].getBrandName()+"\n"+mobilesDTOs[i].getMobileNmae()+"\n"+mobilesDTOs[i].getSerialNo()+"\n"+mobilesDTOs[i].getNoOfCamera()+"\n"+mobilesDTOs[i].getMemory()+"\n"+mobilesDTOs[i].getPrice());
				counter++;
			}
			
		}
		if(counter==0)
			System.out.println("\n"+brandName+ " mobile is  not Present\n");
	}


	
	public String updateBySerialNo(String serialNo ,int moblieID,String brandName,String mobileNmae,int NoOfCamera,int memory,int price)
	{
		int counter=0;
		for (int i = 0; i < mobilesDTOs.length; i++) 
		{
			if(mobilesDTOs[i]!=null && mobilesDTOs[i].getSerialNo().equals(serialNo))
			{
				mobilesDTOs[i].setMoblieID(moblieID);
				mobilesDTOs[i].setBrandName(brandName);
				mobilesDTOs[i].setMobileNmae(mobileNmae);
				mobilesDTOs[i].setNoOfCamera(NoOfCamera);
				mobilesDTOs[i].setMemory(memory);
				mobilesDTOs[i].setPrice(price);
				System.out.println( "\nmobile Data Updated\n");
				counter++;
			}
		
		}
		
		if(counter==0)
			System.out.println(serialNo+ " mobile is  not Present\n");
		
		return serialNo;
	}
	
	
	public String deletByMobileId(int mobileId)
	{
		int counter=0;
		for (int i = 0; i < mobilesDTOs.length; i++) 
		{
			
			if(mobilesDTOs[i]!=null && mobilesDTOs[i].getMoblieID()==mobileId);
			{
				mobilesDTOs[i]=null;
				
				counter++;
			}
			
		}
		
		if(counter==0)
			System.out.println( mobileId+"  idno mobile is  not Present\n");
		else 
			System.out.println( "mobile Data Deleted\n");
				
		return " mobile is not present";
	}
	
	
	
	
	
}
