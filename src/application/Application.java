package application;

import verwaltung.VerwaltungManager;
import gui.GuiVerwaltung;

/**
 * Created by Jannik on 01.02.2017.
 */
public class Application {

    public static void main(String[] args) {
        VerwaltungManager verwaltungManager = new VerwaltungManager();
        verwaltungManager.fuegeManagerHinzu("Meincrafti");
        verwaltungManager.fuegeManagerHinzu("Mulchian");
        verwaltungManager.fuegeManagerHinzu("Meincrafti");
        GuiVerwaltung guiVerwaltung = new GuiVerwaltung();
        guiVerwaltung.baueGui();

    }

}
