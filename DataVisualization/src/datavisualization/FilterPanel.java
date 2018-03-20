import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FilterPanel extends JFrame implements ActionListener {
    List<Data> ls;
    public FilterPanel(List<Data> ls){
        this.ls = ls;
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(2,ls.size()/2));
        for(int i = 0;i<ls.size();i++){
            JButton b = new JButton(ls.get(i).getCategory());
            jp.add(b);
            b.addActionListener(this);
        }
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
                Data data = ls.get(i);
                System.out.println(data.getCategory() + " " + data.getValue1() + " "+data.getValue2() +" " + data.getValue3());
                break;
            }
        }
    }
}
