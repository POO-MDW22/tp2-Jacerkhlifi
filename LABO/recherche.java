public class recherche {
    private String nom;
    private String post;
    private int numord;
    static int nb;
    public recherche(){nb++;}
    public recherche (String n,String p,int no){
        this.nom=n;
        this.post=p;
        this.numord=no;
        nb++;
    }
    public void setnom(String n){
        this.nom=n;
    }
    public String getnom(){
        return this.nom;
    }
    public void setpost(String p){
        this.post=p;
    }
    public String getpost(){
        return this.post;
    }
    public void setnumord(int o){
        this.numord=o;
    }
    public int getnumord(){
        return this.numord;
    }
    public void affiche(){
        System.out.println("le nom est:"+this.nom+"la post est:"+this.post+"le num de machine est:"+this.numord);
    }
    public String toString(){
        return ("le nom est:"+this.nom+"la post est:"+this.post+"le num de machine est:"+this.numord);
    }
    public boolean comparer(recherche ch){
        return (this.nom==ch.nom)&&(this.numord==ch.numord)&&(this.post==ch.post);
    }
}
