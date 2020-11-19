package lesson12.swing.spielhalle;

/**
 * Created by MOHCTP on 18.01.2017 Да.
 */

import javax.swing.*;
import java.awt.*;

public class Spieltisch_wuerfel extends JFrame {

    JButton werfe;  // button
    int zaehler = 0;
    int pashzaehler = 0;
    int zaehler6 = 0;
    JLabel label1, label2, label3, label4, label5;
    JTextField tf2, tf3, tf4, tf5;

    Spieltisch_wuerfel() {
        setTitle("WürfelSpiel"); //Überschrift
        setSize(800,500); //Fenstergröße
        setLocationRelativeTo(null); //Fenster mittig setzen
//		setLayout(new FlowLayout()); //legt Anordnung der Elemente fest
        setLayout(null); //legt Anordnung der Elemente fest
        setVisible(true); //Fenster anzeigen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //	font schrift = new Font("arial", Font.BOLD)


        add(werfe = new JButton("Werfe"));  // button jframe hinzugefügt
        werfe.setBounds(200, 400, 200, 30); //ort und grössen

        add(label1 = new JLabel("Statistik")); //Label erzeugen
        label1.setBounds(40,230,160,20);
        add(label2 = new JLabel("Versuche")); //Label erzeugen
        label2.setBounds(40,260,160,20);
        add(label3 = new JLabel("Pasch")); //Label erzeugen
        label3.setBounds(40,290,160,20);
        add(label4 = new JLabel("Pasch-Wahrscheinlichkeit (%)")); //Label erzeugen
        label4.setBounds(40,320,180,20);
        add(label5 = new JLabel("Wahrscheinlichkeit 6/6 (%)")); //Label erzeugen
        label5.setBounds(40,350,160,20);

        add(tf2 = new JTextField("Textfeld1"));
        tf2.setBounds(230,260,80,20);
        add(tf3 = new JTextField("Textfeld1"));
        tf3.setBounds(230,290,80,20);
        add(tf4 = new JTextField("Textfeld1"));
        tf4.setBounds(230,320,80,20);
        add(tf5 = new JTextField("Textfeld1"));
        tf5.setBounds(230,350,80,20);

        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");

        werfe.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Graphics g = getGraphics();
                paintwurf(g);
                zaehler++;
                // System.out.println(zaehler);
                tf2.setText(String.valueOf(zaehler));
                tf3.setText(String.valueOf(pashzaehler));
                tf4.setText(String.valueOf(100*pashzaehler/zaehler));
                if(zaehler6==0)
                    tf5.setText("0");
                else tf5.setText(String.valueOf(100 * zaehler6 / zaehler));


            }
        });

    }

    public void paintwurf(Graphics g) {
        g.clearRect(400,0,400,500);
        int x = 400, y = 100, oval = 15, schrit =30;
        int a = 600, b = 100;
        int z1 = (int) (Math.random()*6+1);
        int z2 = (int) (Math.random()*6+1);

        if(z1==z2){
            pashzaehler++;
            g.setColor(Color.red);
            Font schrift = new Font("Arial", Font.BOLD,50);
            g.setFont(schrift);
            String pz = "Pasch" + pashzaehler;
            g.drawString(pz, 500, 300);
            if(z1==6){
                zaehler6++;}
        }
        {
            g.setColor(Color.blue);
            Font schrift2 = new Font("Arial", Font.BOLD,20);
            g.setFont(schrift2);
            g.drawString((String.valueOf(zaehler)), 550, 350);
        }


        switch(z1){
            case 1: {
                g.setColor(Color.RED);
                g.drawRect (x, y, 120, 120);
                g.fillOval(x - 5 + 2*schrit, y + 2*schrit, oval, oval);
                break;
            }

            case 2: {
                g.setColor(Color.CYAN);
                g.drawRect (x, y, 120, 120);
                g.fillOval(x + schrit, y + schrit, oval, oval);
                g.fillOval(x - 10  + 3*schrit, y + 3*schrit, oval, oval);
                break;
            }

            case 3: {
                g.setColor(Color.black);
                g.drawRect (x, y, 120, 120);
                g.fillOval(x + schrit, y + schrit, oval, oval);
                g.fillOval(x - 10  + 3*schrit, y + 3*schrit, oval, oval);
                g.fillOval(x - 5 + 2*schrit, y + 2*schrit, oval, oval);
                break;
            }

            case 4: {
                g.setColor(Color.blue);
                g.drawRect (x, y, 120, 120);
                g.fillOval(x + schrit, y + schrit, oval, oval);
                g.fillOval(x + schrit, y + 3*schrit, oval, oval);
                g.fillOval(x - 10 + 3*schrit, y + schrit, oval, oval);
                g.fillOval(x - 10  + 3*schrit, y + 3*schrit, oval, oval);
                break;
            }

            case 5: {
                g.setColor(Color.green);
                g.drawRect (x, y, 120, 120);
                g.fillOval(x + schrit, y + schrit, oval, oval);
                g.fillOval(x + schrit, y + 3*schrit, oval, oval);
                g.fillOval(x - 10 + 3*schrit, y + schrit, oval, oval);
                g.fillOval(x - 10  + 3*schrit, y + 3*schrit, oval, oval);
                g.fillOval(x - 5 + 2*schrit, y + 2*schrit, oval, oval);
                break;
            }

            case 6: {
                g.setColor(Color.magenta);
                g.drawRect (x, y, 120, 120);
                g.fillOval(x + schrit, y + schrit, oval, oval);
                g.fillOval(x + schrit, y + 2*schrit, oval, oval);
                g.fillOval(x + schrit, y + 3*schrit, oval, oval);

                g.fillOval(x - 10 + 3*schrit, y + schrit, oval, oval);
                g.fillOval(x - 10  + 3*schrit, y + 2*schrit, oval, oval);
                g.fillOval(x - 10  + 3*schrit, y + 3*schrit, oval, oval);
                break;
            }
        }

        switch(z2){
            case 1: {
                g.setColor(Color.RED);
                g.drawRect (a, b, 120, 120);
                g.fillOval(a - 5 + 2*schrit, b + 2*schrit, oval, oval);
                break;
            }

            case 2: {
                g.setColor(Color.cyan);
                g.drawRect (a, b, 120, 120);
                g.fillOval(a + schrit, b + schrit, oval, oval);
                g.fillOval(a - 10  + 3*schrit, b + 3*schrit, oval, oval);
                break;
            }

            case 3: {
                g.setColor(Color.black);
                g.drawRect (a, b, 120, 120);
                g.fillOval(a + schrit, b + schrit, oval, oval);
                g.fillOval(a - 10  + 3*schrit, b + 3*schrit, oval, oval);
                g.fillOval(a - 5 + 2*schrit, b + 2*schrit, oval, oval);
                break;
            }

            case 4: {
                g.setColor(Color.blue);
                g.drawRect (a, b, 120, 120);
                g.fillOval(a + schrit, b + schrit, oval, oval);
                g.fillOval(a + schrit, b + 3*schrit, oval, oval);
                g.fillOval(a - 10 + 3*schrit, b + schrit, oval, oval);
                g.fillOval(a - 10  + 3*schrit, b + 3*schrit, oval, oval);
                break;
            }

            case 5: {
                g.setColor(Color.GREEN);
                g.drawRect (a, b, 120, 120);
                g.fillOval(a + schrit, b + schrit, oval, oval);
                g.fillOval(a + schrit, b + 3*schrit, oval, oval);
                g.fillOval(a - 10 + 3*schrit, b + schrit, oval, oval);
                g.fillOval(a - 10  + 3*schrit, b + 3*schrit, oval, oval);
                g.fillOval(a - 5 + 2*schrit, b + 2*schrit, oval, oval);
                break;
            }

            case 6: {
                g.setColor(Color.MAGENTA);
                g.drawRect (a, b, 120, 120);
                g.fillOval(a + schrit, b + schrit, oval, oval);
                g.fillOval(a + schrit, b + 2*schrit, oval, oval);
                g.fillOval(a + schrit, b + 3*schrit, oval, oval);

                g.fillOval(a - 10 + 3*schrit, b + schrit, oval, oval);
                g.fillOval(a - 10  + 3*schrit, b + 2*schrit, oval, oval);
                g.fillOval(a - 10  + 3*schrit, b + 3*schrit, oval, oval);
                break;
            }
        }



    }


    public static void main(String[] args) {
        new Spieltisch_wuerfel();
    }

}
