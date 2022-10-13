class methodsplit {

    static void input(String name){

        System.out.println("using calling methods");

        String inp= name;
        String [] msg=inp.split("-");
     
        for(int i=0; i < msg.length;i++){
        System.out.println(msg[i]);
        }

    }



    public static void main(String[] args) {
        

        methods.input("Rinkesh-D-Patel");


        System.out.println("using args input");
        
        String inp= args[0];
        String [] msg=inp.split("-");
     
        for(int i=0; i < msg.length;i++){
        System.out.println(msg[i]);
        }
    }
    
}
