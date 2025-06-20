package java8;

import javax.swing.*;
import java.awt.*;

public class test3 {

    public static void main(String[] args) {

        JFrame frame=new JFrame("My Window");

        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        //create button

        JButton button=new JButton("Click me");
        frame.add(button);

        button.addActionListener(e->{

            System.out.println("Button was clicked..");
            JOptionPane.showMessageDialog(null,"Hay ,Button was Clicked");
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
