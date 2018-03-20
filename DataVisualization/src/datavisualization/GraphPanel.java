package datavisualization;


import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class GraphPanel extends JPanel{
 
    public GraphPanel()
    {
        drawGraph();
        drawGraphLabels();
    }
    
    public void drawGraph() {
            Graphics g = getGraphics();
            g.setColor(Color.BLACK);
            g.drawRect(100, 100, 1800, 1000);
            g.drawLine(100, 200, 1900, 200);
            g.drawLine(100, 300, 1900, 300);
            g.drawLine(100, 400, 1900, 400);
            g.drawLine(100, 500, 1900, 500);
            g.drawLine(100, 600, 1900, 600);
            g.drawLine(100, 700, 1900, 700);
            g.drawLine(100, 800, 1900, 800);
            g.drawLine(100, 900, 1900, 900);
            g.drawLine(100, 1000, 1900, 1000);
        }

        public void drawGraphLabels() {
            Graphics g = getGraphics();
            g.setColor(Color.red);
            g.drawString("0", 50, 1100);
            g.drawString("10", 50, 1000);
            g.drawString("20", 50, 900);
            g.drawString("30", 50, 800);
            g.drawString("40", 50, 700);
            g.drawString("50", 50, 600);
            g.drawString("60", 50, 500);
            g.drawString("70", 50, 400);
            g.drawString("80", 50, 300);
            g.drawString("90", 50, 200);
            g.drawString("100", 50, 100);
        }
}
