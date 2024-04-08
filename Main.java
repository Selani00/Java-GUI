import javax.swing.*;
import java.awt.*; // To import color class


class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        frame.setTitle("First GUI App");

        frame.setSize(420, 420);

        // to treminate the window by closing the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        frame.setVisible(true);

        // to give color
        frame.getContentPane().setBackground(new Color(46,156,188));
    }
}