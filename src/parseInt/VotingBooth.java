package parseInt;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String yearsString = JOptionPane.showInputDialog("How old are you?");
		int years = Integer.parseInt(yearsString);
		
		if (years >= 18) {
			JOptionPane.showInputDialog("Who should be the next president?");
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	}
}
