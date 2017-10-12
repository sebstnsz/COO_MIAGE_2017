package Core;

import java.util.ArrayList;

/*
    Class : GestionEtages
    Fonctionnement : Geres l'ensemble des Etages
    Auteur: 22/09/2017 Sofian Chaibi
 */
public class GestionEtages {

    private static ArrayList<Etage> listeEtages = new ArrayList<>();

    private static class Etage
    {
        private int numero;
        private int numBouton;
        private int numCabine;
        private static int nombreEtage=0;
        private boolean estEnService;

    }

    public void initGestionEtages()
    {
        listeEtages = new ArrayList<>();
    }

    public static void creerEtage(int idEtage,int numBouton, int numCabine)
    {
        Etage e = new Etage();
        e.numero = idEtage;
        e.numBouton= numBouton;
        e.numCabine = numCabine;
        listeEtages.add(e);
    }
}
