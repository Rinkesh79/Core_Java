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
		
		dao.boolenadd(dto1);
	
		dao.getAll();
		
		dao.updateBySerialNo("SIAB015902B1",3 ,"Motorola" , "m300", 3, 16, 30000);
		dao.getAll();
		
		dao.getAllByBrandname("Motorola");
		dao.getAllByBrandname("MI");
		
		dao.deletByMobileId(3);
		dao.getAll();
		
		
		dao.boolenadd(dto1);
		dao.getAll();
		
		
		
		
	}

}
