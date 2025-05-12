package Modelo;

import java.io.*;

public class Modelo {

    public boolean validarCredenciales(String usuario, String contrasena) {
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2 && partes[0].equals(usuario) && partes[1].equals(contrasena)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Archivo no encontrado.");
        }
        return false;
    }

    public void registrarUsuario(String usuario, String contrasena) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            writer.write(usuario + "," + contrasena);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int obtenerNumeroDias(String mes) {
        return switch (mes) {
            case "Enero", "Marzo", "Mayo", "Julio", "Agosto", "Octubre", "Diciembre" -> 31;
            case "Febrero" -> 28;
            case "Abril", "Junio", "Septiembre", "Noviembre" -> 30;
            default -> 0;
        };
    }
}