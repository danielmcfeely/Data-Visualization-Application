
package datavisualization;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;

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
        exportButton.addActionListener(this);
        add(exportButton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if(o == drawButton) {

        }
    }
    
}
