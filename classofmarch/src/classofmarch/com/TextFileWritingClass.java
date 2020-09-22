package classofmarch.com;

import java.io.FileWriter;

public class TextFileWritingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileWriter writer = new FileWriter("C:\\Users\\Dj\\Desktop\\file\\output3.txt",true);
			
			
			writer.write("Hello WORLD");
			writer.write("\n");
			writer.write("good day1");
			writer.write("\n");
			
			writer.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
