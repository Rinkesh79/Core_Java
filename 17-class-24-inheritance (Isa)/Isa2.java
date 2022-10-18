package inheritance;

public class Isa2 extends Isa {
	
	String sonname;
	String daughtername;
	byte sage;
	byte dage;
	
	public Isa2() 
	{
		
		System.out.println("child class cons");
	}

	public String getSonname() {
		return sonname;
	}
	
	public void setSonname(String sonname) {
		this.sonname = sonname;
	}
	public String getDaughtername() {
		return daughtername;
	}
	public void setDaughtername(String daughtername) {
		this.daughtername = daughtername;
	}
	
	public byte getSage() {
		return sage;
	}
	
	public void setSage(byte sage) {
		this.sage = sage;
	}
	
	public byte getDage() {
		return dage;
	}
	
	public void setDage(byte dage) {
		this.dage = dage;
	}
	
	
	
}
