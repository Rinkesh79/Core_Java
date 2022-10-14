import java.util.Scanner;

class replacestring{

    public static void main(String[] args) {

      
        String s1="Hello nik , how are you?";
        System.out.println(s1);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter use name-"); 
        String uname = sc.next();
        //System.out.println("username-"+uname);

        
        String rpl=s1.replace("nik", uname);
        System.out.println(rpl);

       
    }


}