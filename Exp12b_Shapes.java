import java.awt.*;
import java.applet.*;
public class Exp12b_Shapes extends Applet {
public void paint(Graphics g){
int xpoints[] = {10, 15, 10, 150, 10};
int ypoints[] = {200, 200, 300, 300, 200};
int num = 5;

g.drawLine(80, 20, 20, 80);
g.drawRect(100, 20, 100, 80);
g.fillRoundRect(210, 20, 100, 80,0,0);
g.drawRoundRect(320, 20, 100, 80, 20, 20);
g.drawOval(440, 20, 100, 50);
g.drawPolygon(xpoints, ypoints, num);
g.fillArc(200, 200, 70, 90, 0, 270);
g.fillOval(310, 200, 100, 100);
g.drawArc(200, 80, 80, 80, 0, 180);
} 
}

