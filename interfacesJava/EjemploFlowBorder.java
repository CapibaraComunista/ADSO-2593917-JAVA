import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;


public class EjemploFlowBorder extends JFrame{
    
    public EjemploFlowBorder(){
        initComponents();
    }

    public void initComponents(){

        setTitle("BORDER Y FLOW LAYOUT");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);

        JButton btn1 = new JButton("BOTON 1");
        JButton btn2 = new JButton("BOTON 2");
        JButton btn3 = new JButton("BOTON 3");

        JPanel contenedorCentro = new JPanel();
        FlowLayout capaCentro = new FlowLayout();
        contenedorCentro.setLayout(capaCentro);

        contenedorCentro.add(btn1);
        contenedorCentro.add(btn2);

        contenedor.add(contenedorCentro, BorderLayout.CENTER);
        contenedor.add(btn3, BorderLayout.SOUTH);

        add(contenedor);
        pack();
    }
}
