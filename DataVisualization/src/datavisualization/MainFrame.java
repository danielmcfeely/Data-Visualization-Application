
package datavisualization;

import javax.swing.JFrame;



public class MainFrame extends JFrame{
    public MainFrame()
    {
        super("Data Visualization");
        
        ButtonPanel bp = new ButtonPanel();
        
        getContentPane().add(bp);
        
        setSize(2000, 1500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
