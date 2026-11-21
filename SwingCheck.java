import javax.swing.*;
public class SwingCheck {
public static void main(String[] args) {
String s = JOptionPane.showInputDialog("Enter a number:");
int n = Integer.parseInt(s.trim());
JFrame frame = new JFrame("Result");
frame.setSize(300, 120);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
JLabel label = new JLabel("Square of " + n + " = " + (n * n));
frame.add(label);
frame.setVisible(true); // always the last line
}
}