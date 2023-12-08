public class cuillere extends Ustensile{
        private double Longueur;
        public cuillere(int anneefabrication,double Longueur) {
            super(anneefabrication);
            this.Longueur = Longueur;
        }public double getLongueur() {
                return Longueur;
            }

    public void setLongeur(double longeur) {
        this.Longueur= longeur;
    }
    public String toString() {
        return "lannee de fabrication est"+get_annneefabrication()+"la longuer est"+this.Longueur;
    }
}
