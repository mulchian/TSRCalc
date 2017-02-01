package verwaltung;

import java.util.ArrayList;

/**
 * Created by Jannik on 01.02.2017.
 */
public class VerwaltungManager {

    private static ArrayList<String> arrayManager = new ArrayList<String>();

    public void fuegeManagerHinzu(String strManager) {

        boolean istBereitsInDerListe = false;

        for (String str : arrayManager) {
            if (strManager == str) {
                istBereitsInDerListe = true;
            }
        }

        if (!istBereitsInDerListe) {
            arrayManager.add(strManager);
        }
    }

    public ArrayList<String> bekommeManagerliste() {
        return arrayManager;
    }

}
