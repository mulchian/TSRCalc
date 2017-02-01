package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

import verwaltung.VerwaltungManager;

/**
 * Created by Jannik on 01.02.2017.
 */
public class GuiRennergebnis implements ActionListener, KeyListener {

    private JPanel jPanel = new JPanel();
    private VerwaltungManager verwaltManager = new VerwaltungManager();

    private JLabel lblSaison = new JLabel("Saison: ");
    private JLabel lblRennen = new JLabel("Rennen: ");
    private JLabel lblPlatz1 = new JLabel("Platz 1: ");
    private JLabel lblPlatz2 = new JLabel("Platz 2: ");
    private JLabel lblPlatz3 = new JLabel("Platz 3: ");
    private JLabel lblPlatz4 = new JLabel("Platz 4: ");
    private JLabel lblPlatz5 = new JLabel("Platz 5: ");
    private JLabel lblPlatz6 = new JLabel("Platz 6: ");
    private JLabel lblPlatz7 = new JLabel("Platz 7: ");
    private JLabel lblManager = new JLabel("Manager: ");
    private JLabel lblNeuerManger = new JLabel("neuer Manager");

    private JTextField txfSaison = new JTextField();
    private JTextField txfRennen = new JTextField();
    private JTextField txfManager = new JTextField();

    private JButton btnManagerHinzufuegen = new JButton("Manager hinzufügen");

    private JSpinner spnManager1 = new JSpinner(new SpinnerListModel(verwaltManager.bekommeManagerliste()));
    private JSpinner spnManager2 = new JSpinner(new SpinnerListModel(verwaltManager.bekommeManagerliste()));
    private JSpinner spnManager3 = new JSpinner(new SpinnerListModel(verwaltManager.bekommeManagerliste()));
    private JSpinner spnManager4 = new JSpinner(new SpinnerListModel(verwaltManager.bekommeManagerliste()));
    private JSpinner spnManager5 = new JSpinner(new SpinnerListModel(verwaltManager.bekommeManagerliste()));
    private JSpinner spnManager6 = new JSpinner(new SpinnerListModel(verwaltManager.bekommeManagerliste()));
    private JSpinner spnManager7 = new JSpinner(new SpinnerListModel(verwaltManager.bekommeManagerliste()));

    public JPanel baueGui() {

        jPanel.setSize(550, 450);
        jPanel.setLayout(null);

        lblSaison.setBounds(25, 50, 70, 20);
        lblRennen.setBounds(25, 75, 70, 20);
        lblPlatz1.setBounds(25, 100, 70, 20);
        lblPlatz2.setBounds(25, 125, 70, 20);
        lblPlatz3.setBounds(25, 150, 70, 20);
        lblPlatz4.setBounds(25, 175, 70, 20);
        lblPlatz5.setBounds(25, 200, 70, 20);
        lblPlatz6.setBounds(25, 225, 70, 20);
        lblPlatz7.setBounds(25, 250, 70, 20);
        lblNeuerManger.setBounds(300, 50, 100, 20);
        lblManager.setBounds(275, 75, 70, 20);

        txfSaison.setBounds(100, 50, 130, 20);
        txfRennen.setBounds(100, 75, 130, 20);
        spnManager1.setBounds(100, 100, 130, 20);
        spnManager2.setBounds(100, 125, 130, 20);
        spnManager3.setBounds(100, 150, 130, 20);
        spnManager4.setBounds(100, 175, 130, 20);
        spnManager5.setBounds(100, 200, 130, 20);
        spnManager6.setBounds(100, 225, 130, 20);
        spnManager7.setBounds(100, 250, 130, 20);
        txfManager.setBounds(350, 75, 130, 20);

        btnManagerHinzufuegen.setBounds(300, 100, 150, 20);

        txfSaison.addKeyListener(this);
        txfRennen.addKeyListener(this);
        btnManagerHinzufuegen.addActionListener(this);

        jPanel.add(lblSaison);
        jPanel.add(lblRennen);
        jPanel.add(lblPlatz1);
        jPanel.add(lblPlatz2);
        jPanel.add(lblPlatz3);
        jPanel.add(lblPlatz4);
        jPanel.add(lblPlatz5);
        jPanel.add(lblPlatz6);
        jPanel.add(lblPlatz7);
        jPanel.add(lblNeuerManger);
        jPanel.add(lblManager);

        jPanel.add(txfSaison);
        jPanel.add(txfRennen);
        jPanel.add(spnManager1);
        jPanel.add(spnManager2);
        jPanel.add(spnManager3);
        jPanel.add(spnManager4);
        jPanel.add(spnManager5);
        jPanel.add(spnManager6);
        jPanel.add(spnManager7);
        jPanel.add(txfManager);

        jPanel.add(btnManagerHinzufuegen);

        return jPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnManagerHinzufuegen) {
            verwaltManager.fuegeManagerHinzu(txfManager.getText());
            txfManager.setText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

