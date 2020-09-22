package classofmarch.com;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TextFileWritingClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileWriter writer = new FileWriter("C:\\Users\\Dj\\Desktop\\file\\output1.txt");
			
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			bwriter.write("Hello there");
			bwriter.newLine();
			bwriter.write("good day2!");
		
			bwriter.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
