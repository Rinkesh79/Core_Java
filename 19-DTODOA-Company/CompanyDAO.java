package Company;

public class CompanyDAO {
	int i=0;
	AddressDTO []companydetails= new AddressDTO[10];
	
	public void save(AddressDTO company)
	{
		companydetails[i++]=company;
		System.out.println("svaed");

    }
	
	public String seaechbynoOfEmploye(int noOfEmploye)
	{
			int count=0;
			for (int i = 0; i < companydetails.length; i++) 
			{
				if(companydetails[i]!= null && companydetails[i].getNoOfEmploye()>=noOfEmploye)
				{
					System.out.println("Company  found");
					count++; 
				}
			}
			
			if(count==0)
				System.out.println("Company  not Present");
			
			return"Company not present";
	}
	
	public String searchByCountry(String contry)
	{
			int count=0;
			for (int i = 0; i < companydetails.length; i++) 
			{
				if(companydetails[i]!= null && companydetails[i].getContry()==contry)
				{
					System.out.println("Company  found");
					count++; 
				}
			}
			
			if(count==0)
				System.out.println("Company  not Present");
			
			return"Company not present";
	}
	
	public String searchByState(String state)
	{
			int count=0;
			for (int i = 0; i < companydetails.length; i++) 
			{
				if(companydetails[i]!= null && companydetails[i].getState()==state)
				{
					System.out.println("Company  found");
					count++; 
				}
			}
			
			if(count==0)
				System.out.println("Company  not Present");
			
			return"Company not present";
	}
	
	
	public String SearchByzipcode(int zipcode)
	{
			int count=0;
			for (int i = 0; i < companydetails.length; i++) 
			{
				if(companydetails[i]!= null && companydetails[i].getZipcode()==zipcode)
				{
					System.out.println("Company  found");
					count++; 
				}
			}
			
			if(count==0)
				System.out.println("Company  not Present");
			
			return"Company not present";
	}
	
	public String searchBydistrict(String district)
	{
			int count=0;
			for (int i = 0; i < companydetails.length; i++) 
			{
				if(companydetails[i]!= null && companydetails[i].getDistrict()==district)
				{
					System.out.println("Company  found");
					count++; 
				}
			}
			
			if(count==0)
				System.out.println("Company  not Present");
			
			return"Company not present";
	}
	
	public String updateAddressByName(String name , String contry , String state,String district,String city,String area,int zipcode)
	{
		int count=0;
		for (int i = 0; i < companydetails.length; i++)          
		{
			if(companydetails[i]!= null && companydetails[i].getName()==name) 
			{
				companydetails[i].setContry(contry);
				companydetails[i].setState(state);
				companydetails[i].setDistrict(district);
				companydetails[i].setCity(city);
				companydetails[i].setArea(area);
				companydetails[i].setZipcode(zipcode);
				
				System.out.println("Address Updated\n"); 
				count++; 
			}
		}
		
		if(count==0)
			System.out.println("Company  not Present");
		
		return"Company not present";
	}
	
}