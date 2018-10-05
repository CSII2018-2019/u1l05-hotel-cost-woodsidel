import javax.swing.JOptionPane;
public class U1L05HotelCost {

	public static void main(String[] args) {
		int marriottOrig = 200;
		int marriott = 200;
		int hiltonOrig = 150;
		int hilton = 150;
		int hyattOrig = 100;
		int hyatt = 100;
		int fourSeasonsOrig = 50;
		int fourSeasons = 50;
		String nightsNum = null;
		int numNights = 0;
		String stars1 = "";
		String stars2 = "";
		String stars3 = "";
		String stars4 = "";
		String hotel = "";
		JOptionPane.showMessageDialog(null, "Welcome to the Hotel Cost Calculator!");
		while(numNights == 0) {
			nightsNum = JOptionPane.showInputDialog("How many nights are you staying?");
			numNights = Integer.parseInt(nightsNum);
		}
		while(marriott>0) {
			marriott -= 50;
			stars1 = stars1 + "*";
			marriottOrig *= numNights; 
		}		
		JOptionPane.showMessageDialog(null, "Marriott: "+ stars1);
		while(hilton>0) {
			hilton -= 50;
			stars2 =  stars2+ "*";
			hiltonOrig *= numNights; 
		}
		JOptionPane.showMessageDialog(null, "Hilton: "+ stars2);
		while(hyatt>0) {
			hyatt -= 50;
			stars3 =  stars3+ "*";
			hyattOrig *= numNights; 
		}
		JOptionPane.showMessageDialog(null, "Hyatt: "+ stars3);
		while(fourSeasons>0) {
			fourSeasons -= 50;
			stars4 =  stars4+ "*";
			fourSeasonsOrig *= numNights;
		}
		JOptionPane.showMessageDialog(null, "Four Seasons: "+ stars4);
		hotel = JOptionPane.showInputDialog("Where do you want to stay? (Write with capital first letter)");
		if (hotel == "Marriott") {
			JOptionPane.showMessageDialog(null, "A "+nightsNum+" night stay at "+hotel+" is "+ marriottOrig);
		}
		if (hotel == "Hilton") {
			JOptionPane.showMessageDialog(null, "A "+nightsNum+" night stay at "+hotel+" is "+ hiltonOrig);
			
		}
		if (hotel == "Hyatt") {
			JOptionPane.showMessageDialog(null, "A "+nightsNum+" night stay at "+hotel+" is "+ hyattOrig);	
		}
		if (hotel == "Four Seasons") {
			JOptionPane.showMessageDialog(null, "A "+nightsNum+" night stay at "+hotel+" is "+ fourSeasonsOrig);	
		}

	}

}

		

		
		
	

