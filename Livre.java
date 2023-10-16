public class Livre {
    String nom,preNom,titre;
    int id;
    static int cont;
    float priX;
    public Livre(String no,String pr,String t,int i,float p, int cont){

        this.nom=no;
        this.preNom=pr;
        this.titre=t;
        this.id=i;
        this.priX=p;
        cont++;


    }
    public Livre(){}
    public static void main(String[] args) {
        Livre l1=new Livre("ali","fOlen","java",100,12,0);
        Livre l2=new Livre();
        l1.affiche();
        System.out.println("nombre livre :"+Livre.cont);


    }


    public void affiche(){
        System.out.println("id="+ this.id+" nom: "+this.nom+" preNom: "+this.preNom+" titre: "+ this.titre+" prix: "+this.priX);

    }
}
