import java.util.jar.Attributes.Name;

class Metro {

    String mname;
    int nostation;
    byte lan;
    int notrain;
    double speed;
    String [] features;
    



Metro(String mname,int nostation){
    this.mname=mname;
    this.nostation=nostation;

}


Metro(String name, int station, byte lan, int notarin, double speed,String[]feat){
    mname=name;
    nostation=station;
    this.lan=lan;
    this.notrain=notarin;
    this.speed=speed;
    features=feat;
}

void print(){

    System.out.println(mname+"\t"+nostation+"\t"+lan+"\t"+notrain+"\t"+speed+"\t");

    for(int i=0;i<features.length;i++){

        System.out.print(features[i]+"\t");
    }


}

}