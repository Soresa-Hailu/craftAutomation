package classofmarch.com;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] stud =  {{50,65,70},{55 ,68,75},{57,61,78},{59 ,60,71},{67,90},{59 ,60,71,85}};

		for(int i=0; i<stud.length; i++) {
			System.out.println("Student : " + i);
			
			for(int j=0; j<stud[i].length; j++)
			{
				System.out.println(stud[i][j]);
			}
			System.out.println();
		}
	}

}
