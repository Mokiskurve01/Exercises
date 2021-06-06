package Augen;

import java.awt.*;

public class Eye {
    private Point center;
    private int width;
    private int heigth;
    private int borderThickness;

    private Point pupilCenter;
    private int pupilWidth;
    private int pupilHeight;

    Eye(int x,int y, int width, int height, int borderThickness){
        this.center = new Point(x,y);
        this.width = width;
        this.heigth = height;
        this.borderThickness = borderThickness;
        this.pupilWidth = width /3;
        this.pupilHeight = height /3;
    }

    public void draw(Graphics g, Point mousePos, Point windowPos){
        g.setColor(new Color(0,0,0));
        g.fillOval(this.center.x - this.width / 2 - this.borderThickness , this.center.y -this.heigth / 2 - this.borderThickness, this.width +2*this.borderThickness, this.heigth + 2 * this.borderThickness);

        g.setColor(new Color(222,222,222));
        g.fillOval(this.center.x - this.width / 2, this.center.y - this.heigth / 2, this.width, this.heigth);

        CalculatePupilPos(mousePos, windowPos);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(this.pupilCenter.x -this.pupilWidth / 2, this.pupilCenter.y -this.pupilHeight / 2,this.pupilWidth,this.pupilHeight);
    }

    private void CalculatePupilPos(Point mpos, Point wPos){


        var mousePos = new Point(mpos.x - wPos.x, mpos.y - wPos.y);

        double adi = mousePos.x - this.center.x;
        double opp = mousePos.y - this.center.y;

        var hypo = Math.sqrt(Math.pow(adi,2) + Math.pow(opp,2));

        if(hypo > Math.max((this.width- this.pupilWidth)/2, (heigth-this.pupilHeight)/2))
            hypo = Math.max((this.width- this.pupilWidth)/2, (heigth-this.pupilHeight)/2);

        double alpha = 0;

        if (adi == 0)
        {
            if (opp <= 0)
                alpha = 270;
            else
                alpha = 90;
        }
        else
            alpha = Math.atan(opp/adi)*180 /Math.PI;

        if (adi < 0)
            alpha += 180;

        this.pupilCenter = new Point(
                (int)(center.x + Math.cos((Math.PI * alpha) / 180) * (this.width<this.heigth? hypo*this.width/this.heigth : hypo)),
                (int)(center.y + Math.sin((Math.PI * alpha) / 180) * (this.width>this.heigth? hypo*this.heigth/this.width : hypo)));
    }

}
