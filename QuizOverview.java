import javax.swing.*;
import java.awt.*;

public class QuizOverview extends JFrame {
    
    public QuizOverview() {
        setTitle("Quiz Overview");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel for the content
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Use BoxLayout to align components vertically
        
        // Add Title
        JLabel titleLabel = new JLabel("Quiz Overview");
        titleLabel.setForeground(Color.WHITE); // Set text color to white
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Set font and size
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Align to the center horizontally
        titleLabel.setOpaque(true); // Enable background color for titleLabel
        titleLabel.setBackground(Color.GREEN); // Set green background color for titleLabel
        Dimension panelSize = panel.getPreferredSize(); // Get the size of the panel
        titleLabel.setPreferredSize(new Dimension(panelSize.width, 40)); // Set preferred size for titleLabel to match the width of the panel
        panel.add(titleLabel);
        
        

        // Add space between titleLabel and input fields
        panel.add(Box.createVerticalStrut(10));

        // Create input field for number of questions
        JLabel questionLabel = new JLabel("How many questions are you going to create?");
        questionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(questionLabel);
        JTextField questionField = new JTextField();
        questionField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(questionField);

         // Add space between components
         panel.add(Box.createVerticalStrut(5));

        // Create input field for quiz duration
        JLabel durationLabel = new JLabel("How long will the whole quiz run?");
        durationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(durationLabel);
        JTextField durationField = new JTextField();
        durationField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(durationField);

        // Add panel to the frame
        add(panel);

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create and display the QuizOverview window
        SwingUtilities.invokeLater(() -> {
            QuizOverview quizOverview = new QuizOverview();
            quizOverview.setVisible(true);
        });
    }
}