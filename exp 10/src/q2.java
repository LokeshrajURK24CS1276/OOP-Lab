import javax.swing.*;

public class q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(450, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels and TextFields
        JLabel l1 = new JLabel("Enter First Number:");
        l1.setBounds(50, 50, 150, 25);
        JTextField t1 = new JTextField();
        t1.setBounds(200, 50, 180, 25);

        JLabel l2 = new JLabel("Enter Second Number:");
        l2.setBounds(50, 90, 150, 25);
        JTextField t2 = new JTextField();
        t2.setBounds(200, 90, 180, 25);

        // Buttons
        JButton addBtn = new JButton("Add");
        addBtn.setBounds(50, 140, 80, 30);

        JButton subBtn = new JButton("Subtract");
        subBtn.setBounds(140, 140, 100, 30);

        JButton mulBtn = new JButton("Multiply");
        mulBtn.setBounds(250, 140, 100, 30);

        JButton divBtn = new JButton("Divide");
        divBtn.setBounds(360, 140, 80, 30);

        // Button Actions
        addBtn.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                double result = num1 + num2;
                JOptionPane.showMessageDialog(frame, "Sum: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
            }
        });

        subBtn.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                double result = num1 - num2;
                JOptionPane.showMessageDialog(frame, "Difference: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
            }
        });

        mulBtn.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                double result = num1 * num2;
                JOptionPane.showMessageDialog(frame, "Product: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
            }
        });

        divBtn.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                if (num2 == 0)
                    JOptionPane.showMessageDialog(frame, "Error: Cannot divide by zero!");
                else
                    JOptionPane.showMessageDialog(frame, "Quotient: " + (num1 / num2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
            }
        });

        // Add all components to frame
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(addBtn);
        frame.add(subBtn);
        frame.add(mulBtn);
        frame.add(divBtn);

        frame.setVisible(true);
    }
}
