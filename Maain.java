public class Maain {
    public static void main(String[] args){
        Point p=new Point();
        Point q=new Point();
        p.setCoordoneePoint(5,8);
        q.setCoordoneePoint(6,9);
        p.affichePoint();
        q.affichePoint();
        if (p.originePoint()){
            System.out.println("le point p est l'origine de repaire");
        }
        else {
            System.out.println("les coordonne du p non null");
        }
        if (p.egalPoint(q)){
            System.out.println("la point p egale la point q");
        }
        else {
            System.out.println("la point p est differente de la point q");
        }
        p.affichePoint();
        Point y=new Point();
        y=p.symetriPoint();
        System.out.println("le semetrie de cette point est"+y.abs+","+y.ord);
        System.out.println("le nombre de point est "+Point.number);
    }
}
