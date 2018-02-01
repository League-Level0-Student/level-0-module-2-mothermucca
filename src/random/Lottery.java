package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		Random random = new Random();
		String text = "";
		
		for (int i = 0; i < 5; i++){
			int r = random.nextInt(51) + 1;
			text += r;
			text += " ";
		}
		
		JOptionPane.showMessageDialog(null, text);
	}
}
