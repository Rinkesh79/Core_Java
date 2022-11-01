package GroceryShop;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class GroceryShopTest {

	
	public static void main(String[] args) {
		
		
		ProductDTO dto=new ProductDTO();
		
		dto.setNameOfProduct("moongdall");
		dto.setmRPrice(80.50);
		dto.setBracodeNumber(501L);
		dto.setIsVag(true);
		dto.setManufacturingDate("1-oct-2022");
		dto.setExpiryDate("1-oct-2028");
		dto.setQuantity(500);
		
		
		ManufacturercompanyDTO mdto= new ManufacturercompanyDTO();
		
		mdto.setCompanyname("Tata");
		mdto.setContactNo(9099859516L);
		mdto.setMailId("tatagrocery123@gmail.com");
		
		
		dto.setManufacturercompany(mdto);
		
		
		AddressDTO adto= new AddressDTO();
		
		adto.setBuildingNo("452-A");
		adto.setArea("L H road");
		adto.setCity("surat");
		adto.setState("gujarat");
		adto.setCountry("india");
		adto.setZipCoad(395006);
		
		mdto.setAdd(adto);
		
		
		
		
		

		ProductDTO dto1=new ProductDTO();
		
		dto1.setNameOfProduct("chanagdall");
		dto1.setmRPrice(77.50);
		dto1.setBracodeNumber(502L);
		dto1.setIsVag(false);
		dto1.setManufacturingDate("1-oct-2021");
		dto1.setExpiryDate("1-oct-2025");
		dto1.setQuantity(700);
		

		ManufacturercompanyDTO mdto2= new ManufacturercompanyDTO();
		
		mdto2.setCompanyname("Tata");
		mdto2.setContactNo(9099859516L);
		mdto2.setMailId("tatagrocery123@gmail.com");
		
		
		dto1.setManufacturercompany(mdto2);
		
		
		AddressDTO adto2= new AddressDTO();
		
		adto2.setBuildingNo("452-A");
		adto2.setArea("L H road");
		adto2.setCity("surat");
		adto2.setState("gujarat");
		adto2.setCountry("india");
		adto2.setZipCoad(395006);
		
		mdto2.setAdd(adto2);
		
		
		
		
		Methods dao=new GroceryShopDAO();
		
		dao.AddProduct(dto);
		
		dao.AddProduct(dto1);
		
		
		
		Scanner sc =new Scanner(System.in);
		
		//ArrayList a=dao.getall();
		//System.out.println(a);
		
		//dao.removeProductByCompanyName("chanagdall","Tata");
		
		
		//System.out.println(a);
		
		
		
		//TreeSet<Object> t=dao.getAllProductByCompanyName("Tata");
		//System.out.println(t);
		
	    //HashSet h=dao.getAllProductBynameofproduct("chanagdall");
		//System.out.println(h);
		
		
		
		//int c=dao.totalNumberOfProduct();
		//System.out.println("totalNumberOfProduct-"+c);
		
		//List l= dao.getAllVegProduct();
		//System.out.println(l);
		
		//LinkedList lk=dao.getAllNonVegProduct();
		//System.out.println(lk);
		
		
		//dao.showAllProduct();
		
		
		
		System.out.println("GroceryShop");

		
		
			for( ; ; )
			{
				System.out.println("Welcome To GroceryShop");
				System.out.println("you have Many operation :- \npress - 1 AddProduct \npress - 2 Get All Product By CompanyName\npress - 3 Get All Product By product name  \npress - 4 Get All Veg-Product \npress - 5 Get All non-Veg Product  \npress - 6 Total Number Of Product in Shope \npress - 7 Show All Product \npress - 8 Remove Product By CompanyName \npress - 0 Stop");
				
				System.out.println("Enter your operation no -");
				
				int in=sc.nextInt();
				
				switch (in) {
				case 1: {
					
					ProductDTO dto3=new ProductDTO();
					
					System.out.println("Enter name of product -");
					String s1=sc.next();
					dto3.setNameOfProduct(s1);
					
					System.out.println("Enter Price of product -");
					Double s2=sc.nextDouble();
					dto3.setmRPrice(s2);
					
					System.out.println("Enter Barcode of product -");
					Long s3=sc.nextLong();
					dto3.setBracodeNumber(s3);
					
					System.out.println("Enter  product is vag (true) or nonvag(false) -");
					Boolean s4=sc.nextBoolean();
					dto3.setIsVag(s4);
					
					System.out.println("Enter Manufacturing Date of product -");
					String s5=sc.next();
					dto3.setManufacturingDate(s5);
					
					System.out.println("Enter Expiry Date of product -");
					String s6=sc.next();
					dto3.setExpiryDate(s6);
					
					System.out.println("Enter Quantity of product -");
					int s7=sc.nextInt();
					dto3.setQuantity(s7);
					

					ManufacturercompanyDTO mdto3= new ManufacturercompanyDTO();
					
					System.out.println("Enter  product Company name -");
					String s8=sc.next();
					mdto3.setCompanyname(s8);
					
					System.out.println("Enter  product Company contact number  -");
					Long s9=sc.nextLong();
					mdto3.setContactNo(s9);
					
					System.out.println("Enter  product Company Mail id  -");
					String s10=sc.next();
					mdto3.setMailId(s10);
					
					
					dto3.setManufacturercompany(mdto3);
					
					
					AddressDTO adto3= new AddressDTO();
					System.out.println("Enter  product Company AddressDetail  -");
					
					System.out.println("Enter Building No -");
					String s11=sc.next();
					adto3.setBuildingNo(s11);
					
					System.out.println("Enter Area -");
					String s12=sc.next();
					adto3.setArea(s12);
					
					System.out.println("Enter city -");
					String s13=sc.next();
					adto3.setCity(s13);
					
					System.out.println("Enter State -");
					String s14=sc.next();
					adto3.setState(s14);
					
					System.out.println("Enter Country -");
					String s15=sc.next();
					adto3.setCountry(s15);
					
					System.out.println("Enter Zip coad -");
					int s16=sc.nextInt();
					adto3.setZipCoad(s16);
					
					mdto3.setAdd(adto3);
					
					dao.AddProduct(dto3);
					System.out.println("Product added");
					break;
				}
				
				case 2:
				{
					System.out.print("Enter Company name :- ");
					String s=sc.next();
					TreeSet<Object> t=dao.getAllProductByCompanyName(s);
					System.out.println(t);
					break;
				}
				
				case 3:
				{
					
					System.out.println("Enter Product name -");
					String pn=sc.next();
					HashSet h=dao.getAllProductBynameofproduct(pn);
					System.out.println(h);
					break;
				}
				
				case 4:
				{
					System.out.println("All Veg Product -");
					List l= dao.getAllVegProduct();
					System.out.println(l);
					break;
				}
				
				case 5:
				{
					System.out.println("All Non-Veg Product -");
					LinkedList lk=dao.getAllNonVegProduct();
					System.out.println(lk);
					break;
				}
				
				
				case 6:
				{
					int c=dao.totalNumberOfProduct();
					System.out.println("Total Number Of Product- "+c);
					break;
				}
				
				
				case 7:
				{
					System.out.println("ALL Products - ");
					dao.showAllProduct();
					
					break;
				}
				
				case 8:
				{
					System.out.println("Enter Product name -");
					String pn1=sc.next();
					System.out.println("Enter Product Company name -");
					String cn=sc.next();
					dao.removeProductByCompanyName(pn1,cn);
					break;
					
				}
				
		
				
				case 0:
				{
					
					break;
					
				}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + in);
				}
				
			
		
				System.out.println("\n\ncontinue enter 1 \nexit enter any key");
				System.out.println("\nenter your input- ");
		        int count=sc.nextInt();
		        if(count!=1)
		        break;
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
