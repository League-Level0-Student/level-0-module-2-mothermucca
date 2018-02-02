package extra;

public class SpudCounter {
	public static void main(String[] args) {
		String song = "";
		for (int potatoes = 1; potatoes <= 8; potatoes++) {
			if (potatoes > 7) {
				song += "more";
				System.out.println(song);
				song = "";
			} else if (potatoes == 4) {
				song += "4";
				System.out.println(song);
				song = "";
			} else {
				song += "" + potatoes + " potato, ";
			}
		}
	}
}
