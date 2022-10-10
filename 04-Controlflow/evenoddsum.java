class evenoddsum {
    public static void main (String []arg){
        int oddsum=0;
        int evensum=0;
        int [] b ={7,16,12,8,17,36,40,77};
        System.out.println("array size - " + b.length);

        for(int i=0; i<b.length;i++){
            if(b[i] %2 == 0){
                System.out.println(b[i]+"-even num");
              
                evensum=evensum+b[i];
            }
            else{
                System.out.println(b[i]+"-odd num");
                
                oddsum=oddsum+b[i];
            }
        }
        System.out.println("-odd num sum- "+oddsum);
        System.out.println("-even num sum- "+evensum);
    }
}
