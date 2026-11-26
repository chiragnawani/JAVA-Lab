import javax.swing.*;
public class SwingCheck {
public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Enter n1: ");
        String s2 = JOptionPane.showInputDialog("Enter n2: ");
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        JFrame j = new JFrame("Sum Program");
        JOptionPane.showMessageDialog(j,"Sum = "+ (a+b));
        j.setVisible(true);
    }
}