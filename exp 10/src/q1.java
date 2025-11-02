import javax.swing.*;

public class q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 180, 25);

        // Age
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 90, 100, 25);
        JTextField ageField = new JTextField();
        ageField.setBounds(150, 90, 180, 25);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 130, 100, 25);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 130, 70, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230, 130, 80, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        // Course
        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 170, 100, 25);
        String courses[] = {"BCA", "B.Sc", "B.Tech", "MCA"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 170, 120, 25);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 220, 100, 30);

        // Add 
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);
        frame.add(courseLabel);
        frame.add(courseBox);
        frame.add(submitButton);

        // Action on Submit Button
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            String gender = male.isSelected() ? "Male" :
                            (female.isSelected() ? "Female" : "Not selected");
            String course = courseBox.getSelectedItem().toString();

            JFrame display = new JFrame("Student Details");
            display.setSize(350, 250);
            display.setLayout(null);

            JLabel d1 = new JLabel("Name: " + name);
            d1.setBounds(50, 40, 250, 25);
            JLabel d2 = new JLabel("Age: " + age);
            d2.setBounds(50, 70, 250, 25);
            JLabel d3 = new JLabel("Gender: " + gender);
            d3.setBounds(50, 100, 250, 25);
            JLabel d4 = new JLabel("Course: " + course);
            d4.setBounds(50, 130, 250, 25);

            display.add(d1);
            display.add(d2);
            display.add(d3);
            display.add(d4);

            display.setVisible(true);
        });

        frame.setVisible(true);
    }
}
