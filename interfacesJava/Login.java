import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
    
    //Atributos
    private JPanel contenedor;
    private GridLayout capa;
    private JLabel etiquetaUser;
    private JLabel etiquetaPassword;
    private JTextField campoUser;
    private JPasswordField campoPassword;
    private JButton btnIngresar;
    private JButton btnCancelar;

    //Constructor

    // y aqui todo lo de siempre (tambien se pueden colocar los de interfaces, pero solo es un patron de diseño)
    public Login(){

        initComponents();
    }

    //aqui se inicializan todos los valores globales que sean de interfaces (Diseño)
    public void initComponents(){

        setVisible(true);
        setTitle("LOGIN");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        contenedor = new JPanel();
        capa = new GridLayout(3,2);
        contenedor.setLayout(capa);
        contenedor.setBorder(new EmptyBorder(20, 20, 20, 20));

        etiquetaUser = new JLabel("USARIO:");
        etiquetaPassword = new JLabel("CONTRASEÑA:");
        campoUser = new JTextField();
        campoPassword = new JPasswordField();
        btnCancelar = new JButton("CANCELAR");
        btnIngresar = new JButton("INGRESAR");

        contenedor.add(etiquetaUser);
        contenedor.add(campoUser);
        contenedor.add(etiquetaPassword);
        contenedor.add(campoPassword);
        contenedor.add(btnCancelar);
        contenedor.add(btnIngresar);

        add(contenedor);
        pack();

        ActionListener eventoIngresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarDatosSesion();
            }
        };
        btnIngresar.addActionListener(eventoIngresar);

        ActionListener eventoCancelar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               cerrarVentana();
            }
        };
        btnCancelar.addActionListener(eventoCancelar);
    }

    public void validarDatosSesion(){

        String textoUsuario = campoUser.getText();
        String contra = campoPassword.getText();

        System.out.println("--> usuario: "+textoUsuario);
        System.out.println("--> contrasena: "+contra);

    }

    public void cerrarVentana(){
        System.out.println("----cerrando aplicacion----");
        dispose();
    }

}
