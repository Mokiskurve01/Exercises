package Augen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Gui extends JPanel {

    private Eye leftEyeGyula = new Eye(116, 188, 52, 52, 1);
    private Eye rightEyeGyula = new Eye(202, 188, 52, 52,1);
    private Eye leftEyeDaniel = new Eye(1312, 160, 75, 45, 1);
    private Eye rightEyeDaniel = new Eye(1410, 163, 75, 45,1);


    public Gui() {
        try {
            var head = ImageIO.read(new File("C:/Users/DCV/IdeaProjects/Exercises/src/Augen/Image/dcv.png"));
            JLabel lbl = new JLabel(new ImageIcon(head));
            this.add(lbl);
        } catch (Exception ex){}

        this.setPreferredSize(this.getPreferredSize());
        setBackground(new Color(100,100,200,50));
        var timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {

        rightEyeGyula.draw(g, MouseInfo.getPointerInfo().getLocation(),getLocationOnScreen());
        leftEyeGyula.draw(g, MouseInfo.getPointerInfo().getLocation(), getLocationOnScreen());
        rightEyeDaniel.draw(g, MouseInfo.getPointerInfo().getLocation(),getLocationOnScreen());
        leftEyeDaniel.draw(g, MouseInfo.getPointerInfo().getLocation(), getLocationOnScreen());
    }

    class TimerAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

}