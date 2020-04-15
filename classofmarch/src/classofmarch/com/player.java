package classofmarch.com;



class Music{
	
	Music()
	{
		System.out.println("Music:: Initializing song..");
	}
	
	public void play() 
	{
		System.out.println("Music:: Playing music...");
	}
}


class Sony extends Music {
	
	Sony()
	{
		System.out.println("Sony operations ..");
	}
	
	@Override 
	public void play() 
	{
		System.out.println("Sony:: Playing music... ");
	}
}


class Panasonic extends Music{
		Panasonic()
		{
		System.out.println("Panasonic Operations ...");
	}
}


public class player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Sony ::");
		Sony s = new Sony();
		s.play();
		
		System.out.println("\n Panasonic :: ");
		Panasonic p = new Panasonic();
		p.play();
		
		
	}

}
