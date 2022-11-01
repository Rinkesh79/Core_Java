package GroceryShop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class GroceryShopDAO implements Methods {

	
	ArrayList<ProductDTO> set= new ArrayList<ProductDTO>();
	
	
	public boolean AddProduct(ProductDTO dto)
	{	
		set.add(dto);
		//System.out.println("added");
		return dto.getNameOfProduct() != null;
	}
	
	
	public ArrayList getall()
	{
		return set;
	}
	
	 public String removeProductByCompanyName(String nameOfProduct ,String companyname)
	 {
		 int counter=0;
		 for(int i=0 ; i < set.size() ; i++ ) {
			 
			ProductDTO dto= set.get(i); 		
			if(dto.getNameOfProduct().equals(nameOfProduct) ||dto.getManufacturercompany().getCompanyname().equals(companyname))
			 {
				 set.remove(i);
				 System.out.println("removed");
				 counter++;
			 }
			
		}
		 if(counter==0)
			 System.out.println("NO Product available");
		 return null;
	 }
	
	
	 public TreeSet<Object> getAllProductByCompanyName(String companyname)
	 {
		 TreeSet<Object> ts= new TreeSet<>();
		 
		int counter=0;
		 for(int i=0 ; i < set.size() ; i++ ) {
			 
			ProductDTO dto= set.get(i); 		
			if(dto.getManufacturercompany().getCompanyname().equals(companyname))
			 {
				
				 //ts.add(dto.getNameOfProduct()+dto.getmRPrice()+dto.getBracodeNumber()+dto.getIsVag()+dto.getManufacturingDate()+dto.getExpiryDate()+dto.getQuantity()+dto.getManufacturercompany());
				
				ts.add(dto.getManufacturercompany().getCompanyname()+"\n"+dto+"\n");
				counter++;
			 }
			
		}
		 if(counter==0)
			 System.out.println("NO Product available");
		 return ts;
	 }
	
	
	
	 public HashSet<Object> getAllProductBynameofproduct(String nameOfProduct)
	 {
		 int counter=0;
		 HashSet<Object> hs= new HashSet<>();
		 for(int i=0 ; i < set.size() ; i++ ) 
		 {
			 
			ProductDTO dto= (ProductDTO)set.get(i); 		
			if(dto.getNameOfProduct().equals(nameOfProduct))
			 {
			
				 hs.add(dto);
				 counter++;
				
			 }
			
		}
		 if(counter==0)
			 System.out.println("NO Product available");
		 return hs;
	 }
	
	
	 
	 public int totalNumberOfProduct()
	 {
		 
		 int c=0;
		 c=set.size(); 
		 return c;
	 }
	 
	 
	 public List getAllVegProduct()
	 {
		 int counter=0;
		 List<Object> ld= new LinkedList<>();
		 for(int i=0 ; i < set.size() ; i++ ) 
		 {
			 
			ProductDTO dto= (ProductDTO)set.get(i); 		
			if(dto.getIsVag()==true)
			 {
			
				 ld.add(dto);
				 counter++;
			 }
		 
		 }
		 if(counter==0)
			 System.out.println("NO Product available");
		 return ld;
	 }
	 
	 
	 
	 public LinkedList getAllNonVegProduct()
	 {
		 int counter=0;
		 LinkedList<Object> ld= new LinkedList<>();
		 for(int i=0 ; i < set.size() ; i++ ) 
		 {
			 
			ProductDTO dto= (ProductDTO)set.get(i); 		
			if(dto.getIsVag()==false)
			 {
			
				 ld.add(dto);
				 counter++;
			 }
		 
		 }
		 if(counter==0)
			 System.out.println("NO Product available");
		 return ld;
	 }
	 
	 
	 
	 
	 
	 
	 
	public void showAllProduct()
	{   
		int counter=0;
		for (int j = 0; j < set.size(); j++)
		{
			ProductDTO dto=set.get(j);
			System.out.println(dto);
			counter++;
		}
		
		if(counter==0)
			 System.out.println("NO Product available");
	}
	
	
	
	
	
	
	
	
	
	
	
}
