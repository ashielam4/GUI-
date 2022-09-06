package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combo implements ActionListener {

    int ct = 0;
    private JLabel label;
    private JPanel pan;
    private JFrame frame;

    public combo(){
         frame = new JFrame();
        JButton button = new JButton("Choose");
        button.addActionListener(this);
         label = new JLabel("# of options chosen: 0  ");
         pan = new JPanel();
        pan.setBorder(BorderFactory.createEmptyBorder(200,200,100,200));
        pan.setLayout(new GridLayout(0,1));
        pan.add(button);
        pan.add(label);

        frame.add(pan, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("COMBO BOX");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
       new combo();
    }
    public void actionPerformed(ActionEvent e){
        ct++;
        label.setText("# of options chosen:  "+ct);



    }
}
