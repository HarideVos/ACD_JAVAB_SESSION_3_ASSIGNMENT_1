package threepointone;

public class Main {

		public static void main(String[] args){
			Birdie b1 = new Birdie("Owl", "White");
			
			Birdie b2 = new Birdie("Emu", "Brown");
			
			System.out.println("Birdie, b1, has instance variables: " + b1.name + " and " + b1.color + ".");
			System.out.println("Birdie, b2, has instance variables: " + b2.name + " and " + b2.color + ".");
			
			System.out.println("Both birds have the same class variables: canFly= " + Birdie.canFly+ " and Sings/chirps= " + Birdie.sings+ ".");

		}
}
