package Mobiles;

public class MobilesTest {
	
	public static void main(String[] args) {
		
		MobilesDTO dto1=new MobilesDTO();
		
		dto1.setMoblieID(1);
		dto1.setBrandName("MI");
		dto1.setMobileNmae("MI I10R");
		dto1.setSerialNo("SIAB015902B1");
		dto1.setNoOfCamera(2);
		dto1.setMemory(8);
		dto1.setPrice(20000);
		
		MobilesDAO dao= new MobilesDAO();
		
		
		
		dao.setMoblieID(2);
		dao.setBrandName("realme");
		dao.setMobileNmae("RE20");
		dao.setSerialNo("REAB015902B1");
		dao.setNoOfCamera(3);
		dao.setMemory(8);
		dao.setPrice(25000);
		dao.boolenadd(dao);
		
		
		dao.boolenadd(dto1);
	
		dao.getAll();
		
		dao.updateBySerialNo("SIAB015902B1",3 ,"Motorola" , "m300", 3, 16, 30000);
		dao.getAll();
		
		dao.getAllByBrandname("Motorola");
		dao.getAllByBrandname("MI");
		
		dao.deletByMobileId(1);
		
		
		
	}

}
