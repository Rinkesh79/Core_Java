package inheritance;



public class Isatest {
	
	public static void main(String[] args) {
		
		Isa2 a1= new Isa2();
		
		String [] name= {"Dineshbhai","Pituben","Rinkesh","Chinu"};
		
		//parent method
		
		a1.setFathername(name[0]);
		a1.setMothername(name[1]);
		a1.setFage((byte)52);
		a1.setMage((byte)49);
		
		System.out.println(a1.getFathername()+"\n"+a1.getFage()+"\n"+a1.getMothername()+"\n"+a1.getMage());
		
		//child method
		
		a1.setDaughtername(name[3]);
		a1.setSonname(name[2]);
		a1.setSage((byte)25);
		a1.setDage((byte)21);
		System.out.println(a1.getSonname()+"\n"+a1.getSage()+"\n"+a1.getDaughtername()+"\n"+a1.getDage());
		
		
		
	}

}
