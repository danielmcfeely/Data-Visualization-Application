

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel; 
import javax.swing.JFileChooser;
import java.awt.Font;

public class ButtonPanel extends JPanel implements ActionListener{
    JButton selectButton = null;
    JButton drawButton = null;
    JButton filterButton = null;
    JButton exportButton = null;
    private Graph graph;
    
    public ButtonPanel (Graph graph)
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
        exportButton.addActionListener(this);
        add(exportButton);
        
        this.graph = graph;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if(o == drawButton) {
            drawGraph();
        }
        
        else if(o == selectButton) {
            JFileChooser fc = new JFileChooser();
            if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                graph.graphData = Import.importData(fc.getSelectedFile().getAbsolutePath());
            }
        }
        
        else if(o == filterButton) {
            //Jiangyue - Criteria Selection
            CriteriaSelection_associated ca = new CriteriaSelection_associated(graph.graphData);
            ca.display();
        }
        
        else if(o == exportButton) {
            //Collin - Export jpeg screenshot
        }
    }
    public void drawGraph() {
            Graphics g = getGraphics();
            g.setColor(Color.BLACK);
            g.drawRect(100, 100, graph.maxWidth, graph.maxHeight);
            
            for(int i = 100; i < 1100; i += 100)
            {
                g.drawLine(100, i, 1900, i);
            }
            drawGraphLabels();
            drawLegend();
            drawBars();
        }

        public void drawGraphLabels() {
            Graphics g = getGraphics();
            g.setColor(Color.red);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 28));
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
        
    public int calculateY(int value) {
        double maxValue = graph.maxValue;
        double val = value;
        return (int)Math.round(graph.margin + graph.maxHeight * ((maxValue - val)/maxValue));
    }
    
    public int calculateHeight(int value) {
        return graph.maxHeight*value/graph.maxValue;
    }
    
    public void drawBars() {
        Graphics g = getGraphics();
        int x = graph.margin;
        
        for(Data d : graph.graphData) {
            g.setColor(Color.RED);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 28));
            g.drawString(d.getCategory(), x, graph.margin + graph.maxHeight + 30);
            
            g.setColor(Color.red);
            g.fillRect(x, calculateY(d.getValue1()), graph.barWidth, calculateHeight(d.getValue1()));
            x += graph.barWidth;
            g.setColor(Color.blue);
            g.fillRect(x, calculateY(d.getValue2()), graph.barWidth, calculateHeight(d.getValue2()));
            x += graph.barWidth;
            g.setColor(Color.green);
            g.fillRect(x, calculateY(d.getValue3()), graph.barWidth, calculateHeight(d.getValue3()));
            
            x += graph.dataWidth;
        }
    }
    
    public void drawLegend() {
        Graphics g = getGraphics();
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1700, 100, 200, 200);
        
        g.setColor(Color.red);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 28));
        g.drawString("Town 1", 1750, 140);
        g.setColor(Color.blue);
        g.drawString("Town 2", 1750, 200);
        g.setColor(Color.green);
        g.drawString("Town 3", 1750, 260);
    }
}
