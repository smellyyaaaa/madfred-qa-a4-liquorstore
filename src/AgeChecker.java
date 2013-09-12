import javax.swing.JOptionPane;


public class AgeChecker {

	public static void main(String[] args) {
		//prompts the user for information first and last name and year of birth
		String firstName = JOptionPane.showInputDialog(null, "What is your First name?");	
		String lastName = JOptionPane.showInputDialog(null, "What is your Last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?"));	
			
			//call the functions verify age and concatenate names
			boolean oldEnough = verifyLegalAge(yearOfBirth);
			String fullName = concatenateNames(firstName, lastName);
	
			
			//provides output corresponding to verify age
			if(oldEnough == true) {
				JOptionPane.showMessageDialog(null,  fullName + ". you may proceed with your shopping");
			}
			else {
				JOptionPane.showMessageDialog(null,  fullName + ". you may not proceed with your shopping");
			}
			
			
			}
			//gets the year of birth an int and determins if the person is 19 or older and returns a boolean vaklue
		public static boolean verifyLegalAge(int yob) {
			boolean legalAgeStatus = (2013-yob) >= 19;
			return legalAgeStatus;
		}
		//gets the first and last name 2 strings and concatenates them and returns one string
		public static String concatenateNames(String fn, String ln) {
			String fullName = fn + " " + ln;
			return fullName; 
		}
	}


