package erronka2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OngiEtorriPantalla {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OngiEtorriPantalla window = new OngiEtorriPantalla();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public OngiEtorriPantalla() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setUndecorated(true);
        frame.getContentPane().setLayout(null);

        JLabel lblBackground = new JLabel();
        lblBackground.setBounds(0, 11, 800, 600);
        lblBackground.setIcon(new ImageIcon("background.jpg")); // Replace with the path to your image
        frame.getContentPane().add(lblBackground);

        JButton btnContinuar = new JButton("Continuar");
        btnContinuar.setFont(new Font("Arial", Font.PLAIN, 18));
        btnContinuar.setBounds(325, 300, 150, 50);
        lblBackground.add(btnContinuar);
        
                JLabel lblBienvenida = new JLabel("ONGI ETORRIIII!!!");
                frame.getContentPane().add(lblBienvenida);
                lblBienvenida.setFont(new Font("Arial", Font.BOLD, 24));
                lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
                lblBienvenida.setBounds(214, 127, 400, 50);

        btnContinuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPantallaInicioSesion();
            }
        });

        frame.setVisible(true);
    }

    private void abrirPantallaInicioSesion() {
        JFrame pantallaInicioSesion = new JFrame("Inicio de Sesión");
        pantallaInicioSesion.setBounds(100, 100, 800, 600);
        pantallaInicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantallaInicioSesion.getContentPane().setLayout(null);

        JLabel lblBackground = new JLabel();
        lblBackground.setBounds(0, 0, 800, 600);
        lblBackground.setIcon(new ImageIcon("agencia.jpg")); // Replace with the path to your image
        pantallaInicioSesion.getContentPane().add(lblBackground);

        JLabel lblTitulo = new JLabel("Inicio de Sesión");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(200, 20, 400, 50);
        lblBackground.add(lblTitulo);

        JLabel lblUsuario = new JLabel("Nombre agencia:");
        lblUsuario.setFont(new Font("Arial", Font.PLAIN, 18));
        lblUsuario.setBounds(200, 150, 150, 30);
        lblBackground.add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 18));
        txtUsuario.setBounds(350, 150, 300, 30);
        lblBackground.add(txtUsuario);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setFont(new Font("Arial", Font.PLAIN, 18));
        lblContrasena.setBounds(200, 200, 150, 30);
        lblBackground.add(lblContrasena);

        JPasswordField txtContrasena = new JPasswordField();
        txtContrasena.setFont(new Font("Arial", Font.PLAIN, 18));
        txtContrasena.setBounds(350, 200, 300, 30);
        lblBackground.add(txtContrasena);

        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.setFont(new Font("Arial", Font.PLAIN, 18));
        btnIniciarSesion.setBounds(325, 300, 150, 50);
        lblBackground.add(btnIniciarSesion);

        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPantallaPrincipal();
                pantallaInicioSesion.dispose();
            }
        });

        JButton btnNuevaAgencia = new JButton("Nueva Agencia");
        btnNuevaAgencia.setFont(new Font("Arial", Font.PLAIN, 18));
        btnNuevaAgencia.setBounds(325, 400, 150, 50);
        lblBackground.add(btnNuevaAgencia);

        btnNuevaAgencia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirPantallaNuevaAgencia();
            }
        });

        pantallaInicioSesion.setVisible(true);
        frame.dispose();
    }

    private void abrirPantallaPrincipal() {
        JFrame pantallaPrincipal = new JFrame("Pantalla Principal");
        pantallaPrincipal.setBounds(100, 100, 800, 600);
        pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantallaPrincipal.getContentPane().setLayout(null);

        JLabel lblBackground = new JLabel();
        lblBackground.setBounds(0, 0, 800, 600);
        lblBackground.setIcon(new ImageIcon("background.jpg")); // Replace with the path to your image
        pantallaPrincipal.getContentPane().add(lblBackground);

        JLabel lblTitulo = new JLabel("Pantalla Principal");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(200, 20, 400, 50);
        lblBackground.add(lblTitulo);

        JLabel lblMensaje = new JLabel("Bienvenido a la aplicación");
        lblMensaje.setFont(new Font("Arial", Font.PLAIN, 18));
        lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
        lblMensaje.setBounds(200, 100, 400, 30);
        lblBackground.add(lblMensaje);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 18));
        btnSalir.setBounds(325, 400, 150, 50);
        lblBackground.add(btnSalir);

        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        pantallaPrincipal.setVisible(true);
    }

    private void abrirPantallaNuevaAgencia() {
        JFrame pantallaNuevaAgencia = new JFrame("Nueva Agencia");
        pantallaNuevaAgencia.setBounds(100, 100, 800, 600);
        pantallaNuevaAgencia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pantallaNuevaAgencia.getContentPane().setLayout(null);

        JLabel lblNombreAgencia = new JLabel("Nombre agencia:");
        lblNombreAgencia.setFont(new Font("Arial", Font.PLAIN, 18));
        lblNombreAgencia.setBounds(50, 50, 150, 30);
        pantallaNuevaAgencia.getContentPane().add(lblNombreAgencia);

        JTextField txtNombreAgencia = new JTextField();
        txtNombreAgencia.setFont(new Font("Arial", Font.PLAIN, 18));
        txtNombreAgencia.setBounds(200, 50, 300, 30);
        pantallaNuevaAgencia.getContentPane().add(txtNombreAgencia);

        JLabel lblColorMarca = new JLabel("Color de marca:");
        lblColorMarca.setFont(new Font("Arial", Font.PLAIN, 18));
        lblColorMarca.setBounds(50, 100, 150, 30);
        pantallaNuevaAgencia.getContentPane().add(lblColorMarca);

        JTextField txtColorMarca = new JTextField("#FFFFFF");
        txtColorMarca.setFont(new Font("Arial", Font.PLAIN, 18));
        txtColorMarca.setBounds(200, 100, 100, 30);
        pantallaNuevaAgencia.getContentPane().add(txtColorMarca);

        JLabel lblNumEmpleados = new JLabel("Número de empleados:");
        lblNumEmpleados.setFont(new Font("Arial", Font.PLAIN, 18));
        lblNumEmpleados.setBounds(50, 150, 200, 30);
        pantallaNuevaAgencia.getContentPane().add(lblNumEmpleados);

        JComboBox<String> cmbNumEmpleados = new JComboBox<>(new String[] {"Entre 2 y 10 empleados", "Entre 10 y 100 empleados", "Entre 100 y 1000 empleados"});
        cmbNumEmpleados.setFont(new Font("Arial", Font.PLAIN, 18));
        cmbNumEmpleados.setBounds(250, 150, 250, 30);
        pantallaNuevaAgencia.getContentPane().add(cmbNumEmpleados);

        JLabel lblTipoAgencia = new JLabel("Tipo de agencia:");
        lblTipoAgencia.setFont(new Font("Arial", Font.PLAIN, 18));
        lblTipoAgencia.setBounds(50, 200, 150, 30);
        pantallaNuevaAgencia.getContentPane().add(lblTipoAgencia);

        JComboBox<String> cmbTipoAgencia = new JComboBox<>(new String[] {"Agencia de viajes", "Agencia inmobiliaria", "Agencia de marketing"});
        cmbTipoAgencia.setFont(new Font("Arial", Font.PLAIN, 18));
        cmbTipoAgencia.setBounds(200, 200, 300, 30);
        pantallaNuevaAgencia.getContentPane().add(cmbTipoAgencia);

        JLabel lblLogo = new JLabel("Logo:");
        lblLogo.setFont(new Font("Arial", Font.PLAIN, 18));
        lblLogo.setBounds(50, 250, 150, 30);
        pantallaNuevaAgencia.getContentPane().add(lblLogo);

        JTextField txtLogo = new JTextField();
        txtLogo.setFont(new Font("Arial", Font.PLAIN, 18));
        txtLogo.setBounds(200, 250, 300, 30);
        pantallaNuevaAgencia.getContentPane().add(txtLogo);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Arial", Font.PLAIN, 18));
        btnGuardar.setBounds(150, 350, 150, 50);
        pantallaNuevaAgencia.getContentPane().add(btnGuardar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Arial", Font.PLAIN, 18));
        btnCancelar.setBounds(350, 350, 150, 50);
        pantallaNuevaAgencia.getContentPane().add(btnCancelar);

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantallaNuevaAgencia.dispose();
            }
        });

        pantallaNuevaAgencia.setVisible(true);
    }
}
