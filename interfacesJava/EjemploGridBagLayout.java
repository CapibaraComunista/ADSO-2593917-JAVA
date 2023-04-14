import static java.awt.GridBagConstraints.BOTH;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjemploGridBagLayout extends JFrame {
    
    public EjemploGridBagLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("GRID LAYOUT");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout(3,4);
        contenedor.setLayout(capa);

        JPanel principal = new JPanel();
        GridBagLayout capaPrincipal = new GridBagLayout();
        principal.setLayout(capaPrincipal);

        //creamos restricciones de tamaños que ocupara cada elemento 
        GridBagConstraints restriccion = new GridBagConstraints();

        //se aconseja crear cada restriccion despues de crear un campo
        //esto con el fin de no enrredarnos despues 
        JTextArea areaTexto = new JTextArea();
        //indicamos donde van a estar ubicados nuestros elementos
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        //indicamos los tamaños de nuestros elementos
        restriccion.gridwidth = 2;
        restriccion.gridheight = 2;
        //inidicamos como van a crecer nuestros elementos
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        //con el fill inidcamos como queremos distribuir nuestro elemento, en este caso que abarque todo (both)
        restriccion.fill = GridBagConstraints.BOTH;

        principal.add(areaTexto, restriccion);

        JButton btn1 = new JButton("BOTON 1");
        restriccion.gridy = 0;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn1, restriccion);

        JButton btn2 = new JButton("BOTON 2");
        restriccion.gridy = 1;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn2, restriccion);

        JButton btn3 = new JButton("BOTON 3");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.BOTH;
        principal.add(btn3, restriccion);



        JButton btn4 = new JButton("BOTON 4");
        restriccion.gridy = 2;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        principal.add(btn4, restriccion);


        JTextField campo = new JTextField("CAMPO DE TEXTO");
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = BOTH;
        principal.add(campo, restriccion);


        add(principal);
        revalidate();



    }
}
