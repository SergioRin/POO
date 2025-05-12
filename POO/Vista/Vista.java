package Vista;

import javax.swing.*;
import java.awt.*;

public class Vista {

    public JFrame crearVentana(String titulo, int ancho, int alto) {
        JFrame frame = new JFrame(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(ancho, alto);
        frame.setLocationRelativeTo(null);
        return frame;
    }

    public JPanel crearPanelGrid(int filas, int columnas, int hgap, int vgap) {
        return new JPanel(new GridLayout(filas, columnas, hgap, vgap));
    }

    public JButton crearBoton(String texto) {
        return new JButton(texto);
    }

    public JLabel crearEtiqueta(String texto) {
        return new JLabel(texto, SwingConstants.CENTER);
    }

    public JTextField crearCampoTexto() {
        return new JTextField();
    }

    public JPasswordField crearCampoContrasena() {
        return new JPasswordField();
    }
}