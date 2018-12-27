package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println();
	JOptionPane.showMessageDialog(null, "Hello!");
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hi "+ name);
}
}
