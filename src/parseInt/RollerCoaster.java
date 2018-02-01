package parseInt;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String inchesString = JOptionPane.showInputDialog("How tall are you (in inches)?");
		int inches = Integer.parseInt(inchesString);
		
		if (inches >= 48) {
			JOptionPane.showMessageDialog(null, "Enjoy your ride!");
		} else {
			JOptionPane.showMessageDialog(null, "You need to be 48\" before you can ride.");
		}
	}
}
