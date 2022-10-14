class Tvtest {

    
    public static void main(String[] args) {
        
        
        Tv tv1= new Tv("sony");
        System.out.println(tv1.bname);

        
        String [] f = {"LED","android","USB","HDMI"};
        Tv tv2= new Tv("LG","slim-x1","Black",42,45000,f);
        tv2.print();
       










    }


}
