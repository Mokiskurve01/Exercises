package AugenDaniel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Gui extends JPanel {

    private Eye leftEyeDaniel = new Eye(203, 235, 75, 45, 1);
    private Eye rightEyeDaniel = new Eye(303, 238, 75, 45,1);


    public Gui() {
        try {
            var head = ImageIO.read(new File("./Image/daniel.png"));
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