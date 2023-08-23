

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.*;
import java.awt.event.*;


 public class simpleGUI{

 public simpleGUI(){

    JFrame f = new JFrame("Our first GUI Application");
    f.setSize(500, 150);

    JTextField ourTextField = new JTextField();
    JButton ourButton = new JButton();
    ourButton.setText("show TF");
    ourButton.setForeground(Color.BLUE);

    JTextField ourTextField2 = new JTextField();
    JButton button2 =new JButton();
    button2.setText("Show TF2");
    button2.setForeground(Color.RED);


    f.add(ourTextField);
    f.add(ourButton);

    f.add(ourTextField2);
    f.add(button2);

    f.setLayout(new GridLayout(2,4));
    f.setVisible(true);

    ourButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         System.out.println(ourTextField.getText());
        }
    });

    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println(ourTextField2.getText());
        }
    });


    System.out.println(ourTextField.getText());
    System.out.println(ourTextField2.getText());
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


 public static void main(String[] args) {
    new simpleGUI();

    
}
}