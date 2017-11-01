
public class StudentLookup {

	public static String getHome(int num) {
		String studentHome [] =  new String [3];
		studentHome[0] = "Detroit";
		studentHome[1] = "Shelby";
		studentHome[2] = "Macomb";
		return studentHome[num];		
	}
	
	public static String getName (int num) {
		String studentName [] = new String [3];
		studentName [0] = "DeAnte Firmin";
		studentName [1] = "Dave Gnuit";
		studentName [2] = "Kyle Smith";
		return studentName[num];
	}
	
	public static String getFood (int num) {
		String studentFood [] = new String [3];
		studentFood[0] = "Fish";
		studentFood[1] = "Chicken";
		studentFood[2] = "Steak";
		return studentFood[num];
	}
	
	
}
