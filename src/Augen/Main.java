package Augen;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        var gui = new Gui();
        final var window = new JWindow();
        window.setBackground(new Color(0,0,0,0));
        window.getContentPane().add(gui);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.isAlwaysOnTop();
    }
}