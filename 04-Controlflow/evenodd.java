class evenodd {
    public static void main (String []arg){
    
        int [] b ={1,6,9,8,7,6};
        System.out.println("array size - " + b.length);

        for(int i=0; i<b.length;i++){
            if(b[i] %2 == 0){
                System.out.println(b[i]+"-even num");
            }
            else{
                System.out.println(b[i]+"-odd num");
            }
        }
    }
}
