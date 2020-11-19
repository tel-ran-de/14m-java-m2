package lesson12.swing;

/**
 * Created by MOHCTP on 23.01.2017 Да.
 */


import javax.swing.*;
import java.awt.*;

public class ZahlenSystemConverter extends JFrame {

    JLabel label1, label2;
    JTextField tf1, tf2, tf3;
    JButton bt1;

    ZahlenSystemConverter() {

        setTitle("Umrechnung von Zahlensystemen"); //Überschrift
        setSize(300, 200); //Fenstergröße
        setLocationRelativeTo(null); //Fenster mittig setzen
//		setLayout(new FlowLayout()); //legt Anordnung der Elemente fest
        setLayout(null); //legt Anordnung der Elemente fest
        //getContentPane().setBackground(Color.MAGENTA); //Farbiges Fenster
        getContentPane().setBackground(new Color(0,200,0));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); //Fenster anzeigen

        add(label1 = new JLabel("Dezimalzahl")); //Label erzeugen
        label1.setBounds(40,30,80,20);
        add(label2 = new JLabel("Basis")); //Label erzeugen
        label2.setBounds(40,60,80,20);
        add(tf1 = new JTextField(" "));
        tf1.setBounds(140,30,80,20);
        add(tf2 = new JTextField(" "));
        tf2.setBounds(140,60,80,20);
        add(bt1 = new JButton("Rechne"));
        bt1.setBounds(40,100,80,20);
        add(tf3 = new JTextField(" "));
        tf3.setBounds(140,100,80,20);

        tf1.setText("");
        tf2.setText("");
        tf3.setText("");

        bt1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                int basis; // basis von 2 bis 16
                int dzahl; // dezimalzahl
                int modulovariable; // modulo
                String ergebnis = " ";

                dzahl = Integer.parseInt(tf1.getText());
                basis = Integer.parseInt(tf2.getText());

                while (dzahl>0) {
                    modulovariable = dzahl % basis;
                    String modulostring = String.valueOf(modulovariable);
                    dzahl = dzahl/basis;

                    switch (modulovariable) {
                        case 10:
                            modulostring = "A";
                            break;
                        case 11:
                            modulostring = "B";
                            break;
                        case 12:
                            modulostring = "C";
                            break;
                        case 13:
                            modulostring = "D";
                            break;
                        case 14:
                            modulostring = "E";
                            break;
                        case 15:
                            modulostring = "F";
                            break;
                        default:
                            break;
                    }
                    ergebnis = modulostring + ergebnis;
                }


                tf3.setText(ergebnis); //Wert ins Textfeld schreien
            }
        });

    }

    public static void main(String[] args) {
        new ZahlenSystemConverter();
    }
}
