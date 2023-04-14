import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class EjemploBoxLayout extends JFrame{
    
    public EjemploBoxLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("BOX LAYOUT");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel();
        BoxLayout capa = new BoxLayout(contenedor, BoxLayout.Y_AXIS);
        contenedor.setLayout(capa);

        JLabel etiqueta01 = new JLabel("etiqueta 01");
        JLabel etiqueta02 = new JLabel("etiqueta 02");
        JLabel etiqueta03 = new JLabel("etiqueta 03");
        JLabel etiqueta04 = new JLabel("etiqueta 04");
        JLabel etiqueta05 = new JLabel("etiqueta 05");

        contenedor.add(etiqueta01);
        contenedor.add(etiqueta02);
        contenedor.add(etiqueta03);
        contenedor.add(etiqueta04);
        contenedor.add(etiqueta05);

        add(contenedor);
        revalidate();
    }
}
