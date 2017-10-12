package Core;

/*
    Class : GestionBouton
    Fonctionnement : Geres l'ensemble des boutons de l'ascenceur
    Auteur: 22/09/2017 Sofian Chaibi
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class GestionBoutons {
    private static ArrayList<Bouton> listeBouton = new ArrayList<>();


    private static class Bouton
    {
        private int numBoutons;
        private int numEtage;
        private boolean estActif;
    }

    public void initGestionBouton()
    {
        listeBouton = new ArrayList<>();
    }

    public static void creerBouton(int idBouton,int idEtage)
    {
        Bouton b = new Bouton();
        b.numBoutons = idBouton;
        b.numEtage= idEtage;
        b.estActif = false;
        listeBouton.add(b);
    }
    public static void notificationPression(int i) {
        //
    }

    /*public  static void activerBouton(int idBouton)
    {
        listeBouton.;
    }
    public static void DesactiverBouton(int idBouton)
    {

    }*/





}
