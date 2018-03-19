
package datavisualization;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class ButtonPanel extends JPanel implements ActionListener{
    JButton selectButton = null;
    JButton drawButton = null;
    JButton filterButton = null;
    JButton exportButton = null;
    
    public ButtonPanel ()
    {
        selectButton = new JButton("Select File");
        selectButton.addActionListener(this);
        add(selectButton);
        
        drawButton = new JButton("Draw Graph");
        drawButton.addActionListener(this);
        add(drawButton);
        
        filterButton = new JButton("Filter Data");
        filterButton.addActionListener(this);
        add(filterButton);
        
        exportButton = new JButton("Export Graph");
        exportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                // capture the whole screen
                BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );

                // Save as JPEG
                File file = new File("screencapture.jpg");
                ImageIO.write(screencapture, "jpg", file);
                }
                catch (AWTException f){
                    System.err.println(f);
                }
                catch (IOException x){
                    System.err.println(x);
                }
            }
        });
        add(exportButton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if(o == drawButton) {
            drawGraph();
            drawGraphLabels();
        }
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
