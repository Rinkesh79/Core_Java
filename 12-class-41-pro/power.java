import java.util.Scanner;

class power {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter power of 2 table no-");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){

            System.out.println("2 ^ "+i+"= "+Math.pow(2, i));
        }


    }
}
