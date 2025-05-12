package controlador;

import javax.swing.*;

import Modelo.Modelo;
import Vista.Vista;

public class controlador {

    private final Modelo modelo;
    private final Vista vista;

    public controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        mostrarVentanaLogin();
    }

    private void mostrarVentanaLogin() {
        JFrame frame = vista.crearVentana("Login de Usuario", 400, 250);
        JPanel panel = vista.crearPanelGrid(4, 1, 10, 10);

        JTextField usuarioField = vista.crearCampoTexto();
        JPasswordField contrasenaField = vista.crearCampoContrasena();

        panel.add(vista.crearEtiqueta("Usuario:"));
        panel.add(usuarioField);
        panel.add(vista.crearEtiqueta("Contraseña:"));
        panel.add(contrasenaField);

        JPanel botonesPanel = new JPanel();
        JButton loginBtn = vista.crearBoton("Entrar");
        JButton registerBtn = vista.crearBoton("Registrarse");
        botonesPanel.add(loginBtn);
        botonesPanel.add(registerBtn);
        panel.add(botonesPanel);

        frame.add(panel);
        frame.setVisible(true);

        loginBtn.addActionListener(e -> {
            String usuario = usuarioField.getText();
            String contrasena = new String(contrasenaField.getPassword());
            if (modelo.validarCredenciales(usuario, contrasena)) {
                JOptionPane.showMessageDialog(frame, "Ingreso exitoso");
                frame.dispose();
                mostrarPantallaMeses();
            } else {
                JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos");
            }
        });

        registerBtn.addActionListener(e -> {
            String usuario = usuarioField.getText();
            String contrasena = new String(contrasenaField.getPassword());
            if (!usuario.isEmpty() && !contrasena.isEmpty()) {
                modelo.registrarUsuario(usuario, contrasena);
                JOptionPane.showMessageDialog(frame, "Usuario registrado");
            } else {
                JOptionPane.showMessageDialog(frame, "Completa ambos campos");
            }
        });
    }

    private void mostrarPantallaMeses() {
        JFrame frame = vista.crearVentana("Matriz Meses", 500, 400);
        JPanel panel = vista.crearPanelGrid(3, 4, 10, 10);

        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        for (String mes : meses) {
            JButton button = vista.crearBoton(mes);
            button.addActionListener(e -> mostrarDias(mes));
            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    private void mostrarDias(String mes) {
        int numDias = modelo.obtenerNumeroDias(mes);
        JFrame frame = vista.crearVentana("Días de " + mes, 500, 350);
        JPanel panel = vista.crearPanelGrid(0, 7, 5, 5);

        for (int i = 1; i <= numDias; i++) {
            JButton diaButton = vista.crearBoton(String.valueOf(i));
            panel.add(diaButton);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}