package test.com;




abstract class Figure {
	
	void calcArea(double length){
        double result = length * length;
        System.out.println("Area of rectangle is:"+result);
           }
      
      }  
//----------------------------------------------------------------------------------
class FigureImpl extends Figure{
   
}
//-----------------------------------------------------------------------------------
public class MainClass{
  public static void main(String args[]){
        FigureImpl fimpl = new FigureImpl();
        fimpl.calcArea(25);
      }
   }

