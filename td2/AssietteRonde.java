public class AssietteRonde extends Assiette{
    private double rayon;
    public AssietteRonde(int anneefabrication,double rayon) {
        super(anneefabrication);
        this.rayon = rayon;
    }
        public double getrayon(){
        return rayon;
        }
        public double calculesurface(){
        return 3.14*getrayon()*getrayon();
        }
    public String toString() {
        return "L'année de fabrication est " + get_annneefabrication() + ". Le rayon est " + this.rayon;
    }    public void setRrayon(double rayon) {
        this.rayon = rayon;
    }













}
