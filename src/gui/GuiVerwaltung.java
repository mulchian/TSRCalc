package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 * Created by Jannik on 01.02.2017.
 */
public class GuiVerwaltung {

    private JFrame jFrame = new JFrame("The sudden Race Calculator");
    private GuiRennergebnis guiRennergebnis = new GuiRennergebnis();

    public void baueGui() {

        jFrame.setSize(600, 500);
        jFrame.setLayout(null);

        JTabbedPane jTabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);

        jTabbedPane.addTab("Rennergebnis", guiRennergebnis.baueGui());

        jTabbedPane.setBounds(5, 5, 550, 450);

        jFrame.add(jTabbedPane);
        jFrame.setMinimumSize(new Dimension(560, 460));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

}
