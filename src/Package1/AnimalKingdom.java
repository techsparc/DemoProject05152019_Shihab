package Package1;

public class AnimalKingdom {
	
	AnimalKingdom(){
		
		System.out.println("This is a default constructor");
		
	}
	
	AnimalKingdom(String ak){
			
		System.out.println("This is a parameterized constructor");
	}

	int num = 0;

	public void snake() {

		System.out.println("Print Snake from Animal Kingdom Class");
		num = 100; //what does happen when i declare the value of num from 0 to 100.
		System.out.println(num+" of snakes are left in the world");
	}

	public int elephant(int i) {

		System.out.println("Print elephant from Animal Kingdom Class");
		num = 2000;
		i = num / 5;
		return i;
	}

	public void eagles(double a, double b) {

		a = num/2;
		num= 1000;
		b = num*a;

		System.out.println(b+" is the default value of local variable");
		System.out.println("Print chicken from Animal Kingdom Class");

	}

	public void eagles() {

		System.out.println("Print eagles from AnimalKingdom Class");
	}

}
