
package datavisualization;

import java.util.List;
import javax.swing.JFrame;



public class MainFrame extends JFrame{
    public MainFrame()
    {
        super("Data Visualization");
        
        //List<Data> graphData = Import.importData();
        Graph barGraph = new Graph();
        ButtonPanel bp = new ButtonPanel(barGraph);
        
        getContentPane().add(bp);
        
        setSize(2000, 1500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
    }
}
