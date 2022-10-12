class stringtochar {
    public static void main(String[] args) {
        
        String s="Rinkesh D Patel";
        char[] c;

        c=s.toCharArray();
        System.out.println("String to char Array");
        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }

    }
    
}
