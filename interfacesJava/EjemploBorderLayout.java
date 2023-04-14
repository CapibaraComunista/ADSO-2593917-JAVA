import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EjemploBorderLayout extends JFrame {

    public EjemploBorderLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("BORDER LAYOUT");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);

        JLabel etiquetaS = new JLabel("etiqueta S", SwingConstants.CENTER);
        //para darle color de fondo a las etiquetas toca asignarles una opacidad
        etiquetaS.setOpaque(true);
        //una vez asignada podemos darle un color
        etiquetaS.setBackground(Color.red);

        JLabel etiquetaI = new JLabel("etiqueta I");
        JLabel etiquetaC = new JLabel("etiqueta C", SwingConstants.CENTER);
        JLabel etiquetaD = new JLabel("etiqueta D");
        JLabel etiquetaIn = new JLabel("etiqueta In", SwingConstants.CENTER);

        contenedor.add(etiquetaS, BorderLayout.NORTH);
        contenedor.add(etiquetaIn, BorderLayout.SOUTH);
        contenedor.add(etiquetaI, BorderLayout.WEST);
        contenedor.add(etiquetaD, BorderLayout.EAST);
        contenedor.add(etiquetaC, BorderLayout.CENTER);

        add(contenedor);
        revalidate();
        
    }
}
