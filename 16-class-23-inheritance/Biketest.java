package inheritance;

public class Biketest {

	public static void main(String[] args) {
		
		Engine e= new Engine();
		e.setbname("KTM");
		e.setcc(350);
		e.setstrokes((byte)2);
		
		
		Bike b= new Bike();
		b.setbname("KTM");
		b.setmname("KTM350");
		b.setprice(250000);
		b.setengine(e);
		
		System.out.println(b.getbname()+"\n"+b.getmname()+"\n"+b.getprice());
		
		Engine e1=b.getengine();
		System.out.println(e1.getbname()+"\n"+e1.getcc()+"\n"+e1.getstrokes());
		
		
	}
}
