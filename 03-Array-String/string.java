class stringa{
   public static void main(String [] args) {

    String st="Rinkesh D Patel";
    String st1="Rinkesh D Patel";
    String st2="patel rinkesh";
    System.out.println("1-"+st);
    System.out.println("2-"+st1);
    System.out.println("3-"+st2);

    System.out.println("String Length-"+st.length());

    System.out.println("String charAt(1)-"+st.charAt(1));

    System.out.println("String contains(Patel)-"+st.contains("Patel"));

    System.out.println("String 2 equals 3-"+st.equals(st2));
    
    System.out.println("String index(Patel)-"+st.indexOf("Patel"));
     
    System.out.println("String index(D)-"+st.indexOf("D"));

    System.out.println("String replace D to P-"+st.replace('D', 'P'));

    System.out.println("String replace Rinkesh to Dinesh-"+st.replace("Rinkesh", "Dinesh"));

    System.out.println("String lovercase-"+st.toLowerCase());

    System.out.println("String Uppercase-"+st.toUpperCase());
    }
}