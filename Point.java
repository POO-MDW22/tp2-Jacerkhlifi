public class Point {
    int abs;
    int ord;
    static  int number;
    int numero;
    Point(){
        abs=0;
        ord=0;
        number++;
    }
    void setCoordoneePoint( int u , int v){
        abs=u;
        ord=v;
    }
    void translate( int u , int v){
        abs=abs+u;
        ord=ord+u;
    }
    Void affichePoint() {
        System.out.println("les coordonnees de cette point sont" + ord + "," + abs);
        return null;
    }
    boolean originePoint() {
        return((ord== 0) && (abs== 0));
    }
    boolean egalPoint(Point q){
        return  abs==q.abs && ord==q.ord;
    }
    void autrePoint( Point p){
        abs=p.abs;
        ord=p.ord;
    }
    Point  symetriPoint(){
        Point sp=new Point();
        sp.abs=0-abs;
        sp.ord=0-ord;
        return sp;
    }
}
