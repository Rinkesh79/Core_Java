import javax.naming.ldap.ManageReferralControl;

class Tv {

    String bname;
    String mname;
    String color;
    int size;
    double price;
    String []features;



Tv(String bname){

    this.bname=bname;
    
}

Tv(String bname, String mname,String color,int size,double price,String[] features){
        this.bname=bname;
        this.mname=mname;
        this.color=color;
        this.size=size;
        this.price=price;
        this.features=features;

}

void print(){
    System.out.println(bname+"\t"+mname+"\t"+color+"\t"+size+"\t"+price);

    for(int i=0;i<features.length;i++){

        System.out.print(features[i]+"\t");
    }

}






}