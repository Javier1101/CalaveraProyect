package literaria;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CalaveraLiteraria extends JFrame {

    public JPanel panel;

    public CalaveraLiteraria() {
        setSize(385, 500);
        setTitle("Calaverita Literaria");// Titulo de la ventana
        setLayout(null);
        iniciarComponentes();
        setLocationRelativeTo(null);//estableccemos la ventana en el centro de la pantalla
        //this.getContentPane().setBackground(Color.ORANGE);

    }

    private void iniciarComponentes() {

        /*private void colocarPaneles() {
        panel = new JPanel();//Creacion de un panel
        this.getContentPane().add(panel);
        colorcarEtiquetas();
        panel.setVisible(true);
    }*/
        //panel.setBackground(Color.BLACK);//Color al panel
        JLabel etiqueta = new JLabel("Tayler feliz sonreia\n"
                + "queriendo la escula disfrutar\n"
                + "mas la calaca en la mira le tenia\n"
                + "ya se lo queria llevar\n"
                + "\n"
                + "De nada sirvio su llanto\n"
                + "ni sus suplicas de piedad\n"
                + "la calaca se la echo en el manto\n"
                + "porque todas las materia reprobaba ya\n"
                + "");//Etiqueta
        //panel.add(etiqueta);

        etiqueta.setBounds(10, 100, 365, 280);
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.WHITE); //2stablecenos el
        etiqueta.setOpaque(true); //Establecenos pintar el fond
        etiqueta.setBackground(Color.BLACK); //cambianos eb co!
        etiqueta.setFont(new Font("chiller", 0, 30));
        //panel.add(etiqueta); //agr Sy ariqueta 42 nape
        //etiqueta tipo imagen
        etiqueta.setVisible(false);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setIcon(new ImageIcon("calavera1.jpg"));
        //panel.add(etiqueta2);
        etiqueta2.setBounds(10, 10, 400, 200);
        etiqueta2.setVisible(false);

        JButton boton1 = new JButton();
        boton1.setText("Puchale"); //establecemos un texto al boton
        boton1.setBounds(120, 400, 150, 40);
        //boton1.setEnabled(true); //establecemos el encendido al boton
        boton1.setMnemonic('a'); //alt + a para iniciar el boton
        boton1.setForeground(Color.RED);//color de la letra
        boton1.setFont(new Font("cooper black", 3, 20));
        boton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                etiqueta.setVisible(true);
                etiqueta2.setVisible(true);

            }
        });

        //add(panel);
        add(etiqueta);
        add(etiqueta2);
        add(boton1);

    }

}
