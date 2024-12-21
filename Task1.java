import javax.swing.*;
import java.awt.*;

public class Task1 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Create the main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Panel for display fields (operation history and result)
        JPanel displayPanel = new JPanel(new GridLayout(2, 1));

        // Text field to display the operations performed
        JTextField operationField = new JTextField();
        operationField.setEditable(false);
        operationField.setHorizontalAlignment(SwingConstants.RIGHT);
        operationField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Text field to display the current result
        JTextField displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));

        // Add both fields to the display panel
        displayPanel.add(operationField);
        displayPanel.add(displayField);

        // Add display panel to the top of the main panel
        mainPanel.add(displayPanel, BorderLayout.NORTH);

        // Panel for numbers (left side)
        JPanel numberPanel = new JPanel(new GridLayout(4, 3, 5, 5));

        // Add number buttons to the number panel
        JButton[] numberButtons = new JButton[10];
        for (int i = 1; i <= 9; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            numberPanel.add(numberButtons[i]);
        }

        // Add the zero button in the center of the bottom row
        numberPanel.add(new JLabel("")); // Placeholder for centering "0"
        numberButtons[0] = new JButton("0");
        numberButtons[0].setFont(new Font("Arial", Font.PLAIN, 18));
        numberPanel.add(numberButtons[0]);
        numberPanel.add(new JLabel("")); // Placeholder for centering "0"

        mainPanel.add(numberPanel, BorderLayout.CENTER);

        // Panel for operations (right side)
        JPanel operationsPanel = new JPanel(new GridLayout(5, 1, 5, 5));

        // Create operator buttons
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton equalButton = new JButton("=");

        // Set font for operation buttons
        Font opFont = new Font("Arial", Font.BOLD, 18);
        addButton.setFont(opFont);
        subtractButton.setFont(opFont);
        multiplyButton.setFont(opFont);
        divideButton.setFont(opFont);
        equalButton.setFont(opFont);

        // Add operator buttons to the operations panel
        operationsPanel.add(addButton);
        operationsPanel.add(subtractButton);
        operationsPanel.add(multiplyButton);
        operationsPanel.add(divideButton);
        operationsPanel.add(equalButton);

        mainPanel.add(operationsPanel, BorderLayout.EAST);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Set frame visible
        frame.setVisible(false);
    }
}
