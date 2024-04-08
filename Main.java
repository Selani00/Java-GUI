import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*; // To import color class

class MyFrame extends JFrame{
    JLabel label;
    JButton button;

    MyFrame(){
        label = new JLabel();
        label.setText("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        


        button = new JButton();
        button.setText("Click Me");
        


        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);


    }

}



class Main{
    public static void main(String[] args){
        //boarder object
        // Border border= BorderFactory.createLineBorder(Color.green,3);

        // // To set the label
        // JLabel label = new JLabel();
        // label.setText("Hello World");

        // // To set the alignment of the text
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setVerticalAlignment(JLabel.TOP);
        // label.setForeground(new Color(46,156,188)); // To set the color of the text
        // label.setBorder(border);




        MyFrame frame = new MyFrame();
        
        frame.setTitle("First GUI App");

        frame.setSize(420, 420);

        // to treminate the window by closing the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        // to give color
        // frame.getContentPane().setBackground(new Color(46,156,188));

        // frame.add(label);


       
    }
}