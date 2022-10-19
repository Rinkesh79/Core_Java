package Company;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		
		AddressDTO adto= new AddressDTO();
		
		adto.setName("qa");
		adto.setType("software");
		adto.setNoOfEmploye(1000);
		adto.setContry("india");
		adto.setState("karnataka");
		adto.setDistrict("Urban");
		adto.setCity("Bangalore");
		adto.setArea("North-zones");
		adto.setZipcode(560001);
		
		AddressDTO adto2= new AddressDTO();
		
		adto2.setName("mac");
		adto2.setType("software");
		adto2.setNoOfEmploye(2000);
		adto2.setContry("india");
		adto2.setState("Gujarat");
		adto2.setDistrict("Surat");
		adto2.setCity("sachin");
		adto2.setArea("south-zones");
		adto2.setZipcode(394230);
		
		CompanyDAO doa=new CompanyDAO();
		
		doa.save(adto);
		doa.save(adto2);
		
		doa.seaechbynoOfEmploye(1000);
		
		doa.searchByCountry("india");
		doa.searchByCountry("USA");
		
		doa.searchByState("Gujarat");
		doa.searchByState("UP");
		
		doa.SearchByzipcode(394230);
		doa.SearchByzipcode(560808);
		
		doa.searchBydistrict("Urban");
		doa.searchBydistrict("SURAT");
		
		System.out.println(adto2.getName());
		System.out.println(adto2.getContry()+"\n"+adto2.getState()+"\n"+adto2.getDistrict()+"\n"+adto2.getCity()+"\n"+adto2.getArea()+"\n"+adto2.getZipcode()+"\n");
		
		doa.updateAddressByName("mac","USA","Washington" , "Kingston", "Los Angeles","east", 90001);
		
		
		System.out.println(adto2.getName());
		System.out.println(adto2.getContry()+"\n"+adto2.getState()+"\n"+adto2.getDistrict()+"\n"+adto2.getCity()+"\n"+adto2.getArea()+"\n"+adto2.getZipcode()+"\n");
		
		
	}

}
