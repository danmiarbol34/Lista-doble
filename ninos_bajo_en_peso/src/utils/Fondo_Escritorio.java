/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author omar5
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class Fondo_Escritorio extends JDesktopPane {

    private Image imagen;

    public Fondo_Escritorio() {
        try {
            imagen = new ImageIcon(getClass().getResource("/img/ninos2.jpg")).getImage();
        } catch (Exception e) {
            System.err.println("No se pudo cargar la imagen: " + e.getMessage());
        }
    }

    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
        setOpaque(false);
        super.paint(g);
    }
}
