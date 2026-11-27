import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm {
    public static void main(String[] args) {
        // 1. Create the main window (JFrame)
        JFrame frame = new JFrame("User Input Form");
        frame.setSize(350, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centers the window on screen

        // 2. Create a panel with a GridLayout (4 rows, 2 columns, 10px gaps)
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // Padding

        // 3. Create the UI components
        JLabel nameLabel = new JLabel("Enter Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Enter Age:");
        JTextField ageField = new JTextField();

        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel("Result will appear here");

        // 4. Add action listener to handle button clicks
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String ageText = ageField.getText();

                // Basic validation and processing
                try {
                    int age = Integer.parseInt(ageText);
                    resultLabel.setText("Hello " + name + ", age " + age + "!");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Age must be a number.");
                }
            }
        });

        // 5. Add components to the panel in order (left-to-right, top-to-bottom)
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(new JLabel()); // Empty placeholder cell to align the button
        panel.add(submitButton);
        panel.add(new JLabel("Output:"));
        panel.add(resultLabel);

        // 6. Add panel to frame and make it visible
        frame.add(panel);
        frame.setVisible(true);
    }
}



// import javax.swing.*;
// public class SwingCheck {
// public static void main(String[] args) {
//     JFrame frame = new JFrame("JFrame");
//     frame.setSize(300,400);
//     JMenuBar mb = new JMenuBar();
//     JMenu menu, submenu;
//     JMenuItem i1,i2,i3,i4;
//     menu = new JMenu("Menu");
//     submenu = new JMenu("SubMenu");
//     i1 = new JMenuItem("Item 1");
//     i2 = new JMenuItem("Item 2");
//     i3 = new JMenuItem("Item 3");
//     i4 = new JMenuItem("Item 4");

//     menu.add(i1);
//     menu.add(i2);
//     submenu.add(i3);
//     submenu.add(i4);
//     menu.add(submenu);
//     mb.add(menu);
//     frame.setJMenuBar(mb);
//     // frame.setLayout(null); 
//     // JLabel l1 = new JLabel("Click the Button");
//     // l1.setBounds(100,100,100,30);
//     // JButton b1 = new JButton("Button");
//     // b1.setBounds(50,50,50,10);
//     // frame.add(l1);
//     // frame.add(b1);
//     frame.setVisible(true);
//     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }