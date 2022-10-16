public class leptop{

    private String bname;
    private String mname;
    private String processer;
    private byte ram;
    private int hdd;

    leptop()
    {
        System.out.println("Default constructor");
    }

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

    public String getprocesser()
    {
        return processer;
    }

    public void setprocesser(String processer)
    {
        this.processer=processer;
    }

    public byte getram()
    {
        return ram;
    }

    public void setram(byte ram)
    {
        this.ram=ram;
    }
    

    public int gethdd()
    {
        return hdd;
    }

    public void sethdd(int hdd)
    {
        this.hdd=hdd;
    }

    public void print()
    {
        System.out.println("print method-\n"+bname+"\n"+mname+"\n"+processer+"\n"+ram+"\n"+hdd);
    }

}