import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjemploGridlayout extends JFrame{
    
    public EjemploGridlayout(){
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

        //creando arreglos de jtextfield
        JTextField arregloImputs [] = new JTextField [12];

        //intanciando las posiciones del arreglo con el objeto jtextfield
        for (int i = 0; i < arregloImputs.length; i++) {
            //se crea una instancia de cada uno de los objetos
            arregloImputs[i] = new JTextField();
        }

        //asignar cada input en el contendedor, (tambien se puede hacer en el anterior for)
        for (int i = 0; i < arregloImputs.length; i++) {
            contenedor.add(arregloImputs[i]);
        }

        add(contenedor);
        revalidate();

        

    }
}
