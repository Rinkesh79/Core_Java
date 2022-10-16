class leptoptest {
    
    public static void main(String[] args) {
        
        leptop le= new leptop();
        le.setbname("HP");
        le.setmname("z1");
        le.setprocesser("i7-9gen");
        le.setram((byte)8);
        le.sethdd(500);
        le.print();

        System.out.println("get method-"+le.getbname()+"\n"+le.getmname());
    }
    
}
