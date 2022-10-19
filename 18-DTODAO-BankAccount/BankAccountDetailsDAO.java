package com.qac.CoreJava.DTODAO;



public class BankAccountDetailsDAO {
	
	private int i=0;
	private BankAccountDetailsDTO [] detailsDTO = new BankAccountDetailsDTO[10];
	
	public void save(BankAccountDetailsDTO details)
	{
		detailsDTO[i++]=details;
		System.out.println("saved");
	}
	
	public String searchbyaccountno(int accountno)
	{
		int count=0;
		for (int i = 0; i < detailsDTO.length; i++) 
		{
			if(detailsDTO[i]!= null && detailsDTO[i].getAccountno()==accountno)
			{
				System.out.println("account  found");
				count++; 
			}
		}
		
		if(count==0)
			System.out.println("account  not Present");
		
		return"account not present";
	}
	
	public String searchbyname(String name)
	{
		int count=0;
		for (int i = 0; i < detailsDTO.length; i++) 
		{
			if(detailsDTO[i]!= null && detailsDTO[i].getName()==name)
			{
				System.out.println("account found");
				count++; 
			}
		}
		
		if(count==0)
			System.out.println("account  not Present");
		
		return"account not present";
	}
	
	public String searchbyIFSC(String ifsc)
	{
		int count=0;
		for (int i = 0; i < detailsDTO.length; i++) 
		{
			if(detailsDTO[i]!= null && detailsDTO[i].getiFSC()==ifsc)
			{
				System.out.println("account found");
				count++; 
			}
		}
		
		if(count==0)
			System.out.println("account  not Present");
		
		return"account not present";
		
	}
	
	public String deletebyaccountno(int accountno)
	{
		int count=0;
		for (int i = 0; i < detailsDTO.length; i++) 
		{
			if(detailsDTO[i]!= null && detailsDTO[i].getAccountno()==accountno)
			{
				detailsDTO[i]=null;
				System.out.println("Deleted");
				count++; 
			}
		}
		
		if(count==0)
			System.out.println("account  not Present");
		return "account not present";
	}
	
	public String updateContactByName(String name, int contac)
	{
		int count=0;
		for (int i = 0; i < detailsDTO.length; i++) 
		{
			if(detailsDTO[i]!= null && detailsDTO[i].getName()==name)
			{
				detailsDTO[i].setContac(contac);
				System.out.println("Contac Updated"); 
				count++; 
			}
		}
		
		if(count==0)
			System.out.println("account  not Present");
		
		return "account not present";
	}

	public String updateContactByAccountno(int accountno, int contac)
	{
		int count=0;
		for (int i = 0; i < detailsDTO.length; i++) 
		{
			if(detailsDTO[i]!= null && detailsDTO[i].getAccountno()==accountno)
			{
				detailsDTO[i].setContac(contac);
				System.out.println("Contac Updated");
				count++; 
			}
		}
		
		if(count==0)
			System.out.println("account  not Present");
		
		return "account not present";
	}
	
	
	public void printall()
	{
		for (int i = 0; i < detailsDTO.length; i++) 
		{
			if(detailsDTO[i]!= null)
			{
				System.out.println("\n"+detailsDTO[i].getAccountno()+"\n"+detailsDTO[i].getContac()+"\n"+detailsDTO[i].getiFSC()+"\n"+detailsDTO[i].getEmailid()+"\n"+detailsDTO[i].getType()+"\n");
			}
		}
	}
	
}
