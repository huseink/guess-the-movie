import java.util.Arrays;
import java.util.Scanner;

public class Game {
	public static void main(String args[]) throws Exception {
		
		// Initializes the program with a welcoming and informing message
		welcome();
		
		// Creates a movie Object from the class Movies
		Movies moviesObj = new Movies();
		
		// using the getter method gets a random line(in this case a movie title) from a file 
		String generatedTitle = moviesObj.getRandomMovie();
		
		// Replaces all characters except 'spaces' with an underscore
		String generatedTitleRep = generatedTitle.replaceAll("[a-z]","_");

		// Creates a new StringBuilder object in order to use the setCharAt method on a string
		StringBuilder foundTitle = new StringBuilder(generatedTitleRep);
		
		// Creates a scanner object in order to get input from the user
		Scanner input = new Scanner(System.in);
		System.out.println();
		
		// Main guessing logic part
		int count = 10;
		for(int i = 10; i>=1;i--) {
			System.out.println("The movie title is "+ generatedTitle.length() +" letters long");
			System.out.println("Enter a letter: ");
			// gets a char input from the user
			char enteredChar = input.next().charAt(0);
			// if the random generated movie title contains the character
			if(generatedTitle.indexOf(Character.toString(enteredChar))>=0) {
				// finds the index(es) of the inputted char in the given string
				int[] indexes = indexesOf(generatedTitle,Character.toString(enteredChar));
				for(int j : indexes) {
					//If a match is found underscores are replaced with that char according to their indexes
					foundTitle.setCharAt(j, enteredChar);
					i++;
				}
			// Prints out the foundTitle
			System.out.println(foundTitle);
			}
			//If no match is found a warning is printed and the user loses points
			else {
				System.out.println("You have guessed wrong "+ count + "points left");
				System.out.println(foundTitle);
				count--;
			}
	
		}
	
	}
	
	// Prints out the welcoming and informing states
	private static void welcome() {
		System.out.println("Welcome!");
		System.out.println("Try to guess the name of the movie given below");
		System.out.println("If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point. ");
		System.out.println("If you lose 10 points, game over!");
		System.out.println();
	}
	
	// Finds the index or indexes (if the string contains more than one same character) of a character in a given string
	public static int[] indexesOf(String s, String flag) {
	    int flagLen = flag.length();
	    String current = s;
	    int[] res = new int[s.length()];
	    int count = 0;
	    int base = 0;
	    while(current.contains(flag)) {
	        int index = current.indexOf(flag);
	        res[count] = index + base;
	        base += index + flagLen;
	        current = current.substring(current.indexOf(flag) + flagLen, current.length());
	        ++ count;
	    }
	    return Arrays.copyOf(res, count);
	}
	
	
}
