package inheritance;



public class Isa {
	
	private String fathername;
	private String mothername;
	private byte fage;
	private byte mage;
	
	
	
	public Isa()
	{
		System.out.println("perents Class Cons");
	}

	public String getFathername() {
		return fathername;
	}
	
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	
	public String getMothername() {
		return mothername;
	}
	
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	
	public byte getFage() {
		return fage;
	}
	
	public void setFage(byte fage) {
		this.fage = fage;
	}
	
	public byte getMage() {
		return mage;
	}
	
	public void setMage(byte mage) {
		this.mage = mage;
	}
}

