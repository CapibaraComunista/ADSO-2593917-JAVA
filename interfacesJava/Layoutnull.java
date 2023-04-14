import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layoutnull extends JFrame{
    
    public Layoutnull(){

        initComponents();
    }

    public void initComponents(){

        setVisible(true);
        setSize(400, 500);
        setTitle("NULL LAYOUT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(null);


        JButton btn = new JButton("HOLA MUNDO");
        contenedor.add(btn);
        btn.setBounds(100, 100, 400, 100);

        add(contenedor);
        revalidate();
    }
}
