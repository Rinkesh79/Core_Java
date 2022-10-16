class cartest {

    
        public static void main(String[] args) {
    
            car c= new car();
            c.setcname("audi");
            c.setmname("A8");
            c.setcolor("Black");
            c.setairbag((byte)4);
            c.setprice(1020000);
            c.print();
            System.out.println("\nget method-\n"+c.getcname()+"\n"+c.getcolor()+"\n"+c.getairbag());



        }

}
