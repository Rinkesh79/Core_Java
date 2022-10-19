package com.qac.CoreJava.DTODAO;

public class BankAccountDetailsTest {
	
	public static void main(String[] args) {
		
		BankAccountDetailsDTO dto= new BankAccountDetailsDTO();
		
		dto.setAccountno(10001);
		dto.setName("Rahul");
		dto.setContac(1234567890);
		dto.setiFSC("sbi012");
		dto.setEmailid("rahul123@gamil.com");
		dto.setType("Saving");
		
		BankAccountDetailsDTO dto1= new BankAccountDetailsDTO();
		dto1.setAccountno(10002);
		dto1.setName("Savan");
		dto1.setContac(1232222890);
		dto1.setiFSC("sbi023");
		dto1.setEmailid("savan123@gamil.com");
		dto1.setType("salary");
		
		BankAccountDetailsDTO dto2= new BankAccountDetailsDTO();
		dto2.setAccountno(10003);
		dto2.setName("SRK");
		dto2.setContac(1232227897);
		dto2.setiFSC("sbi099");
		dto2.setEmailid("srk123@gamil.com");
		dto2.setType("salary");
		

		
		BankAccountDetailsDAO dao= new BankAccountDetailsDAO();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		
		dao.printall();
		
		dao.searchbyaccountno(10001);
		dao.searchbyaccountno(10005);
		
		dao.searchbyname("Savan");
		dao.searchbyname("Kalu");
		
		dao.searchbyIFSC("sbi099");
		dao.searchbyIFSC("SBI009");
		
		dao.updateContactByAccountno(10003, 222222222);
		dao.updateContactByAccountno(10008, 333333333);
		
		System.out.println(dto2.getContac());
		
		dao.updateContactByName("RAHUL", 778887777);
		dao.updateContactByName("Rahul", 777777777);
		
		System.out.println(dto.getContac());
		
		dao.deletebyaccountno(10002);
		
		dao.printall();
		
		dao.searchbyaccountno(10002);
		
		
		
		
		
		
	}

}
