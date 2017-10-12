package Core;

import java.util.ArrayList;

public class GestionEntrainements {
    private static ArrayList<Entrainement> listeEntrainements = new ArrayList<>();

    private static class Entrainement
    {
        private int numero;

    }

    public void initGestionEntrainements()
    {
        listeEntrainements = new ArrayList<>();
    }

    public static void creerEntrainement(int idEntrainement)
    {
        Entrainement e = new Entrainement();
        e.numero = idEntrainement;
        listeEntrainements.add(e);
    }

    public static void requeteMonter(int etage){
        GestionCabines.changerEtageCourant(0,etage);
    }
}
