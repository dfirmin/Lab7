import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDictionary {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int studentLookup = -1;
		String studentInfo;

		System.out.println("Welcome to our Java class");
		while (studentLookup == -1) {

			try {
				System.out.println("Which student would you like to learn more about?");
				studentLookup = scnr.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Student does not exist. Please try again.(enter number 1-20.)");
				scnr.next();
			}

			catch (Exception e) {
				System.out.println("Student does not exist. Please try again.(enter number 1-20.");
				scnr.next();
			}
		}


		System.out.println("Student " + studentLookup + " is " + StudentLookup.getName(studentLookup) + "."
				+ " What would you like to know about " + StudentLookup.getName(studentLookup) + "?");
		scnr.nextLine();
		studentInfo = scnr.nextLine();
		if (studentInfo.equals("hometown")) {
			System.out
					.println(StudentLookup.getName(studentLookup) + " is from " + StudentLookup.getHome(studentLookup) + ".");
		}
		if (studentInfo.equals("favorite food")) {
			System.out.println(
					StudentLookup.getName(studentLookup) + " favorite food is " + StudentLookup.getFood(studentLookup) + ".");
		}

	}
}
