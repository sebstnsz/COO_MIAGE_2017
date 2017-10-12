package Core;

import Enum.*;

/*
    Class : GestionCabine
    Fonctionnement : Geres la cabine
    Auteur: 22/09/2017 Sofian Chaibi
 */

import java.util.ArrayList;

public class GestionCabines {
    private static ArrayList<Cabine> listeCabines = new ArrayList<>();


    private static class Cabine
    {
        private int numero;
        private int numEntrainement;
        private int numPorte;
        private int numeroEtageCourant;
        private EnumEtatCabine EtatCabine; // enum Etat Cabine

    }

    public void initGestionBouton()
    {
        listeCabines = new ArrayList<>();
    }

    public static void creerCabine(int numCabine, int numEntrainement, int numPorte, int numEtageCourant)
    {
        Cabine c = new Cabine();
        c.numero = numCabine;
        c.numEntrainement = numEntrainement;
        c.numPorte = numPorte;
        c.numeroEtageCourant= numEtageCourant;
        c.EtatCabine = EnumEtatCabine.ARRETE_FERME;
        listeCabines.add(c);
    }

    public static EnumEtatCabine getEtatCabine(int i) {
        return listeCabines.get(i).EtatCabine;
    }
    public static int getNumEtageCourant(int i) {
        return listeCabines.get(i).numeroEtageCourant;

    }

    public static void changerEtageCourant(int numeroCabine,int e){
        listeCabines.get(numeroCabine).numeroEtageCourant = e;
        listeCabines.get(numeroCabine).EtatCabine = EnumEtatCabine.EN_MONTEE_FERME;
    }

}
