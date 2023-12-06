public class adress {
    public String ville;
    public String gouvernorat;
    public int codepostal;
    public adress(){}
    public adress (String g,String v,int c){
        this.gouvernorat=g;
        this.ville=v;
        this.codepostal=c;
    }
    public void affiche(){
        System.out.println("la ville est:"+this.ville+"gouvernorat est:"+this.gouvernorat+"le code postale est:"+this.codepostal);
    }
    public String toString(){
        return ("gouvernorat:"+this.gouvernorat+"ville est:"+this.ville+"codepostale est:"+this.codepostal);
    }
}
