import java.util.Scanner;

public class collection {

 private final static int CURRENT_YEAR = 2009;

 public static void main(String[] Args) {
  Scanner scanner = new Scanner(System.in);

  Ustensile[] us = new Ustensile[5];

  for (int i = 0; i < us.length; i++) {
   System.out.println("Entrez l'année de fabrication de l'ustensile " + (i + 1) + " : ");
   int anneeFabrication = scanner.nextInt();

   if (i % 2 == 0) {
    System.out.println("Entrez le rayon de l'assiette ronde " + (i / 2 + 1) + " : ");
    double rayon = scanner.nextDouble();
    us[i] = new AssietteRonde(anneeFabrication, rayon);
   } else {
    System.out.println("Entrez la longueur de la cuillère " + (i / 2 + 1) + " : ");
    double longueur = scanner.nextDouble();
    us[i] = new cuillere(anneeFabrication, longueur);
   }
  }

  afficherCuilleres(us);
  afficherSurfaceAssiettes(us);
  afficherValeurTotale(us);


 }

 static void afficherCuilleres(Ustensile[] us) {
  int nbCuilleres = 0;
  for (Ustensile u : us) {
   if (u instanceof cuillere) {
    nbCuilleres++;
   }
  }
  System.out.println("Il y a " + nbCuilleres + " cuillères.");
 }

 static void afficherSurfaceAssiettes(Ustensile[] us) {
  double somme = 0;
  for (Ustensile u : us) {
   if (u instanceof Assiette) {
    somme = somme + ((Assiette) u).calculesurface();
   }
  }
  System.out.println("Surface totale des assiettes : " + somme);
 }

 static void afficherValeurTotale(Ustensile[] us) {
  double somme = 0;
  for (Ustensile u : us) {
   somme = somme + u.calculevaleur(CURRENT_YEAR);
  }
  System.out.println("Valeur totale de la collection : " + somme);
 }
}
