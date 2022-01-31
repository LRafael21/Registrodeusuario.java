import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class registro {
    public static void main(String[] args) {
        
        //------------Botones-------------//
        JButton NuevoButton = new JButton();
        JButton GuardarButton = new JButton();
        JButton EliminarButton = new JButton();
        JButton LupaButton = new JButton();

        //------------------Fields------------------//
                     //Campos de texto\\
        JTextField userIDField = new JTextField();
        JTextField userAliasField = new JTextField();
        JTextField userNombresField= new JTextField();
        JPasswordField userClaveField = new JPasswordField();
        JPasswordField userConfirmarClaveField = new JPasswordField();
        JTextField userCostoXHoraField = new JTextField();
        JTextField userEmailField = new JTextField();

        // -----------------Labels------------------//
                  //Etiquetas de texto(Letras)\\
        JLabel userIDLabel = new JLabel("ID:");
        JLabel userClaveLabel = new JLabel("Clave:");
        JLabel userAliasLabel = new JLabel("Alias:");
        JLabel userNombresLabel = new JLabel("Nombres:");
        JLabel userNivelLabel = new JLabel("Nivel");
        JLabel userActivoLabel = new JLabel("Activo");
        JLabel userConfirmarClaveLabel = new JLabel("Confirmar Clave:");
        JLabel userCostoXHoraLabel = new JLabel("Costo x Hora:");
        JLabel userEmailLabel = new JLabel("Email:");

                    //-----Array ComboBox------// 
                        //Menu Desplegable\\
        String [] accesos = {"Administrador","user","nuevo","invitado"};
        JComboBox<String> userNivelCombo = new JComboBox<>(accesos);

             //-----CheckBox-----//
                  //CheckMark\\
        JCheckBox userActivo = new JCheckBox();

        
        //------------------Imagenes-------------------//
                           //Iconos\\
        ImageIcon logo = new ImageIcon("users.png");
        ImageIcon iconoNuevo = new ImageIcon("nuevo.png");
        ImageIcon iconoGuardar = new ImageIcon("guardar.png");
        ImageIcon iconoEliminar = new ImageIcon("eliminar.png");     
        ImageIcon iconoLupa = new ImageIcon("lupa.png");   
       
                //Interfaz//
        JFrame interfaz = new JFrame(); 
        interfaz.setTitle("Registro de Usuarios"); 
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaz.setResizable(false); 
        interfaz.setSize(635,290); 
        interfaz.setLayout(null);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true); 

        //-------Bounds de los Labels--------//
        userIDLabel.setBounds(44,20,300,25);
        userAliasLabel.setBounds(42, 60, 300, 25);
        userNombresLabel.setBounds(40, 100, 300, 25);
        userClaveLabel.setBounds(42,140,300,25);
        userConfirmarClaveLabel.setBounds(210, 140, 300, 25);
        userCostoXHoraLabel.setBounds(415, 140,300,25);
        userEmailLabel.setBounds(280, 100, 300, 25);
        userNivelLabel.setBounds(460, 60, 300, 25);
        userActivoLabel.setBounds(560, 18, 300, 25);

        //-------Bounds de los Fields-----------//
        userIDField.setBounds(100,21,100,25);
        userAliasField.setBounds(100, 60, 175, 25);
        userNombresField.setBounds(100, 100, 175, 25);
        userClaveField.setBounds(100,140,100,25);
        userConfirmarClaveField.setBounds(310, 140, 100, 25);
        userCostoXHoraField.setBounds(500, 140, 100, 25);
        userEmailField.setBounds(320, 100, 225, 25);

        //-------Bounds del ComboBox-----------//
        userNivelCombo.setBounds(500, 60, 115, 25);

        //-------Bounds del CheckBox-----------//
        userActivo.setBounds(535, 20, 20, 20);

        //-------Icono de la aplicacion--------//
        interfaz.setIconImage(logo.getImage());
        
        // -------Bounds de los Botones-------//
        NuevoButton.setBounds(125,175,100,65);
        NuevoButton.setIcon(iconoNuevo);
        NuevoButton.setFocusable(false);
        
        GuardarButton.setBounds(250,175,100,65);
        GuardarButton.setIcon(iconoGuardar);
        GuardarButton.setFocusable(false);

        EliminarButton.setBounds(375,175,100,65);
        EliminarButton.setIcon(iconoEliminar);
        EliminarButton.setFocusable(false);

        LupaButton.setBounds(205, 20,25,25);
        LupaButton.setIcon(iconoLupa);
        LupaButton.setFocusable(false);

        //-------Agregar a la interfaz-------//
        interfaz.add(userIDLabel);
        interfaz.add(userAliasLabel);
        interfaz.add(userNombresLabel);
        interfaz.add(userConfirmarClaveLabel);
        interfaz.add(userCostoXHoraLabel);
        interfaz.add(userEmailLabel);

        interfaz.add(userNivelLabel);
        interfaz.add(userActivoLabel);

        interfaz.add(userClaveLabel);

        interfaz.add(userIDField);
        interfaz.add(userAliasField);
        interfaz.add(userNombresField);
        interfaz.add(userConfirmarClaveField);
        interfaz.add(userCostoXHoraField);
        interfaz.add(userEmailField);
        interfaz.add(userClaveField);

        interfaz.add(userNivelCombo);
        interfaz.add(userActivo);

        interfaz.add(NuevoButton);
        interfaz.add(GuardarButton);
        interfaz.add(EliminarButton);
        interfaz.add(LupaButton);

  
		    // -------Color de fondo de la aplicacion--------//
        interfaz.getContentPane().setBackground(new Color(182, 200,200));

	}	

}
