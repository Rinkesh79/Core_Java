class calculater{

//additation
    static int additation (int a , int b){
        System.out.println("additation-"+  a  +"+"+ b);
        return a+b;
    }

    static int additation (int a , int b ,int c){
        System.out.println("additation-"+  a  +"+"+ b+"+"+c);
        return a+b+c;
    }

    static double additation (Double a , int b){
        System.out.println("additation-"+  a  +"+"+ b);
        double d = new Double(b);
        double x=a+d;
        return x;
    }
//subtraction
    static int subtraction (int a , int b){
        System.out.println("\nsubtraction-"+  a  +"-"+ b );
        return a-b;
    }

    static int subtraction (int a , int b ,int c){
        System.out.println("subtraction-"+a+"-"+b+"-"+c);
        return a-b-c;
    }

    static double subtraction  (Double a , int b){
        System.out.println("subtraction-"+  a  +"-"+ b);
        double d = new Double(b);
        double x=a-d;
        return x;
    }
//Multiplication
    static int multiplication (int a , int b){
        System.out.println("\nmultiplication-"+  a  +"*"+ b );
        return a*b;
    }

    static int multiplication (int a , int b ,int c){
        System.out.println("multiplication-"+a+"*"+b+"*"+c);
        return a*b*c;
    }

    static double multiplication  (Double a , int b){
        System.out.println("multiplication-"+  a  +"*"+ b);
        double d = new Double(b);
        double x=a*d;
        return x;
    }
//Division
    static int division (int a , int b){
        System.out.println("\ndivision-"+  a  +"/"+ b );
        return a/b;
    }

    static int division (int a , int b ,int c){
        System.out.println("division-"+a+"/"+b+"/"+c);
        return a/b/c;
    }

    static double division  (Double a , int b){
        System.out.println("division-"+  a  +"/"+ b);
        double d = new Double(b);
        double x=a/d;
        return x;
    }  




    public static void main(String[] args) {
        System.out.println("\n~ Calculater ~\n");
//additation
        int add2 = calculater.additation(5, 5);
        System.out.println(add2);

        int add3 = calculater.additation(5, 5,5);
        System.out.println(add3);

        double add = calculater.additation(5.5, 5);
        System.out.println(add);
//subtraction
        int sub2 = calculater.subtraction(20, 2);
        System.out.println(sub2);

        int sub3 = calculater.subtraction(20, 29,2);
        System.out.println(sub3);

        double sub = calculater.subtraction(29.5, 2);
        System.out.println(sub);
//multiplication
        int mul2 = calculater.multiplication(3, 5);
        System.out.println(mul2);

        int mul3 = calculater.multiplication(3, 5,7);
        System.out.println(mul3);

        double mul = calculater.multiplication(3.5, 5);
        System.out.println(mul);
//Division
        int div2 = calculater.division(30, 3);
        System.out.println(div2);

        int div3 = calculater.division(35, 5,7);
        System.out.println(div3);

        double div = calculater.division(39.5, 8);
        System.out.println(div);



    }
}