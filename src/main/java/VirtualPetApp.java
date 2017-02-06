import java.util.Arrays;
import java.util.Scanner;

public class VirtualPetApp {
	
	public static void main(String[] args) {
		boolean quit = false;
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        
		
		Scanner scanner = new Scanner(System.in);
		VirtualPet romeo = new VirtualPet();
		System.out.println("Hello, my name is Romeo and I'm an Eclectus Parrot."
				+ " Your my new best friend!  Lets spend the day together.");
		
		printRomeo();
		
		System.out.print("So what speed are we going to use today? Enter a number between 1 an 9.");
		String input = scanner.next();
		int speed = Arrays.asList(numbers).indexOf(input);
		if (speed < 1) {
			System.out.println("I will be using a speed of 1 for you today.");
			speed = 1;
		}
		
		
		while (!quit) {

			System.out.println("What to you want to do with your pet now?");
			System.out.println("Your options are feed, water, play, clean, or quit.");
			input = scanner.next();
			System.out.println("Input = " + input);
		
			switch (input) {
			case ("feed"): romeo.feed(); break;
			case ("water"): romeo.water(); break;
			case ("play"): romeo.play(); break;
			case ("clean"): romeo.clean(); break;
			case ("quit"): quit = true; break;
			default: System.out.println("You didn't enter a valid option, but that's OK.");break;
				
			}
		
			if (!quit) romeo.tick(speed);
			
		}
		scanner.close();
		System.out.println("We had fun today!  Lets do it again sometime!");
		printRomeo();
	}

	private static void printRomeo() {
		System.out.println("        _______");
		System.out.println("   ,---/,-.    \\ ");
		System.out.println("  /    \\`-'     \\ ");
		System.out.println(" (  ___\\        \\ ");
		System.out.println("  \\/    /`        \\ ");
		System.out.println("       /   /    \\  \\ ");
		System.out.println("      /   /      \\  | ");
		System.out.println("      |  |        | | ");
		System.out.println("      \\  |        | / ");
		System.out.println("       \\ \\       / / ");
		System.out.println("        ;--,   .,--, ");
		System.out.println("_______||_|_|./|_|_||______"); 
		System.out.println("       `'-'-'  `-'-'` ");
		System.out.println("___________________________"); 
		System.out.println("       / / / ^ \\ \\ \\ ");
		System.out.println("      / / / / \\ \\ \\ \\ ");
		System.out.println("     '-/ / |   | \\ \\-' ");
		System.out.println("       \\_| |   | |_/ ");
		System.out.println("         `-'\\_/`-' ");
		
	}

}
