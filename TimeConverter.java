import java.util.Scanner;
public class TimeConverter {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in); 
		
		 
		
		System.out.println("Hello! Please enter a number of minutes: ");
		int number = key.nextInt();
		
		int hour = number / 60; 
		
		int min = number % 60; 
		
		System.out.println("The number you entered in minutes is:  " + hour + " hours and " + min + " minutes!" );

	}

}
