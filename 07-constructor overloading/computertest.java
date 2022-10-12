class computertest {

    public static void main(String[] args) {

        //System.out.println(computer.cname+"\n"+computer.cmodel);
        System.out.println("constructor overloading");

        computer c1= new computer();
        System.out.println(c1.cname);
        System.out.println(c1.cmodel);

        computer c2= new computer("I5-9th/g");
        System.out.println(c2.proc);
        System.out.println(c2.color);

        computer c3=new computer(8,500);
        System.out.println(c3.ram);
        System.out.println(c3.hdd);

        computer c4=new computer("asus","A210","gray","I7",16,500);
        System.out.println(c4.cname+"\n"+c4.cmodel+"\n"+c4.color+"\n"+c4.proc+"\n"+c4.ram+"\n"+c4.hdd+"\n");
    }
    
}
