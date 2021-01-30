import java.applet.*;
import java.awt.*;
import java.awt.geom.Arc2D;

/** * Created by Aleksandr on 14.03.2017. */
public class AppletClass extends Applet{
    public void init(){
        setSize(400,400);
    }
    public void paint (Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(100,100,200,200);
        g.setColor(Color.red);
        g.fillOval(150,140,18,18);
        g.fillOval(230,140,18,18);
        g.setColor(Color.black);
        g.drawOval(150,140,18,18);
        g.drawOval(230,140,18,18);
        g.setColor(Color.BLACK);
        g.drawOval(100,100,200,200);
        g.setColor(Color.red);
        g.fillArc(165,220,70,30,180,180);
        g.setColor(Color.black);
        g.drawArc(165,220,70,30,180,180);
    }
}