class Metrotest {


    public static void main(String[] args) {
        
        Metro m1= new Metro("Surat", 32);
        System.out.println("metro name-"+m1.mname+"\t no sataion-"+m1.nostation);

        String [] ft={"save time","faster","317 km long"};
        Metro m2= new Metro("Delhi", 255,(byte)10,25,160.50,ft);
        m2.print();



    }
    
}
