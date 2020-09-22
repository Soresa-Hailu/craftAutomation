package classofmarch.com;

import java.io.FileReader;

public class TextFileReadingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileReader rd = new FileReader("C:\\Users\\Dj\\Desktop\\file\\labclass.txt");
			
			int val;
			while((val = rd.read()) != -1) {
				System.out.print((char)val);
			}
			rd.close();
		}
		catch(Exception e) {
		e.printStackTrace();
		}
		
		
	}

}
