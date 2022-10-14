import java.util.Scanner;

class leapyear{

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a Year-");
        int year = sc.nextInt();

        if(year %4 == 0 || year %100 == 0 || year %400 == 0){

            System.out.println(year+"  is leap year");

        }
        else{
            System.out.println(year+"  is  NOT leap year");
        }





    }
}