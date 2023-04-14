import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario{
    public static void main(String[] args) {
        
        //instanciamos el objeto toolkit que nos proporciona informacion de nuestro
        //disposito y poder asignar valores reales y conformes a el
        Toolkit infoSistema = Toolkit.getDefaultToolkit();
        //instanciamos el objeto dimension que va acorde del toolkit
        Dimension pantalla = infoSistema.getScreenSize();



        int ancho = pantalla.width;
        int alto = pantalla.height;
        //creamos (instanciamos) el objeto jframe 
        JFrame ventana = new JFrame();

        //hacemos visible la ventana
        ventana.setVisible(true);

        //obligamos a un numero flotanteconvertirse en entero con un casting
        //int anchoApp = (int) (ancho*0.50);
        //int altoApp = (int) (alto*0.5);

        //asignamos los valores de nuestra pantallita
        //ventana.setSize( anchoApp, altoApp);
        //creamos un titulo a nuestra pantallita
        ventana.setTitle("INGRESO");
        //con el metodo getResizable(boolean) si se encuentra en true permite mdificar su tamaño 
        //pero si esta en false lo dejara como nosotros le asignasmos
        ventana.setResizable(false);
        //aqui decimos donde queremos que nuestra pantallita aparezca
        //ventana.setLocation(400, 200);
        //con el metodo setlocationrelativeto(component c) si enviamos un valor nulo hara que la 
        //pantalla aparezca en la mitad de nuestra pantalla
        ventana.setLocationRelativeTo(null);

        //este metdodo hace que una ventana se cierre en su totalidad
        //hay 4 tipos, y se usan de igual, llamando al JFrame
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //instanciamos el objeto jpanel 
        JPanel contenedor = new JPanel();
        //instanciamos el objeto gridlayout y podemos escoger el constructor que 
        //deseemos usar 
        GridLayout capa = new GridLayout(3,2);
        //hacemos que la capa se una al contenedor asignandola con setlayout()
        contenedor.setLayout(capa);
        //creamos una margen a nuestro contenedor para que se vea mejor 
        contenedor.setBorder(new EmptyBorder(20,20,20,20));

        //creacion de etiquetas
        JLabel etiquetaUserName = new JLabel("USERNAME:");
        JLabel etiquetaPassword = new JLabel("PASSWORD:");

        
        // creacion campos de texto
        JTextField campoUserName = new JTextField();
        JPasswordField campoPassword = new JPasswordField();


        //creacion de botones

        JButton btnIngresar = new JButton("INGRESAR");
        JButton btnCancelar = new JButton("CANCELAR");


        //agregamos las etiquetas (y el resto de elementos)
        contenedor.add(etiquetaUserName);
        contenedor.add(campoUserName);
        contenedor.add(etiquetaPassword);
        contenedor.add(campoPassword);
        contenedor.add(btnCancelar);
        contenedor.add(btnIngresar);


        //aqui le estamos agregando a la ventana el contender 
        //como si fuera un appenchild (ventana es el padre del contenedor)
        ventana.add(contenedor);

        //usamos el metodo revalidate(), para que la pantalla visualize 
        //los cambios y no toque refrescarla de forma manual
        //ventana.revalidate();

        //el metodo pack(), hace que los elementos se ajusten 
        //a las proporciones reales de su distribucion
        ventana.pack();

        //eventos
        ActionListener eventoIngresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Se hizo clic en el botón ingresar");

                String textoUsuario = campoUserName.getText();
                String passUsuario = campoPassword.getText();

                System.out.println("usuario: "+textoUsuario+" esta en su contrasena: "+passUsuario);
            }
        };

        ActionListener eventoCancelar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se hizo clic en el botón cancelar");
                //el metodo dispose() hace que se cierre la ventana
                ventana.dispose();
            }
        };

        btnIngresar.addActionListener(eventoIngresar);
        btnCancelar.addActionListener(eventoCancelar);
        
        
    }
}