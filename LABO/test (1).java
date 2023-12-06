public class test {
    public test() {
    }

    public static void main(String[] args) {
        adress a1 = new adress();
        a1.gouvernorat = "tunis";
        a1.ville = "ariana";
        a1.codepostal = 2004;
        System.out.println(a1);
        a1.codepostal = 2074;
        a1.affiche();
        adress a2 = new adress("tunis", "sidibouzid", 9100);
        a2.ville = "sfax";
        a2.affiche();
        recherche ch1 = new recherche();
        ch1.setnom("ali");
        ch1.setpost("mdw");
        ch1.setnumord(55);
        ch1.affiche();
        System.out.println(ch1.toString());
        System.out.println(recherche.nb);
        recherche ch2 = new recherche("ahmed", "resaux", 20);
        if (ch1.comparer(ch2)) {
            System.out.println("cest le meme chercherur");
        }

        recherche[] ch = new recherche[]{ch1, ch2};
        bureau b1 = new bureau(100, "b", ch);
        bureau b2 = new bureau(50, "a", ch);
        bureau[] bt = new bureau[]{b1, b2};
        new laboratoire("l1", "info", bt, a1);
    }
}
