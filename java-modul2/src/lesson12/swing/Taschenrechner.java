package lesson12.swing;

import javax.swing.*;

/**
 * Created by MOHCTP on 15.12.2016 Да.
 */
public class Taschenrechner extends JFrame {
    JLabel label1, label2, label3, label4, label5, operatoren;
    JTextField tf11, tf12, tf21, tf22, tf5, tf31, tf32;
    JButton op1, op2, op3, op4, rs;

    Taschenrechner() {
        setTitle("lesson12.swing.Taschenrechner");
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(null); //legt Anordnung der Elemente fest
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(label1 = new JLabel("Bruch1")); //Label erzeugen
        label1.setBounds(40,40,80,20);
        add(label2 = new JLabel("Bruch2")); //Label erzeugen
        label2.setBounds(40,80,80,20);
        add(label3 = new JLabel("Ergebnis")); //Label erzeugen
        label3.setBounds(40,160,80,20);
        add(label4 = new JLabel("Reset")); //Label erzeugen
        label4.setBounds(40,200,80,20);
        add(operatoren = new JLabel("Operatoren")); //Label erzeugen
        operatoren.setBounds(40,120,80,20);
        add(label5 = new JLabel("Ergebnis2")); //Label erzeugen
        label5.setBounds(40,240,80,20);

        add(tf11 = new JTextField(""));
        tf11.setBounds(130,40,80,20);
        add(tf12 = new JTextField(""));
        tf12.setBounds(220,40,80,20);
        add(tf21 = new JTextField(""));
        tf21.setBounds(130,80,80,20);
        add(tf22 = new JTextField(""));
        tf22.setBounds(220,80,80,20);
        add(tf5 = new JTextField(""));
        tf5.setBounds(130,160,170,20);
        add(tf31 = new JTextField(""));
        tf31.setBounds(130,240,80,20);
        add(tf32 = new JTextField(""));
        tf32.setBounds(220,240,80,20);



        add(op1 = new JButton("+"));
        op1.setBounds(130,120,50,20);
        add(op2 = new JButton("-"));
        op2.setBounds(185,120,50,20);
        add(op3 = new JButton("*"));
        op3.setBounds(240,120,50,20);
        add(op4 = new JButton("/"));
        op4.setBounds(295,120,50,20);
        add(rs = new JButton("Reset"));
        rs.setBounds(130,200,100,20);

        op1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                double zahl11, zahl12, zahl21, zahl22, zahl31, zahl32;
                zahl11 = Double.parseDouble(tf11.getText());
                zahl12 = Double.parseDouble(tf12.getText());
                zahl21 = Double.parseDouble(tf21.getText());
                zahl22 = Double.parseDouble(tf22.getText());

                zahl31 = zahl11 * zahl22 + zahl21 * zahl12;
                zahl32 = zahl12 * zahl22;
                double plus = zahl31 / zahl32;

                tf5.setText(plus + "");
                tf31.setText((int)zahl31 + "");
                tf32.setText((int)zahl32 + "");
            }
        });

        op2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                double zahl11, zahl12, zahl21, zahl22, zahl31, zahl32;
                zahl11 = Double.parseDouble(tf11.getText());
                zahl12 = Double.parseDouble(tf12.getText());
                zahl21 = Double.parseDouble(tf21.getText());
                zahl22 = Double.parseDouble(tf22.getText());

                zahl31 = zahl11 * zahl22 - zahl21 * zahl12;
                zahl32 = zahl12 * zahl22;
                double minus = zahl31 / zahl32;

                tf5.setText(minus + "");
                tf31.setText((int)zahl31 + "");
                tf32.setText((int)zahl32 + "");
            }
        });

        op3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                double zahl11, zahl12, zahl21, zahl22, zahl31, zahl32;
                zahl11 = Double.parseDouble(tf11.getText());
                zahl12 = Double.parseDouble(tf12.getText());
                zahl21 = Double.parseDouble(tf21.getText());
                zahl22 = Double.parseDouble(tf22.getText());

                zahl31 = zahl11 * zahl21;
                zahl32 = zahl12 * zahl22;
                double minus = zahl31 / zahl32;

                tf5.setText(minus + "");
                tf31.setText((int)zahl31 + "");
                tf32.setText((int)zahl32 + "");
            }
        });

        op4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                double zahl11, zahl12, zahl21, zahl22, zahl31, zahl32;
                zahl11 = Double.parseDouble(tf11.getText());
                zahl12 = Double.parseDouble(tf12.getText());
                zahl21 = Double.parseDouble(tf21.getText());
                zahl22 = Double.parseDouble(tf22.getText());

                zahl31 = zahl11 * zahl22;
                zahl32 = zahl12 * zahl21;
                double minus = zahl31 / zahl32;

                tf5.setText(minus + "");
                tf31.setText((int)zahl31 + "");
                tf32.setText((int)zahl32 + "");
            }
        });

        rs.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf11.setText("1");
                tf12.setText("3");
                tf21.setText("1");
                tf22.setText("2");

            }
        });

    }

    public static void main(String[] args) {
        new Taschenrechner();
    }
}
