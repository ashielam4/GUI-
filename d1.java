
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class d1 extends JFrame implements ActionListener {
    JComboBox comboBox;
    d1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"zebra","ape","Orangutan"};
       comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.addItem("horse");
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
            if(e.getSource()==comboBox){
                System.out.println(comboBox.getSelectedIndex());
                System.out.println(comboBox.getSelectedItem());

            }

    }
}
