package classofmarch.com;

public class IfElseStmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int testScore =55;
		String grade;

        if (testScore >= 90) {
            grade = "A";
        } 
        else if (testScore >= 80) {
            grade = "B";
        } 
        else if (testScore >= 70) {
            grade = "C";
        } 
        else if (testScore >= 60) {
            grade = "D";
        } 
        else if(testScore >= 55) {
        	grade = "FX";
        }
        else 
        {
            grade = "F";
        }
        System.out.println("Grade = " + grade);

	}

}
