class array{
    public static void main (String []arg){
        char [] c = {'p','a','t','e','l'};
        System.out.println("char - " +c[0]+" "+c[3]);

        byte [] b ={1,6,9,8,7,6};
        System.out.println("byte - " +b[1]+" "+b[0]);

        short [] s ={8,9,1,15,11,80};
        System.out.println("short - " +s[5]+" "+s[3]);

        int [] i ={66,90,85,50,8,22};
        System.out.println("int - " +i[2]+" "+i[4]);

        long [] l ={11211,588,69645,8989,69369,25874123};
        System.out.println("long - " + l[1]+" "+l[5]);

        float [] f ={0.12345678f,6.5f,1.9f,8,7,6};
        System.out.println("float - " +f[0]+" "+f[4]);

        double [] d ={0.5,6.12345678901,1.9,8,7,6};
        System.out.println("double - " +d[1]+" "+d[5]);

        boolean [] bo ={false,false,true,false};
        System.out.println("boolean - " +bo[1]+" "+bo[2]);


    }
}