class computer{

    static String cname;
    static String cmodel;

    String color;
    String proc;
    int ram;
    int hdd;

    computer(){
        System.out.println("~ zero para");
       cname="hp"; 
       cmodel="Z1";

    }
    computer(String pname){
        System.out.println("~ one para");
        proc=pname;
        color="black";

    }
    computer(int ramsize,int hddsize){
        System.out.println("~ one or more para");
        ram=ramsize;
        hdd=hddsize;

    }
    computer(String name,String model,String col,String pro,int ramsize,int hddsize ){
        System.out.println("~ multi para");
        cname=name;
        cmodel=model;
        color=col;
        proc=pro;
        ram=ramsize;
        hdd=hddsize;

    }
    

    
}