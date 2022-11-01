package Mobile;

import java.util.ArrayList;

public class Mobiletest {
	
	
	public static void main(String[] args) {
		
		
		MobileDTO dto1= new MobileDTO();
		
		dto1.setMoblieID(1);
		dto1.setBrandName("MI");
		dto1.setMobileNmae("MI I10R");
		dto1.setSerialNo("SIAB015902B1");
		dto1.setNoOfCamera(2);
		dto1.setMemory(8);
		dto1.setPrice(20000);
		
		
		MobileDTO dto2= new MobileDTO();
		
		dto2.setMoblieID(2);
		dto2.setBrandName("Apple");
		dto2.setMobileNmae("14pro");
		dto2.setSerialNo("APPLEB015902B1");
		dto2.setNoOfCamera(3);
		dto2.setMemory(8);
		dto2.setPrice(100000);
		
		MobileDTO dto3= new MobileDTO();
		
		dto3.setMoblieID(3);
		dto3.setBrandName("vi");
		dto3.setMobileNmae("MI note10");
		dto3.setSerialNo("MIAB257902B1");
		dto3.setNoOfCamera(3);
		dto3.setMemory(16);
		dto3.setPrice(35000);
		
		
		Mobilesmethods dao= new MobileDAO();
		
		dao.add(dto1);
		dao.add(dto2);
		dao.add(dto3);
		
		ArrayList a=dao.getAll();
		System.out.println(a);
		
		ArrayList b =dao.getAllByBrandname("MI");
		System.out.println(b);
		
		dao.updateBySerialNo("MIAB257902B1",4 ,"Motorola" , "m300", 3, 16, 30000);
		
		dao.deletByMobileId(2);
		System.out.println(a);
	
		
		
		
	
	}
	

}
