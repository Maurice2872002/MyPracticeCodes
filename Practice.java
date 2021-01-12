package Practice;
import java.util.Scanner;

public class Practice {
	public static void main (String[]args) {  
		
		Scanner UserInput = new Scanner (System.in); 
		
		
		System.out.println("Answer the questions, I will try to guess your favourite chocolate.");
		System.out.println("Note: Type in all lowercases."); 
		System.out.println("Colour: ");
		System.out.println("Taste: ");
		
		String color = "";
		color = UserInput.next();
		
		String taste = "";
		taste = UserInput.next();
		
	
		
		if (color.equals("white") && taste.equals("sweet")) {
			System.out.println("Is it white chocolate?");
			System.out.println("Answer: ");
			
			String answer = "";
			answer = UserInput.next();
				if (answer.equals("yes")) {
					System.out.print("Yayyy I got it right!");
				}else if(answer.equals("no")){
					System.out.print("Welp I guess I try again.");
				}else {
					System.out.print("There must be something wrong. Please try again");
				}
		
		}else if (color.equals("brown") && taste.equals("sweet")) {
			System.out.println("Is it normal chocolate?");
			
			String answer = "";
			answer = UserInput.next();
				if (answer.equals("yes")) {
					System.out.print("Yayyy I got it right!");
				}else if(answer.equals("no")){
					System.out.print("Welp I guess I try again.");
				}else {
					System.out.print("There must be something wrong. Please try again");
				}
		
		}else if (color.equals("black") && taste.equals("bitter")) {
			System.out.println("Is it dark chocolate?");
			
			String answer = "";
			answer = UserInput.next();
				if (answer.equals("yes")) {
					System.out.print("Yayyy I got it right!");
				}else if(answer.equals("no")){
					System.out.print("Welp I guess I try again.");
				}else {
					System.out.print("There must be something wrong. Please try again");
				}
		}
		else {
			System.out.println("I'm sorry, there must be something wrong. Please try again.");
		}
		
		
	}
}
