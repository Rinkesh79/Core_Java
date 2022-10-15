import java.util.Scanner;

class programapp{

    static int factorial(int a){
    
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
            
        }
       System.out.println("factorial is-"+fact);
        return fact;
    }

    static int fibonacci(int x){
        int fibo=0 , f=0 , s=1;
        for(int i=0;i<=x;i++){
            System.out.print(f+",");
            int next=f+s;
            f=s;
            s=next;
        }
       return f;

    }

    static int prime(int y){

        if (y <= 1) {
            System.out.println("\n"+y+"The number is not prime");
           
          }
          boolean flag = false;
          for (int i = 2; i <= y / 2; ++i) {
           
            if (y % i == 0) {
              flag = true;
              break;
            }
          }
      
          if (flag==false){
            System.out.println("\n"+y + " is a prime number.");
          }
            else{
            System.out.println("\n"+y + " is not a prime number.");
            }
            return y;
    }
      


    

    static int evenodd(int e){

        if(e%2 == 0){
            System.out.println(e+" is Even no");
        }
        else{
            System.out.println(e+" is odd no");
        }
        return e;
    }
    


    public static void main(String[] args) {

        Scanner sc= new  Scanner(System.in);
        for( ; ;){

        System.out.println("1 - for Factorial\n2 - for Fibonacci  \n3 - for prime no    \n4 - for Even odd \n enter no-");
        int c = sc.nextInt();

        if(c==1){
 //Factorial
        System.out.println("enter no for Factorial- ");
        int f = sc.nextInt();
        programapp.factorial(f);

        }
        else if(c==2){
//fibonacci
        System.out.println("enter no for fibonacci- ");
        int fb = sc.nextInt();
        programapp.fibonacci(fb);

        }
        else if(c==3){
//primeno
         System.out.println("enter no for primeno- ");
        int pr = sc.nextInt();
        programapp.prime(pr);           
        }
        else if(c==4){
//evenodd
         System.out.println("enter no for evenodd- ");
        int eo = sc.nextInt();
        programapp.evenodd(eo);

        }
        else{
            System.out.println("input not valid ");  
        }
        System.out.println("continue enter 1 \nexit enter any key");
        int count=sc.nextInt();
        if(count!=1)
        break;

    }


    }
}