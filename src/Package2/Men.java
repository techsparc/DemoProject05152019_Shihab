package Package2;

public class Men extends HumanSpecies{
	
	public void height(int i) {
		
		if (i <= 180) {
			
			System.out.println("Height of Men is 6 feet");
			
		}else
		{
			System.out.println("Height of Men is less than 6 feet");
			
		}
	
	}
	
	public void frequencyOfSneezing(int f) {
		
		while(f <= 10) {
			
			System.out.println(f+" number of times I sneeze daily");
			f++;
			
		}
		
		
		
	}
	
	
	
	
	
	

}
