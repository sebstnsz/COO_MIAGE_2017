package Core;


import java.util.ArrayList;
import Enum.*;

public class GestionPortes {

    private static ArrayList<Porte> listePortes = new ArrayList<>();

    private static class Porte
    {
        private int numero;
        private EnumEtatOuverture etatOuverture; // enum Etat Ouverture
        private EnumTypePorte TypePorte ; // enum Type Porte
        private int numEtagePorte;
        private int numCabinePorte;
    }

    public void initGestionBouton()
    {
        listePortes = new ArrayList<>();
    }

    public static void creerPorte(int idPorte,int idEtage, int numCabine)
    {
        Porte p = new Porte();
        p.numero = idPorte;
        p.numEtagePorte= idEtage;
       // p.TypePorte = typeporte;
        p.numCabinePorte= numCabine;
        p.etatOuverture = EnumEtatOuverture.FERMER;
        listePortes.add(p);
    }
}
