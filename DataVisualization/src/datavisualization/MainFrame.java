
package datavisualization;

import javax.swing.JFrame;



public class MainFrame extends JFrame{
    public MainFrame()
    {
        super("Data Visualization");
        ButtonPanel bp = new ButtonPanel();
        getContentPane().add(bp);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
