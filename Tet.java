public class Tet {  public static void main(String[] args) {
    Livre l1=new Livre("ali","fOlen","java",100,12,0);
    Livre l2=new Livre();
    System.out.println("id="+ l1.id+" nom: "+ l1.nom+" preNom: "+ l1.preNom+" titre: "+ l1.titre+" prix: "+ l1.priX);
    System.out.println("nombre des livre :"+Livre.cont);
}
}
