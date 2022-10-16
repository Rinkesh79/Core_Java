public class car {

    private String cname;
    private String mname;
    private String color;
    private byte airbag;
    private int price;

    car()
    {
        System.out.println("Default constructor");
    }

    public String getcname()
    {
        return cname;
    }

    public void setcname(String cname)
    {
        this.cname=cname;
    }

    public String getmname()
    {
        return mname;
    }

    public void setmname(String mname)
    {
        this.mname=mname;
    }

    public String getcolor()
    {
        return color;
    }

    public void setcolor(String color)
    {
        this.color=color;
    }

    public byte getairbag()
    {
        return airbag;
    }

    public void setairbag(byte airbag)
    {
        this.airbag=airbag;
    }
    

    public int getprice()
    {
        return price;
    }

    public void setprice(int price)
    {
        this.price=price;
    
    }

    public void print()
    {
        System.out.println("Print method-\n"+cname+"\n"+mname+"\n"+color+"\n"+airbag+"\n"+price);
    }

}
