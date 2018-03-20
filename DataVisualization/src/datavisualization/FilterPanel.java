import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FilterPanel extends JFrame implements ActionListener {
    List<Data> ls;
    Graph gp;
    JPanel g;
    public FilterPanel(Graph gp,JPanel g){
        this.gp = gp;
        this.ls = gp.graphData;
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(2,ls.size()/2));
        for(int i = 0;i<ls.size();i++){
            JButton b = new JButton(ls.get(i).getCategory());
            jp.add(b);
            b.addActionListener(this);
        }
        this.g = g;
        this.add(jp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton o = (JButton)actionEvent.getSource();

        String name = o.getText();
        for(int i = 0; i < ls.size();i++) {
            if(name.equals(ls.get(i).getCategory())){
                drawBar(ls.get(i));
            }
            //earase(ls.get(i))
        }
    }
    private void drawBar(Data d){
        Graphics gr = g.getGraphics();
        int x = gp.margin;

            gr.setColor(Color.RED);
            gr.setFont(new Font("TimesRoman", Font.PLAIN, 28));
            gr.drawString(d.getCategory(), x, gp.margin + gp.maxHeight + 30);

            gr.setColor(Color.red);
            gr.fillRect(x, calculateY(d.getValue1()), gp.barWidth, calculateHeight(d.getValue1()));
            x += gp.barWidth;
            gr.setColor(Color.blue);
            gr.fillRect(x, calculateY(d.getValue2()), gp.barWidth, calculateHeight(d.getValue2()));
            x += gp.barWidth;
            gr.setColor(Color.green);
            gr.fillRect(x, calculateY(d.getValue3()), gp.barWidth, calculateHeight(d.getValue3()));

            x += gp.dataWidth;

    }
    public int calculateY(int value) {
        double maxValue = gp.maxValue;
        double val = value;
        return (int)Math.round(gp.margin + gp.maxHeight * ((maxValue - val)/maxValue));
    }

    public int calculateHeight(int value) {
        return gp.maxHeight*value/gp.maxValue;
    }
}
