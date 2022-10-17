package inheritance;



public class Bike {

	private String bname;
	private String mname;
	private int price;
    private	Engine engine;
	
	
	public String getbname()
	{
		return bname;
	}
	
	public void setbname(String bname)
	{
		this.bname=bname;
	}
	
	public String getmname()
	{
		return mname;
	}
	
	public void setmname(String mname)
	{
		this.mname=mname;
	}
	
	public int getprice()
	{
		return price;
	}
	
	public void setprice(int price)
	{
		this.price=price;
	}
	
	public Engine getengine()
	{
		return engine;
	}
	
	public void setengine(Engine engine)
	{
		this.engine=engine;
	}
	
	
}
