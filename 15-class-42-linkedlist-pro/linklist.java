import java.util.LinkedList;

class linklist{

    public static void main(String[] args) {
        
        LinkedList ld= new LinkedList();
        ld.add("A");
        ld.add("B");
        System.out.println(ld);
        ld.remove("A");
        ld.add("C");
        System.out.println(ld);
        ld.add(0,"a");
        System.out.println(ld);

        LinkedList ld2=new LinkedList();
        ld2.add("AA");
        ld2.add("BB");
        ld2.add("CC");
        System.out.println(ld2);

        LinkedList ld3=new LinkedList();
        ld3.add("AA");
        ld3.add("ZZ");

        ld.addAll(ld2);
        System.out.println(ld);

        ld2.removeAll(ld3);
        System.out.println(ld2);

        ld.removeAll(ld3);
        System.out.println(ld);

        System.out.println(ld3);
        ld3.removeAll(ld3);
        System.out.println(ld3);
       

    }

}